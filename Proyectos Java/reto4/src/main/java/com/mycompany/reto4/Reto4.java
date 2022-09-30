/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.reto4;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author javii
 */
public class Reto4 {

    public static void main(String[] args) {
         public static Object[] reportes(ArrayList <Cliente> tienda){
        
        int costoMinimo = Integer.MAX_VALUE;
        int costoMaximo = Integer.MIN_VALUE;
        String clienteMaximo = "";
        String clienteMinimo = "";
        double valorTotal = 0;
       
        for(Cliente datos:tienda){
            if(datos.getTotalAPagar() < costoMinimo){
                costoMinimo = datos.getTotalAPagar();
                clienteMinimo = datos.getNombreCompleto();
            }
            
            if(datos.getTotalAPagar() > costoMaximo){
                costoMaximo = datos.getTotalAPagar();
                clienteMaximo = datos.getNombreCompleto();
            }
            valorTotal = valorTotal + datos.getTotalAPagar();
            
        }
        double promedio = (valorTotal / tienda.size());
        
        Object[] dtFinal = {promedio, clienteMinimo, costoMinimo, clienteMaximo, costoMaximo};
        
        return dtFinal;
        
        
        //EN ESTE ESPACIO PONER SU LÓGICA
        double valorTotal = 0;
        int costoMaximo = Integer.MIN_VALUE;
        int costoMinimo = Integer.MAX_VALUE;
        String nombreMaximo = "";
        String nombreMinimo = "";
        
        for(Cliente datos:tienda){
            if(datos.getTotalAPagar() < costoMinimo){
                costoMinimo = datos.getTotalAPagar();
                nombreMinimo = datos.getNombreCompleto();
            }
            
            if(datos.getTotalAPagar() > costoMaximo){
                costoMaximo = datos.getTotalAPagar();
                nombreMaximo = datos.getNombreCompleto();
            }
            valorTotal = valorTotal + datos.getTotalAPagar();
            
        }
        double promedio = (valorTotal / tienda.size());
        
        Object[] dtfinal = {promedio, nombreMinimo, costoMinimo, nombreMaximo, costoMaximo};
        
        return dtfinal;
        
    }     
}
    


