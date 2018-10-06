<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
    <html>
        <head>
            <meta charset="UTF-8">
            <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
            <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.5/css/materialize.min.css">
            <!-- css -->
            <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
            <link href="<c:url value='/css/materialize.css'/>" type="text/css" rel="stylesheet" media="screen,projection"/>
            <link href="<c:url value='/css/style.css'/>" type="text/css" rel="stylesheet" media="screen,projection"/>
            <title>Usuario</title>
            </head>
        <body>
             <nav class="blue-grey">
                <div class="nav-wrapper">
                    <a href="home.htm" class="brand-logo"><span class="lime-text text-accent-1">Prueba Seratic</span></a>
                     <ul id="nav-mobile" class="right hide-on-med-and-down">
                        <!-- <li><a href="user.htm"><span class="lime-text text-accent-2">Usuario1</span></a></li>-->
                        <li><a href="aspirante.htm"><span class="lime-text text-accent-2">Aspirante</span></a></li>
                        <li><a href="prueba.htm"><span class="lime-text text-accent-2">Pruebas</span></a></li>
                        <li><a href="reporte.htm"><span class="lime-text text-accent-2">Reporte</span></a></li>
                    </ul>
                </div>
                 
            </nav>
            
            <!--Buscar -->
         <!-- <nav>
  
            <div class="nav-wrapper">
                <form name="ejemplo" action="buscarUser.htm" method="POST">
                    <div class="input-field">
                        Ingrese la cedula del usuario: <input type="search" name="cedula1"><br>
                        <input type="submit" value="Buscar">
                    </div>    
                </form>
            </div>
          </nav>    -->
         <h5><i class="material-icons">search</i>Ingrese la cédula del usuario:</h5>
             <nav class="white">
                    <div class="nav-wrapper">
                        <form name="ejemplo" action="buscarUser.htm" method="POST">
                            <div class="input-field">
                                <input id="search" type="search" name="cedula1" required>
                                <label class="label-icon" for="search" ><i class="material-icons">search</i></label>
                                
                            </div>
                        </form>
                    </div>
                </nav>     
            
            
                     <h2 class="center"><span class="yellow-text text-darken-4">Gestión de Usuarios</span></h2>
                    <div class="container"> 
                     <table id="tabla" class="highlight centered responsive-table">
                         <thead>
                            <tr>
                              <th>Cedula</th>
                              <th>Nombre</th>
                              <th>Apellido</th>
                              <th>Usuario</th>
                              <th>Clave</th>
                              <th>Tipo</th>
                              <th>Fecha de Registro</th>
                              <th>Acciones</th>
                              <th></th>
                            </tr>

                         </thead>
                         <tbody>
                            <c:forEach items="${usuarios}" var="usuarios" >
                                <tr>
                            <td><c:out value="${usuarios.idusuario}"/></td>
                            <td><c:out value="${usuarios.nombre_usuario}"/></td>
                            <td><c:out value="${usuarios.apellido_usuario}"/></td>
                            <td><c:out value="${usuarios.usuario_usuario}"/></td>
                            <td><c:out value="${usuarios.contrasena_usuario}"/></td>
                            <td><c:out value="${usuarios.tipo_usuario}"/></td>
                            <td><c:out value="${usuarios.fecha_usuario}"/></td>
                            
                            <td> 
                                <a  href="<c:url value="edituser.htm?id=${usuarios.idusuario}"/> "> <i class="material-icons right">edit</i></a>
                                <a href="<c:url value="deleteuser.htm?id=${usuarios.idusuario}"/>" ><i class="material-icons right">delete</i></a>
                            </td>
                            </tr>    
                            </c:forEach>    
                         </tbody>
                         
                         </table>
                 </div>
                     
                                 
            <div class="row">                        
                        <div class="col s12">                    
                            <center><a href="adduser.htm"  class="modal-trigger btn-large waves-effect waves-yellow green"><i class="material-icons left">add_circle</i>Agregar Usuario</a></center>
                        </div>
                    </div>      
        </body>
    </html>

