
package com.pruebatec.models;

public class Prueba {
    
    private int idprueba, idaspirante, idusuario, calificacion; 
    private String nomAspi, apellAspi, carreAspi, nomUsua, apellUsua, detalle, fechaPrue;

    public Prueba() {
    }

    public Prueba(int idprueba, int idaspirante, int idusuario, int calificacion, String nomAspi, String apellAspi, String carreAspi, String nomUsua, String apellUsua, String detalle, String fechaPrue) {
        this.idprueba = idprueba;
        this.idaspirante = idaspirante;
        this.idusuario = idusuario;
        this.calificacion = calificacion;
        this.nomAspi = nomAspi;
        this.apellAspi = apellAspi;
        this.carreAspi = carreAspi;
        this.nomUsua = nomUsua;
        this.apellUsua = apellUsua;
        this.detalle = detalle;
        this.fechaPrue = fechaPrue;
    }

    public int getIdprueba() {
        return idprueba;
    }

    public void setIdprueba(int idprueba) {
        this.idprueba = idprueba;
    }

    public int getIdaspirante() {
        return idaspirante;
    }

    public void setIdaspirante(int idaspirante) {
        this.idaspirante = idaspirante;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getNomAspi() {
        return nomAspi;
    }

    public void setNomAspi(String nomAspi) {
        this.nomAspi = nomAspi;
    }

    public String getApellAspi() {
        return apellAspi;
    }

    public void setApellAspi(String apellAspi) {
        this.apellAspi = apellAspi;
    }

    public String getCarreAspi() {
        return carreAspi;
    }

    public void setCarreAspi(String carreAspi) {
        this.carreAspi = carreAspi;
    }

    public String getNomUsua() {
        return nomUsua;
    }

    public void setNomUsua(String nomUsua) {
        this.nomUsua = nomUsua;
    }

    public String getApellUsua() {
        return apellUsua;
    }

    public void setApellUsua(String apellUsua) {
        this.apellUsua = apellUsua;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getFechaPrue() {
        return fechaPrue;
    }

    public void setFechaPrue(String fechaPrue) {
        this.fechaPrue = fechaPrue;
    }
    
    
}
