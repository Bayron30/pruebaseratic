
package com.pruebatec.controller.usuario;

import com.pruebatec.models.Conexion;
import com.pruebatec.models.Usuario;
import com.pruebatec.models.Util;
import static com.pruebatec.models.Util.Desencriptar;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Edinson
 */
@Controller 
@RequestMapping("edituser.htm")
public class EditarUserController {
    private JdbcTemplate jdbcTemplate;

    public EditarUserController() {
        Conexion con = new Conexion();
        this.jdbcTemplate = new JdbcTemplate(con.conectar());
    }
    
    @GetMapping
    public ModelAndView edituser(HttpServletRequest request) throws Exception{
        HttpSession session = request.getSession();
        String sesion = (String)session.getAttribute("session");
        
        if (sesion == "si"){
            ModelAndView mav = new ModelAndView();
            String id=request.getParameter("id");
            Usuario datos = this.selectUser(id);
            String desencriptado = Desencriptar(datos.getContrasena());//desencripto la contraseña
            mav.setViewName("usuario/edituser");
            mav.addObject("usuario",new Usuario(id,datos.getNombre(),datos.getUsuario(),desencriptado,datos.getTipo(),datos.getFechaRegistro()));
            return mav;  
       } else {
            return new ModelAndView("redirect:/login.htm");  
       }    
        
        
    }
    
    @PostMapping
    public ModelAndView edituser(@ModelAttribute("usuario") Usuario u,
                                BindingResult result,
                                HttpServletRequest request){
            String pass = Util.Encriptar(u.getContrasena());   
            String id=request.getParameter("id");
            this.jdbcTemplate.update(
                    "UPDATE usuarios "
                    + "set nombre_usuario=?,"
                    + "apellido_usuario=?,"
                    + "usuario_usuario=?,"
                    + "clave_usuario=?,"
                    + "tipo_usuario=?,"
                    + "fecha_usuario=?"
                    + "where "
                    + "idusuario=?",                    
                    u.getNombre(), u.getApellido(),u.getUsuario(),pass,u.getTipo(),u.getFechaRegistro(),id);
            return new ModelAndView("redirect:/user.htm");
        
    }
    
    public Usuario selectUser(String cedula){
        final Usuario user = new Usuario();
        String sql = "SELECT * FROM universidad.usuarios WHERE idusuario='"+cedula+"'";
        return (Usuario) jdbcTemplate.query(sql, new ResultSetExtractor<Usuario>(){
            public Usuario extractData(ResultSet rs) throws SQLException, DataAccessException{
                if(rs.next()){
                    user.setIdusuario(rs.getString("idusuario"));
                    user.setNombre(rs.getString("nombre"));
                    user.setApellido(rs.getString("apellido"));
                    user.setUsuario(rs.getString("usuario"));
                    user.setContrasena(rs.getString("contrasena"));
                    user.setTipo(rs.getString("tipo")); 
                    user.setFechaRegistro(rs.getString("fecha"));
                }
                return user;
            }
        }  );
    }
    
}