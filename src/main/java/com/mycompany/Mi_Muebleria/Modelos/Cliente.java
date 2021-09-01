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
public class Cliente {
    String nombre;
    String nit;
    String direccion;
    String municipio;
    String departamento;

    public String getName() {
        return nombre;
    }

    public void setName(String name)throws CreationException {
        try {
                this.nombre = name;  
        } catch (NullPointerException e) {
            throw new CreationException("el campo nombre debe ser llenado");
        }
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) throws CreationException {
        try {
            if(validacionNit(nit)){
                this.nit = nit;
            }
        } catch (NullPointerException e) {
            throw new CreationException("el campo nombre debe ser llenado");
        } 
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) throws CreationException {
        try {
            this.direccion = direccion;
        } catch(NullPointerException e) {
            throw new CreationException("el campo Direccion debe ser llenado");
        }
        
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    private boolean validacionNit(String nit) throws CreationException{
        boolean valido =false;
        String guion = "-";
        String[] letras = SeparacionLetras(nit);
        
        for(String x: letras){
            if(x.equalsIgnoreCase(guion)){
                valido = false;
                throw new CreationException("nit no haceptado por existencia del simbolo - en él");
            }else{
                valido = true;
            }
        }
        
        return valido;
    }
    
    private String[] SeparacionLetras(String palabra){
        int tamaño = palabra.length();
        String[] cadenaTexto = new String[tamaño];
                
        char[] letra = palabra.toCharArray();
        for(int i = 0; i<tamaño; i++){
            cadenaTexto[i]=Character.toString(letra[i]);
        }
        return cadenaTexto;
        
    }
}
