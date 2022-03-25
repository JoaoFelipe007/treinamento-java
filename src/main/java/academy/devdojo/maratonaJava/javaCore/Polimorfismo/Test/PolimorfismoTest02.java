/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.Polimorfismo.Test;

import academy.devdojo.maratonaJava.javaCore.Polimorfismo.Dominio.Computador;
import academy.devdojo.maratonaJava.javaCore.Polimorfismo.Dominio.Tomate;
import academy.devdojo.maratonaJava.javaCore.Polimorfismo.servico.CalcularImposto;

/**
 *
 * @author Gestão Tech
 */
public class PolimorfismoTest02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Computador computador = new Computador("Notebook Leneovo i3", 3000.00);
        Tomate tomate = new Tomate("Tomate Americano", 12.50);
        tomate.setDataValiadade("11/02/2024");
        
        CalcularImposto.calcularImposto(computador);
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        CalcularImposto.calcularImposto(tomate);
    }
    
}
