/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.reto2;

import java.util.ArrayList;

/**
 *
 * @author javii
 */
public class Reto2 {

    public static void main(String[] args) {
        
        
        String [] cola = new String[]{
            "A0","A1","A2","A3","A4","A5","A6","A7","A8","A9","A10","A11"
        };
        
        
        
        TurnoVirtual turnoVirtual1 = new TurnoVirtual(cola);
        System.out.println(turnoVirtual1);
        
        turnoVirtual1.atenderProximoTurno();
        turnoVirtual1.atenderProximoTurno();
        turnoVirtual1.atenderProximoTurno();
        turnoVirtual1.atenderProximoTurno();
        
        
        System.out.println(turnoVirtual1);
       
       // for (int i = 0; i < cola.length; i++) {
         //   x1.add(" ");
        //}
        
        //System.out.println(x1);
       
    //}

    
    }
}
