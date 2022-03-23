/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.ClassesAbstratas.Dominio;

/**
 *
 * @author Gestão Tech
 */
public abstract class Funcionario {
    protected String nome;
    protected double salario;
    protected int idade;

    public Funcionario(String nome, double salario, int idade) {
        this.nome = nome;
        this.salario = salario;
        this.idade = idade;
        calcularBonus();
    }

    public void imprime(){
        System.out.println("Nome do funcionario: "+this.nome);
        System.out.println("Idade do funcionario: "+this.idade);
        System.out.println("Salario do funcionario: "+this.salario);
    }
    
    
    public abstract void calcularBonus();
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
}
