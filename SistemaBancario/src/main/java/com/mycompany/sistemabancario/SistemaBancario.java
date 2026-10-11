/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemabancario;
import controlador.ControladorBanco;
import vista.VistaBanco;
/**
 *
 * @author Windows 11
 */
public class SistemaBancario {

    public static void main(String[] args) {
        VistaBanco vista = new VistaBanco();
        new ControladorBanco(vista);
        vista.setVisible(true);
    }
}