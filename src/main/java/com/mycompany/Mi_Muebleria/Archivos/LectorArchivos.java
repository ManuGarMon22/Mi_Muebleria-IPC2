/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Mi_Muebleria.Archivos;

import com.mycompany.Mi_Muebleria.Exceptions.CreationException;
import com.mycompany.Mi_Muebleria.Modelos.*;
import java.io.*;
import java.util.*;
import com.mycompany.Mi_Muebleria.Manejadores.*;
import com.mycompany.Mi_Muebleria.Listas.Listas;
/**
 *
 * @author manu
 */
public class LectorArchivos {
    
    private static final String CLIENTE = "CLEINTE";
    private static final String PIEZA = "PIEZA";
    private static final String MUEBLE = "MUEBLE";
    private static final String USUARIO = "USUARIO";
    private static final String ENSAMBLAR_MUEBLE = "ENSAMBLE_PIEZAS";
    private static final String ENSAMBLE_PIEZAS = "ENSAMBLE_PIEZA";  
    
    private  ArrayList<Object> objetos;
   
    public ArrayList<Object> leerFichero(File archivo, Object text) throws FileNotFoundException, IOException, CreationException {
        objetos = new ArrayList<>();
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        String linea;
        while ((linea = br.readLine()) != null) {
            //con la linea leida, separamos los campos
            CrearObjeto(linea);
            //pasamos el texto a objeto
        }
        fr.close(); 
        return objetos;
    }
    
    public void CrearObjeto(String linea) throws CreationException{
        String[] lineaDividida = new String[9];
        lineaDividida[0]= linea.substring(0, CLIENTE.length());
        lineaDividida[1]= linea.substring(0, USUARIO.length());
        lineaDividida[2]= linea.substring(0, PIEZA.length());
        lineaDividida[3]= linea.substring(0, MUEBLE.length());
        lineaDividida[4]= linea.substring(0, ENSAMBLAR_MUEBLE.length());
        lineaDividida[5]= linea.substring(0, ENSAMBLE_PIEZAS.length());
        
        try{    
            
        if (lineaDividida[0].equalsIgnoreCase(CLIENTE)){
            String[] campos = separarCampos(7, linea);
            Cliente cliente = CrearObjetos.nuevoCliente(campos);
            if (cliente != null ){
                Listas.clientes.add(cliente);
            }
        }else if (lineaDividida[2].equalsIgnoreCase(PIEZA)){
            String[] campos = separarCampos(5, linea);
            Pieza pieza = CrearObjetos.nuevaPieza(campos);
            if (pieza != null){
                Listas.piezas.add(pieza);
            }
        }else if(lineaDividida[1].equalsIgnoreCase(USUARIO)){
            String[] campos = separarCampos(7, linea);
            Usuario usuario = CrearObjetos.nuevoUsuario(campos);
            if (usuario != null){
                Listas.usuarios.add(usuario);
            }
        }else if(lineaDividida[3].equalsIgnoreCase(MUEBLE)){
            String[] campos = separarCampos(6, linea);
            Mueble mueble = CrearObjetos.nuevoMueble(campos);
            if (mueble != null){
                Listas.muebles.add(mueble);
            }
        }else if(lineaDividida[4].equalsIgnoreCase(ENSAMBLAR_MUEBLE)){
            String[] campos = separarCampos(16, linea);
            EnsamblarMueble ensamble = CrearObjetos.nuevoEnsambleMueble(campos);
            if (ensamble != null){
                Listas.ensamblesMuebles.add(ensamble);
            }
        }else if(lineaDividida[5].equalsIgnoreCase(ENSAMBLE_PIEZAS)){
            String[] campos = separarCampos(15, linea);
            EnsamblePieza ensamble = CrearObjetos.nuevoEnsamblePiezas(campos);
            if (ensamble != null){
                Listas.ensamblesPiezas.add(ensamble);
            }
        }else{
            throw new CreationException("Instruccion no reconocida ");
        
        }   
        }catch(CreationException e){
            throw new CreationException(e.getMessage()+" de su archivo");
        }catch(IllegalArgumentException e){
            throw new CreationException(" No se reconocio una instruccion, favor rectificar toda la informacion del archivo"); 
        }
    }
    
    public String[] separarCampos(int cantidadLetras, String linea){
        String lineaDeCampos = linea.substring(cantidadLetras, (linea.length()-1));
        System.out.println(lineaDeCampos);
        String[] campos = lineaDeCampos.split(",");
        return campos;
    }
    
}
