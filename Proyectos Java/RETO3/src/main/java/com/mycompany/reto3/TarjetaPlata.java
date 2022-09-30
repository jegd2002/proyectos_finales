/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto3;

/**
 *
 * @author javii
 */
public class TarjetaPlata extends TarjetaCine {
    
    private int cantidadVisitas = 0;
    private boolean elegibleOro = false;

    public TarjetaPlata(String idTarjeta, String nombreCompleto, String email, String telefono, int edad) {
        super(idTarjeta, nombreCompleto, email, telefono, edad, 10);
    }
    
    

    public int getCantidadVisitas() {
        return cantidadVisitas;
    }

    public void setCantidadVisitas(int cantidadVisitas) {
        this.cantidadVisitas = cantidadVisitas;
    }

    public boolean isElegibleOro() {
        return elegibleOro;
    }

    public void setElegibleOro(boolean elegibleOro) {
        this.elegibleOro = elegibleOro;
    }

    @Override
    public double pagar(String[] cuenta) {
        double sinDescuento = 0;
        double totalPrecio = 0;
        for (int i = 0; i < cuenta.length; i++) {
            if(cuenta[i].equals("Boleta"){
                sinDescuento += 6000;    
            }if(cuenta[i].equals("Combo 1 - Crispetas + gaseosa"){
                sinDescuento += 8000;
            }if(cuenta[i].equals("Combo 2 - Perro + Gaseosa"){
                sinDescuento = 12000;
            }
        }
        totalPrecio =  sinDescuento * (1 - this.getPorcentajeDescuento() / 100);
        cantidadVisitas += 1;
        if(cantidadVisitas == 5){
            elegibleOro = true;
        }
        return totalPrecio;
    }
    
    
    
    
}
