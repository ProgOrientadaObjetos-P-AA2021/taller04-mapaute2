/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author usuario
 */
public class Finanza {
    
    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comision;
    
    public Finanza(String nom, String banco, double valor){
        
        nombreCliente = nom;
        nombreBanco = banco;
        valorCheque = valor;       
    }
    
    public void establecerNombreCliente(String tipo){
        nombreCliente = tipo;
    }
    public void establecerNombreBanco(String tipo){
        nombreBanco = tipo;
    }
    public void establecerValorCheque(double tipo){
        valorCheque = tipo;
    }
    public void establecerComision(){
        comision = valorCheque * (0.003/100);
    }
    
    
    public String obtenerNombreCliente(){
        return nombreCliente;
    }
    public String obtenerNombreBanco(){
        return nombreBanco;
    }
    public double obtenerValorCheque(){
        return valorCheque;
    }
    public double obtenerComision(){
        return comision;
    }
 
    @Override
    public String toString(){
        
        String cadena = String.format("Los datos son:\n"
                + "Nombre del cliente: %s\nNombre del banco: %s\n"
                + "Valor del cheque: %.2f\n"
                + "Comisión: %.2f\n",obtenerNombreCliente(),
                obtenerNombreBanco(),obtenerValorCheque(),
                obtenerComision());
        
        return cadena;
    }
    
}
