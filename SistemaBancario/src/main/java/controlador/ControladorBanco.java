/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import Modelo.Cuenta;
import Modelo.CuentaAhorros;
import Modelo.CuentaCorriente;
import Modelo.Fecha;
import java.util.ArrayList;
import vista.VistaBanco;
/**
 *
 * @author Windows 11
 */
public class ControladorBanco {
   
    private ArrayList<Cuenta> cuentas;
    private VistaBanco vista;

    public ControladorBanco(VistaBanco vista) {
        this.vista = vista;
        this.cuentas = new ArrayList<>();
        this.vista.setControlador(this);
    }
      private Cuenta buscarCuenta(String numero) {
        for (Cuenta c : cuentas) {
            if (c.getNumero().equals(numero)) {
                return c;
            }
        }
        return null;
    }  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
} 

