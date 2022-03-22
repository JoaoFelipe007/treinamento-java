/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.Heranca.Dominio;

/**
 *
 * @author Gestão Tech
 */
public class Funcionario extends Pessoa {

    private double salario;

    
    static{
        System.out.println("Dentro do inicializador estatico de Funcionario");
    }
    {
        System.out.println("Dentro do inicializador de Funcionario 1");
    }
    {
        System.out.println("Dentro do inicializador de Funcionario 2");
    }
    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de funcionario");
    }

    @Override
    public void imprime() {
        super.imprime();
        if (salario != 0) {
            System.out.println("salario: " + this.salario);
        }
    }

    public void nomeFunc() {
        System.out.println("Eu " + this.nome + " recebi o salario de " + this.salario + " Reais");

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
