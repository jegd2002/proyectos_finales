/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author javii
 */
public class TurnoVirtual {
    private String[] turnos;
    private String[] turnosPerdidos; 
    private boolean estadoTurnoVirtual = true;
    private int turnoEnAtencion = 0;
    private int cantidadTurnosAtendidos = 1;  

    
    

    public TurnoVirtual(String[] turnos) {
        this.turnos = turnos;
        this.turnosPerdidos = turnosPerdidos;
        for (int i=0; i <turnos.length;i++){ 
                turnosPerdidos[i] = " ";
        }
    }

    public String[] getTurnos() {
        return turnos;
    }

    public void setTurnos(String[] turnos) {
        this.turnos = turnos;
    }

    public String[] getTurnosPerdidos() {
        return turnosPerdidos;
    }

    public void setTurnosPerdidos(String[] turnosPerdidos) {
        this.turnosPerdidos = turnosPerdidos;
    }

    public boolean isEstadoTurnoVirtual() {
        return estadoTurnoVirtual;
    }

    public void setEstadoTurnoVirtual(boolean estadoTurnoVirtual) {
        this.estadoTurnoVirtual = estadoTurnoVirtual;
    }

    public int getTurnoEnAtencion() {
        return turnoEnAtencion;
    }

    public void setTurnoEnAtencion(int turnoEnAtencion) {
        this.turnoEnAtencion = turnoEnAtencion;
    }

    public int getCantidadTurnosAtendidos() {
        return cantidadTurnosAtendidos;
    }

    public void setCantidadTurnosAtendidos(int cantidadTurnosAtendidos) {
        this.cantidadTurnosAtendidos = cantidadTurnosAtendidos;
    }


    @Override
    public String toString() {
        return "TurnoVirtual{" + "turnos=" + Arrays.toString(turnos) + ", turnosPedidos=" + turnosPerdidos + ", estadoTurnoVirtual=" + estadoTurnoVirtual + ", turnoEnAtencion=" + turnoEnAtencion + ", cantidadTurnosAtendidos=" + cantidadTurnosAtendidos + '}';
    }

    public void atenderProximoTurno(){
        
        if (estadoTurnoVirtual == true){
            this.turnoEnAtencion += 1;
            this.cantidadTurnosAtendidos += 1;  
        }
    }
    public void agregarTurnoPerdido(){
        for (int i = 0; i < turnosPerdidos.length; i++) {
            if (" ".equals(turnosPerdidos[i])) {
                turnosPerdidos[i] = turnos[turnoEnAtencion];
                break;
            }
        }
    }    
    public void cambiarEstadoTurno(){
        if(this.estadoTurnoVirtual == true){
            this.estadoTurnoVirtual = false;
        }else{ 
            this.estadoTurnoVirtual = true;}
    }
    
}
