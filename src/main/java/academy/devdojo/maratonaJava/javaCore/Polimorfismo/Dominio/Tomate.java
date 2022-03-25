/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.Polimorfismo.Dominio;

/**
 *
 * @author Gestão Tech
 */
public class Tomate extends Produto {

     private String dataValiadade;
    public static double valorImposto = 0.30;

    public Tomate(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando o valor do imposto do pc");
        return this.preco * valorImposto;
    }

    public String getDataValiadade() {
        return dataValiadade;
    }

    public void setDataValiadade(String dataValiadade) {
        this.dataValiadade = dataValiadade;
    }
    
    
}
