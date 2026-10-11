/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Titoelgato
 */
public class CuentaAhorros extends Cuenta{

    public CuentaAhorros(String numero, String nombreDueno, Fecha fechaApertura) {
        super(numero, nombreDueno, fechaApertura);
    }

    public CuentaAhorros(String numero, String nombreDueno, Fecha fechaApertura, Double saldoInicial) {
        super(numero, nombreDueno, fechaApertura, saldoInicial);
    }
    
    @Override
    public boolean retirar(double valor){
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }
    
}
