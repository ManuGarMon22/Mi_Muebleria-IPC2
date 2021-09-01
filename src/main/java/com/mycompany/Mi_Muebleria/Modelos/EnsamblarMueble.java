/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Mi_Muebleria.Modelos;

import java.time.LocalDate;

/**
 *
 * @author manu
 */
public class EnsamblarMueble {
    
    private String nombre;
    private String creador;
    private LocalDate diaCreacion;
    private double costo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public LocalDate getDiaCreacion() {
        return diaCreacion;
    }

    public void setDiaCreacion(LocalDate diaCreacion) {
        this.diaCreacion = diaCreacion;
    }    

    public void setDiaCreacion(String fecha) {
        String[] fechaDividida=fecha.split("/");
        int dia = Integer.valueOf(fechaDividida[0]);
        int mes = Integer.valueOf(fechaDividida[1]);
        int anio = Integer.valueOf(fechaDividida[2]);
        this.diaCreacion = LocalDate.of(anio, mes, dia);
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
    
    
    
    
}
