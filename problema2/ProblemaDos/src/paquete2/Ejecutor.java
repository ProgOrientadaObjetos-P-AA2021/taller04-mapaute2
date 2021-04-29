/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import paquete1.Profesor;

/**
 *
 * @author usuario
 */
public class Ejecutor {
    
    public static void main(String[] args) {
        
        //Objeto 1
        
        String nom = "Jose Pedro";
        String apellidoUno = "Carrión Duarte";
        double sueldoUno = 300;
        int ide = 23454345;
        
        Profesor profesor = new Profesor(nom, apellidoUno, sueldoUno, ide);
        
        profesor.establecerSueldoTotal();
        
        System.out.printf("%s\n",profesor);
        
        //Objeto 2
        
        String nome = "Mónica Fernanda";
        String apellidoDos = "Mogrovejo Díaz";
        double sueldo = 650;
        int cedu = 11350664;
        
        Profesor profesor2 = new Profesor(nome,apellidoDos,sueldo,cedu);
        
        profesor2.establecerSueldoTotal();
        
        System.out.printf("%s\n",profesor2);
    }
    
}
