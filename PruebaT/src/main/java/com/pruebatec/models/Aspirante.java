
package com.pruebatec.models;

public class Aspirante {
    
    private int idaspirante, telefono; 
    private String nombre, apellido, carrera, correo;

    public Aspirante() {
    }

    public Aspirante(int idaspirante, int telefono, String nombre, String apellido, String carrera, String correo) {
        this.idaspirante = idaspirante;
        this.telefono = telefono;
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
        this.correo = correo;
    }

    public int getIdaspirante() {
        return idaspirante;
    }

    public void setIdaspirante(int idaspirante) {
        this.idaspirante = idaspirante;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
   
}
