/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.ModificadorFinal.Dominio;

/**
 *
 * @author Gestão Tech
 */
public class Carro {

    private String nome;
    public final Comprador COMPRADOR= new Comprador();
    public final double VELOCIDADE_LIMITE;
    private double velocidadeMax;

    {
        this.VELOCIDADE_LIMITE = 215;
    }

    public Carro() {
    }

    
    public Carro(String nome) {
        this.nome = nome;
    }

    public Carro(String nome, double velocidadeMax) {
        this.nome = nome;
        this.velocidadeMax = velocidadeMax;
    }

//    public void imprime() {
//        System.out.println("Marca do veiculo: " + this.nome);
//        System.out.println("Velocidade Maxima do carro: " + this.velocidadeMax);
//        System.out.println("Velocidade limite permitida por lei: " + this.VELOCIDADE_LIMITE);
//    }

    @Override
    public String toString() {
        return "Nome comprador " + COMPRADOR;
    }

    
    
    public Comprador getCOMPRADOR() {
        return COMPRADOR;
    }

    public double getVELOCIDADE_LIMITE() {
        return VELOCIDADE_LIMITE;
    }

    
    
    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(double velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
