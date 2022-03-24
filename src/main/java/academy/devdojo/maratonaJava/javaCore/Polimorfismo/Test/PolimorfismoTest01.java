/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.Polimorfismo.Test;

import academy.devdojo.maratonaJava.javaCore.Polimorfismo.Dominio.Computador;
import academy.devdojo.maratonaJava.javaCore.Polimorfismo.Dominio.TV;
import academy.devdojo.maratonaJava.javaCore.Polimorfismo.Dominio.Tomate;
import academy.devdojo.maratonaJava.javaCore.Polimorfismo.servico.CalcularImposto;

/**
 *
 * @author Gestão Tech
 */
public class PolimorfismoTest01 {

    public static void main(String[] args) {
        Computador computador = new Computador("Notebook Leneovo i3", 3000.00);
        Tomate tomate = new Tomate("Tomate Americano", 12.50);
        TV tv = new TV("Sanssung 50\"",5000);
        CalcularImposto.calcularImposto(computador);
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        CalcularImposto.calcularImposto(tomate);
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        CalcularImposto.calcularImposto(tv);
    }

}
