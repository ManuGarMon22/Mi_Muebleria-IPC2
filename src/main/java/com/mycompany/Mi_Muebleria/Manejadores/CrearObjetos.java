/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Mi_Muebleria.Manejadores;

import com.mycompany.Mi_Muebleria.Exceptions.CreationException;
import com.mycompany.Mi_Muebleria.Modelos.*;

/**
 *
 * @author manu
 */
public class CrearObjetos {
    
    
    public static Cliente nuevoCliente(String[] campos) throws CreationException{
        Cliente c = new Cliente();
        try{
            if(campos.length>=3){
                c.setName(campos[0]);
                c.setNit(campos[1]);
                c.setDireccion(campos[2]);
                if(campos.length == 5){
                    c.setMunicipio(campos[3]);
                    c.setDepartamento(campos[4]);
                }else if(campos.length == 3){
                
                } else{
                    throw new CreationException("exceso de campos para la creacion de un cliente. Verifique la informacion"); 
                }
                return c;
            }else{
                throw new CreationException("Campos insuficientes para crear al Cliente. Verifique la informacion"); 
            }        
        } catch (NullPointerException e) {
            throw new CreationException("Los campos del cliente deben ser debidamente llenados"); 
        }
     
        
    }
    
    public static Pieza nuevaPieza(String[] campos) throws CreationException{
        Pieza p = new Pieza();
        try {
            if(campos.length == 2){
                p.setNombre(campos[0]);
                p.setPrecio(campos[1]);
                return p;
            }else if( campos.length < 2){
                throw new CreationException("Campos insuficientes para crear el objeto Pieza");
            }else{
                throw new CreationException("Exceso de campos para crear el objeto Pieza");
            }
        } catch (Exception e) {
            throw new CreationException("Error al crear el archivo pieza");
        }
        
    }
    
    public static Mueble nuevoMueble(String[] campos) throws CreationException{
        Mueble m = new Mueble();
        try {
            if(campos.length == 2){
                m.setNombre(campos[0]);
                m.setPrecio(campos[1]);
                
                return m;
            }else{
            throw new CreationException("Campos insuficientes o exceso de estos para la creacion del mueble ");
        }
        } catch (CreationException e) {
            throw e;
        }
        
    }
    
    public static Usuario nuevoUsuario(String [] campos) throws CreationException{
        Usuario u = new Usuario();
        try {
            if(campos.length == 3){
                u.setUsuario(campos[0]);
                u.setContrasenia(campos[1]);
                u.setPuesto(campos[2]);
                return u;
            }else{
                throw new CreationException("Cantidad de campos invalido para el usuario "+campos[0]);
            }
        } catch (NullPointerException e) {
            throw new CreationException("Error al leer al usuairo "+campos[0]+". por favor verifique que los campos de este cumplan con la estructura correcta: 3 campos a leer y separados por comas");
        }catch (CreationException e){
            throw e;
        }        
    }
    
    public static EnsamblePieza nuevoEnsamblePiezas(String[] campos) throws CreationException{
        EnsamblePieza ensamble = new EnsamblePieza();
        try {
            if(campos.length == 3){
                ensamble.setMueble(campos[0]);
                ensamble.setCantidad(campos[1]);
                ensamble.setCantidad(campos[2]);
                return ensamble;
            }else{
                
                throw new CreationException("Cantidad de campos invalido para el usuario "+campos[0]);
            }
        } catch (NullPointerException e) {
            
            throw new CreationException("Error al leer al usuairo "+campos[0]+". por favor verifique que los campos de este cumplan con la estructura correcta: 3 campos a leer y separados por comas");
        }catch (CreationException e){
            throw e;
        }        
    }

    public static EnsamblarMueble nuevoEnsambleMueble(String[] campos) throws CreationException{
        EnsamblarMueble ensamble = new EnsamblarMueble();
        try {
            if(campos.length == 3){
                ensamble.setNombre(campos[0]);
                ensamble.setCreador(campos[1]);
                ensamble.setDiaCreacion(campos[2]);
                return ensamble;
            }else{
                throw new CreationException("Cantidad de campos invalido para el usuario "+campos[0]);
            }
        } catch (NullPointerException e) {
            throw new CreationException("Error al leer al usuairo "+campos[0]+". por favor verifique que los campos de este cumplan con la estructura correcta: 3 campos a leer y separados por comas");
        }catch (CreationException e){
            throw e;
        }
       
    }
}
