/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebasalud.models;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author RicardoM
 */
public class Conexion {
    public DriverManagerDataSource conectar(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost/prueba_salud");
        dataSource.setUsername("root");
        dataSource.setPassword("1503");
        return dataSource;
    }
    
    
}
