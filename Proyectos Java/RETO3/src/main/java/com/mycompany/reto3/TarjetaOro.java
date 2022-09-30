/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto3;

/**
 *
 * @author javii
 */
public class TarjetaOro extends TarjetaCine {
    
    private String[] beneficiosDescripcion = {"Boleto Gratis","Crispetas Gratis","Gaseosa Gratis"};
    private boolean[] beneficiosEstado = {true,true,true};

    public TarjetaOro(String idTarjeta, String nombreCompleto, String email, String telefono, int edad) {
        super(idTarjeta, nombreCompleto, email, telefono, edad, 20);
    }

    public String[] getBeneficiosDescripcion() {
        return beneficiosDescripcion;
    }

    public void setBeneficiosDescripcion(String[] beneficiosDescripcion) {
        this.beneficiosDescripcion = beneficiosDescripcion;
    }

    public boolean[] getBeneficiosEstado() {
        return beneficiosEstado;
    }

    public void setBeneficiosEstado(boolean[] beneficiosEstado) {
        this.beneficiosEstado = beneficiosEstado;
    }
    
    public boolean redimirBeneficios(int posicionBeneficio){
        if(beneficiosEstado[posicionBeneficio] == true){
            beneficiosEstado[posicionBeneficio] = false;
            return true;
        }else{
            return false;
        }   
    } 
}
