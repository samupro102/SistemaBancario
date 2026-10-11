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
    public void crearCuenta() {
        String numero = vista.getNumero();
        if (buscarCuenta(numero) != null) {
            vista.mostrarResultado("Ya existe una cuenta con el número " + numero);
            return;
        }
        Fecha fecha = new Fecha(vista.getDia(), vista.getMes(), vista.getAnio());
        double saldo = vista.getSaldoInicial();
        Cuenta nueva;
        if (vista.getTipoCuenta().equals("Ahorros")) {
            nueva = new CuentaAhorros(numero, vista.getNombre(), fecha, saldo);
        } else {
            nueva = new CuentaCorriente(vista.getCupo(), numero, vista.getNombre(), fecha, saldo);
        }
        cuentas.add(nueva);
        vista.mostrarResultado("Cuenta creada: " + nueva.obtenerInformacion());
    }  
    public void consignar() {
        Cuenta c = buscarCuenta(vista.getNumero());
        if (c == null) {
            vista.mostrarResultado("No existe la cuenta " + vista.getNumero());
        } else if (c.consignar(vista.getValor())) {
            vista.mostrarResultado("Consignación exitosa. " + c.obtenerInformacion(true));
        } else {
            vista.mostrarResultado("El valor a consignar debe ser mayor a 0.");
        }
    }
        public void consultarSaldo() {
        Cuenta c = buscarCuenta(vista.getNumero());
        if (c == null) {
            vista.mostrarResultado("No existe la cuenta " + vista.getNumero());
        } else {
            vista.mostrarResultado(c.obtenerInformacion(true));
        }
    }
        public void retirar() {
        Cuenta c = buscarCuenta(vista.getNumero());
        if (c == null) {
            vista.mostrarResultado("No existe la cuenta " + vista.getNumero());
        } else if (c.retirar(vista.getValor())) {
            vista.mostrarResultado("Retiro exitoso. " + c.obtenerInformacion(true));
        } else {
            vista.mostrarResultado("Retiro rechazado: fondos o cupo insuficientes.");
        }
    }
        public void consultarInformacion() {
        Cuenta c = buscarCuenta(vista.getNumero());
        if (c == null) {
            vista.mostrarResultado("No existe la cuenta " + vista.getNumero());
        } else {
            vista.mostrarResultado(c.obtenerInformacion());
        }
    }       
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
} 

