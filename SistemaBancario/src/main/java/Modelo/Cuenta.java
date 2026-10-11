/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Titoelgato
 */
public abstract class Cuenta {
    protected String numero;
    protected String nombreDueno;
    protected Fecha fechaApertura;
    protected double saldo;

    public Cuenta(String numero, String nombreDueno, Fecha fechaApertura) {
        this.numero = numero;
        this.nombreDueno = nombreDueno;
        this.fechaApertura = fechaApertura;
        this.saldo = 0;
    }
    public Cuenta(String numero, String nombreDueno, Fecha fechaApertura,Double saldoInicial){
        
        this.numero = numero;
        this.nombreDueno = nombreDueno;
        this.fechaApertura = fechaApertura;
        this.saldo = saldoInicial;
    
    
    
}
}