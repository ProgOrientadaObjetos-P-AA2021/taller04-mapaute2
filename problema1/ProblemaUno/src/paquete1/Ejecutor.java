/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;
import paquete2.Estudiante;
/**
 *
 * @author usuario
 */
public class Ejecutor {
   
    public static void main(String[] args) {
        
        //Objeto 1
        
        String nom = "Juan Daniel Delgado Castillo";
        double materia1 = 9.75;
        double materia2 = 8.32;
        double materia3 = 7.05;
        
        Estudiante estudiante = new Estudiante(nom, materia1, materia2, materia3);
        
        estudiante.establecerPromedio();
        
        System.out.printf("%s\n",estudiante);
        
        //Objeto 2
        
        String nome = "María Antonia Arias Correa";
        double materiaU = 10;
        double materiaD = 8;
        double materiaT = 9.08;
        
        Estudiante estudiante2 = new Estudiante(nome, materiaU, materiaD, materiaT);
        
        estudiante2.establecerPromedio();
        
        System.out.printf("%s\n",estudiante2);
    }
}
