/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import paquete1.Auto;
/**
 *
 * @author usuario
 */
public class Ejecutor {

    public static void main(String[] args) {
         
        //Objeto 1
        
        String ide = "1117474737";
        String marcaAuto = "Kia";
        int fabricacion = 2011; 
        double valorVehiculo = 12000;
        
        Auto auto = new Auto(ide, marcaAuto, fabricacion, valorVehiculo);
        
        auto.establecerMatricula();
        
        System.out.printf("%s\n",auto);
        
        //Objeto 2
        
        String cedu = "1150785490";
        String marca2 = "Toyota";
        int fabricacion2 = 2019; 
        double valorVehiculo2 = 150050;
        
        Auto auto2 = new Auto(cedu, marca2, fabricacion2, valorVehiculo2);
        
        auto2.establecerMatricula();
        
        System.out.printf("%s\n",auto2);
    }
}
    

