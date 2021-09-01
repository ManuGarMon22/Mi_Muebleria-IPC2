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
public class EnsamblePieza {
    
    private String mueble;
    private String pieza;
    private int cantidad;

    public String getMueble() {
        return mueble;
    }

    public void setMueble(String mueble) throws CreationException {
        try {
            this.mueble = mueble;
        } catch (NullPointerException e) {
            throw new CreationException("El campo mueble debe ser llenado");
        }
        
    }

    public String getPieza() {
        return pieza;
    }

    public void setPieza(String pieza) throws CreationException {
        try {
            this.pieza = pieza;
        } catch (NullPointerException e) {
            throw new CreationException("El campo pieza debe ser llenado");
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) throws CreationException {
        try {
            this.cantidad = Integer.parseInt(cantidad);
        } catch (NullPointerException e) {
            throw new CreationException("El campo cantidad debe ser llenado");
        }catch(NumberFormatException e){
            throw new CreationException("en campo cantidad debe ser un numero entero");
        }
    }
    
    
}
