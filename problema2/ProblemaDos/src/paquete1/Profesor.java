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
public class Profesor {
    
    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private int cedula;
    
    public Profesor(String nom, String apellidoUno, double sueldoUno, int ide){
        
        nombre = nom;
        apellido = apellidoUno;
        sueldoBasico = sueldoUno;
        cedula = ide;        
    }
    
    public void establecerNombre(String tipo){
        nombre = tipo;
    }
    public void establecerApellido(String tipo){
        apellido = tipo;
    }
    public void establecerSueldoBasico(double tipo){
        sueldoBasico = tipo;
    }
    public void establecerSueldoTotal(){
        sueldoTotal = sueldoBasico + (sueldoBasico*0.20);
    }
    public void establecerCedula(int tipo){
        cedula = tipo;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    public String obtenerApellido(){
        return apellido;
    }
    public double obtenerSueldoBasico(){
        return sueldoBasico;
    }
    public double obtenerSueldoTotal(){
        return sueldoTotal;
    }
    public int obtenerCedula(){
        return cedula;
    }
    @Override
    public String toString(){
        
        String cadena = String.format("Los datos son:\n"
                + "Nombre: %s\nApellido: %s\nSueldo Básico: %.2f\n"
                + "Sueldo Total: %.2f\nCédula: %d\n",obtenerNombre(),
                obtenerApellido(),obtenerSueldoBasico(),
                obtenerSueldoTotal(),obtenerCedula());
        
        return cadena;
    }
    
}
