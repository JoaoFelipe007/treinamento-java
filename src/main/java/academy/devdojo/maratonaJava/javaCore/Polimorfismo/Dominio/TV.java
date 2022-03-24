/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.Polimorfismo.Dominio;

/**
 *
 * @author Gestão Tech
 */
public class TV extends Produto {

    public static double valorImposto = 0.25;

    public TV(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularImposto() {
        return this.preco * valorImposto;
    }

}
