/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import paquete1.Finanza;
/**
 *
 * @author usuario
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Objeto 1
        
        String nom = "Juan Salina"; 
        String banco = "Banco de Loja";
        double valor = 1000;
        
        Finanza finanza = new Finanza(nom, banco, valor);
        
        finanza.establecerComision();
        
        System.out.printf("%s\n",finanza);
        
        //Objeto 2
        
        String nom2 = "Antonia Barra"; 
        String banco2 = "Banco Pichincha";
        double valor2 = 50500;
        
        Finanza finanza2 = new Finanza(nom2, banco2, valor2);
        
        finanza2.establecerComision();
        
        System.out.printf("%s\n",finanza2);
    }
    
}
