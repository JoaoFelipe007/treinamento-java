/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.Polimorfismo.Dominio;

/**
 *
 * @author Gestão Tech
 */
public class Computador extends Produto {
    
            public static double valorImposto = 0.30; 
    public Computador(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando o valor do imposto do pc");
        return this.preco * valorImposto;
    }
    
    
}
