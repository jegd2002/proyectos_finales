/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto3;

/**
 *
 * @author javii
 */
public class TarjetaCine {
    
    private String idTarjeta;
    private String nombreCompleto;
    private String email;
    private String telefono;
    private int edad;
    private double porcentajeDescuento;

    public TarjetaCine(String idTarjeta, String nombreCompleto, String email, String telefono, int edad, double porcentajeDescuento) {
        this.idTarjeta = idTarjeta;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.telefono = telefono;
        this.edad = edad;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    

    public String getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(String idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public double pagar(String[] cuenta){
        int[] valor = new int[cuenta.length];
        int total = 0;
        double totalPagar;
        
        for (int i = 0; i < cuenta.length; i++) {
            if(cuenta[i].equalsIgnoreCase("Boleta")){
                valor[i] = 6000;
            }else if(cuenta[i].equalsIgnoreCase("Combo 1 - Crispetas + Gaseosa")){
                valor[i] = 8000;
            }else if (cuenta[i].equalsIgnoreCase("Combo 2 - Perro + Gaseosa")){
                valor[i] = 12000;
            }  
        }
        for (int x: valor) {
            total += x;
        }
        totalPagar = total * (1 - this.porcentajeDescuento / 100);
        return totalPagar;
    }
}
