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
public class Mueble {
    
    private String nombre;
    private double precio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws CreationException {
        try {
            this.nombre = nombre;
        } catch (Exception e) {
            throw new CreationException("Error al leer el nombre del mueble");
        }
        
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) throws CreationException{
        try {
            this.precio = Double.valueOf(precio);
        } catch (NumberFormatException e) {
            throw new CreationException("El valor en el precio del mueble no es un valor numerico");
        }        
        
    }
    
    
    
}
