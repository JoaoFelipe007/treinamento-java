/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.Polimorfismo.servico;

import academy.devdojo.maratonaJava.javaCore.Polimorfismo.Dominio.Computador;
import academy.devdojo.maratonaJava.javaCore.Polimorfismo.Dominio.Produto;
import academy.devdojo.maratonaJava.javaCore.Polimorfismo.Dominio.Tomate;

/**
 *
 * @author Gestão Tech
 */
public class CalcularImposto {
   
    public static void calcularImposto(Produto produto){
        System.out.println("Dados da compra do tomate");
        double imposto = produto.calcularImposto();
        System.out.println("Tipo do Tomate: "+produto.getNome());
        System.out.println("Preço total do tomate: "+produto.getPreco());
        System.out.println("Valor do Imposto: "+imposto);
        if(produto instanceof Tomate){
            Tomate tomate = (Tomate) produto;
            System.out.println("Data da validade do tomate: "+tomate.getDataValiadade());
        }
    }
}
