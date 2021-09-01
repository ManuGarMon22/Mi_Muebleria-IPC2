/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Mi_Muebleria.Modelos;

import com.mycompany.Mi_Muebleria.Enums.TipoEmpleado;
import com.mycompany.Mi_Muebleria.Exceptions.CreationException;
/**
 *
 * @author manu
 */
public class Usuario {
    
    private String nombre;
    private String apellido;
    private String usuario;
    private String contrasenia;
    private TipoEmpleado puesto;
    
    private final String FINANCIERO = "Financiero";
    private final String PUNTO_DE_VENTA = "Punto de venta";
    private final String FABRICA = "Fabrica";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws CreationException {
        try {
            this.nombre = nombre;
        } catch (Exception e) {
            throw new CreationException("Numero de puesto no identificado");
        }
        
        
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario)throws CreationException {
        try {
            this.usuario = usuario;
        } catch (Exception e) {
            throw new CreationException("Nombre de Usuario no Valido");
        }
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia)throws CreationException {
        try {
            this.contrasenia = contrasenia;
        } catch (Exception e) {
            throw new CreationException("Numero de puesto no identificado");
        }
    }

    public TipoEmpleado getPuesto() {
        return puesto;
    }

    public void setPuesto(String noPuesto) throws CreationException{
        try {
            switch(noPuesto){
            case "1": this.puesto = TipoEmpleado.FABRICA;
                break;
            case "2": this.puesto = TipoEmpleado.PUNTO_DE_VENTA;
                break;    
            case "3": this.puesto = TipoEmpleado.FINANCIERO;
                break;
            case FABRICA: this.puesto = TipoEmpleado.FABRICA;
                break;
            case PUNTO_DE_VENTA: this.puesto = TipoEmpleado.PUNTO_DE_VENTA;
                break;    
            case FINANCIERO: this.puesto = TipoEmpleado.FINANCIERO;
                break;
            default: throw new CreationException("Numero de puesto no identificado"); 
            }
        } catch (NumberFormatException e) {
            throw new CreationException("Numero de puesto no identificado");
        }catch(NullPointerException e){
            throw new CreationException("Numero de puesto no identificado");
        }catch (IllegalArgumentException e){
            throw new CreationException("Numero de puesto no identificado");
        }
    }
    
    
    
    
    
    
    
}
