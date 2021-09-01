/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Mi_Muebleria.Modelos;

import com.mycompany.Mi_Muebleria.Exceptions.CreationException;

/**
 *
 * @author manu
 */
public class Pieza {
    
    private String nombre;
    private double precio;
    private static int cantidad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws CreationException {
        try {
            this.nombre = nombre;
        } catch (NullPointerException e) {
            throw new CreationException("El campo nombre debe ser llenado");
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) throws CreationException {
        try {
            this.precio = Double.parseDouble(precio);
        } catch (NumberFormatException e) {
            throw new CreationException("El campo precio no es un valor numerico");
        }
        
    }

    public static int getCantidad() {
        return cantidad;
    }

    public static void setCantidad(int cantidad) {
        Pieza.cantidad = cantidad;
    }

       
    
    
    
    
    
    
    
    
    
}
