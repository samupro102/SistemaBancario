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
    }
    
    
}
