/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Titoelgato
 */
public class CuentaCorriente extends Cuenta {
    private double cupoSobregiro;

    public CuentaCorriente(double cupoSobregiro, String numero, String nombreDueno, Fecha fechaApertura) {
        super(numero, nombreDueno, fechaApertura);
        this.cupoSobregiro = cupoSobregiro;
    }

    public CuentaCorriente(double cupoSobregiro, String numero, String nombreDueno, Fecha fechaApertura, Double saldoInicial) {
        super(numero, nombreDueno, fechaApertura, saldoInicial);
        this.cupoSobregiro = cupoSobregiro;
    }
    
    @Override
    public boolean retirar(double valor){
        if (valor <= 0) {
            return false;
        }
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        } else if (valor <= saldo + cupoSobregiro) {
            saldo -= valor; 
            return true;
        } else {
            return false;
        }
}
}