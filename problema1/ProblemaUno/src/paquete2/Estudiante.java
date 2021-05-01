/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author usuario
 */
public class Estudiante {

    private String nombreEstudiante;
    private double materiaUno;
    private double materiaDos;
    private double materiaTres;
    private double promedio;
    
    public Estudiante (String nom, double materia1, double materia2, double materia3){
        
        nombreEstudiante = nom;
        materiaUno = materia1;
        materiaDos = materia2;
        materiaTres = materia3;        
    }
    
    public void establecerNombreEstudiante(String tipo){
        nombreEstudiante = tipo;
    }
    public void establecerMateriaUno(double tipo){
        materiaUno = tipo;
    }
    public void establecerMateriaDos(double tipo){
        materiaDos = tipo;
    }
    public void establecermateriaTres(double tipo){
        materiaTres = tipo;
    }
    public void establecerPromedio(){
        promedio = (materiaUno + materiaDos + materiaTres)/3 ;
    }
    
    public String obtenerNombreEstudiante(){
        return nombreEstudiante;
    }
    public double obtenerMateriaUno(){
        return materiaUno;
    }
    public double obtenerMateriaDos(){
        return materiaDos;
    }
    public double obtenerMateriaTres(){
        return materiaTres;
    }
    public double obtenerPromedio(){
        return promedio;
    }
    @Override
    public String toString(){
        
        String cadena = String.format("Los datos son:\n"
                + "Nombre del estudiante: %s\nCalificaciones:\n"
                + "Materia 1: %.2f\nMateria 2: %.2f\n"
                + "Materia 3: %.2f\nPromedio: %.2f\n",obtenerNombreEstudiante(),
                obtenerMateriaUno(),obtenerMateriaDos(),
                obtenerMateriaTres(),obtenerPromedio());
        
        return cadena;
    
    }
    
}
