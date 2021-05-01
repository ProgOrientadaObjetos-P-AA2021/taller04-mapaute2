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
public class Auto {
    
    private String cedula;
    private String marca;
    private int añoFabricacion;
    private double valor;
    private double matricula;
    
    public Auto (String ide, String marcaAuto, int fabricacion, 
            double valorVehiculo ){
        
        cedula = ide;
        marca = marcaAuto;
        añoFabricacion = fabricacion;
        valor = valorVehiculo;        
    }
    
    public void establecerCedula(String tipo){
        cedula = tipo;
    }
    public void establecerMarca(String tipo){
        marca = tipo;
    }
    public void establecerAñoFabricacion(int tipo){
        añoFabricacion = tipo;
    }
    public void establecerValor(double tipo){
        valor = tipo;
    }
    public void establecerMatricula(){
        matricula = (valor * (2021 - añoFabricacion)) * (0.002/100) ; 
    }
    
    public String obtenerCedula(){
        return cedula;
    }
    public String obtenerMarca(){
        return marca;
    }
    public int obtenerAñoFabricacion(){
        return añoFabricacion;
    }
    public double obtenerValor(){
        return valor;
    }
    public double obtenerMatricula(){
        return matricula;
    }
    @Override
    public String toString(){
        
        String cadena = String.format("Los datos son:\n"
                + "Cédula: %s\nMarca: %s\nAño de fabricación: %d\n"
                + "Valor del vehículo: %.2f\nMatricula: %.2f\n",obtenerCedula(),
                obtenerMarca(),obtenerAñoFabricacion(),
                obtenerValor(),obtenerMatricula());
        
        return cadena;
    
    }

}
    

