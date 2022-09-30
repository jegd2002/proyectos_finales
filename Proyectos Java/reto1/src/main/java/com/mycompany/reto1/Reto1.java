/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.reto1;
import java.util.*;
/**
 *
 * @author javii
 */
public class Reto1 {

    public static void main(String[] args) {
        double[] listaNotas = {4.3, 2.4, 2.4, 2.0, 1.8, 4.0, 3.6, 2.3, 4.4, 1.5};
        double suma = 0;
        double prom = 0;
        double mayor = 0;
        double menor = listaNotas[0];
        for (int i = 0; i < listaNotas.length; i++) {
            suma = suma + listaNotas[i];
        }
        for (int i = 0; i < listaNotas.length; i++) {
            if(mayor < listaNotas[i]){
                mayor = listaNotas[i];   
            }
            if(listaNotas[i]<menor){
                menor = listaNotas[i];
            }
            else{
                prom = suma;
            } 
        }
        //System.out.println(prom);
        double [] lista = new double[3];
        lista[0] = prom;
        lista[1] = mayor;
        lista[2] = menor;
        System.out.println(Arrays.toString(lista));

      
        
        
        
        //String val = Double.toString(prom);
        //String val1 = Double.toString(menor);
        //String val2 = Double.toString(mayor);
        //System.out.println(val);
        //System.out.println(val1);
        //System.out.println(val2);
        //List<String> testList = new ArrayList<String>();
        //testList.add(val);
        //testList.add(val1);
        //testList.add(val2);
        //System.out.println(testList);
        //String val = String.valueOf(prom);
        //String val2 = String.valueOf(mayor);
        //String val3 = String.valueOf(menor);
        //List<String> testList = new ArrayList<String>();
        //testList.add(val);
        //testList.add(val2);
        //testList.add(val3);
        //System.out.println(testList);
        //double[] array ={prom,  menor,  mayor};
       
       
        
    }
}