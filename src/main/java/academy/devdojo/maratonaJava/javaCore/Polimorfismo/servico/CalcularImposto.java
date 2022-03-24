/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.Polimorfismo.servico;

import academy.devdojo.maratonaJava.javaCore.Polimorfismo.Dominio.Computador;
import academy.devdojo.maratonaJava.javaCore.Polimorfismo.Dominio.Tomate;

/**
 *
 * @author Gestão Tech
 */
public class CalcularImposto {
    public static void calcularImpostoComputador(Computador computador){
        System.out.println("Dados da Compra do Computador");
         double imposto = computador.calcularImposto();
         System.out.println("Tipo do Computador: "+computador.getNome());
         System.out.println("Preço do Computador: "+computador.getPreco());
         System.out.println("Valor do imposto: "+imposto);
    }
    
    public static void calcularImpostoTomate(Tomate tomate){
        System.out.println("Dados da compra do tomate");
        double imposto = tomate.calcularImposto();
        System.out.println("Tipo do Tomate: "+tomate.getNome());
        System.out.println("Preço total do tomate: "+tomate.getPreco());
        System.out.println("Valor do Imposto: "+imposto);
    }
}
