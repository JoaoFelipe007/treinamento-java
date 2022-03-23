/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.ClassesAbstratas.Dominio;

/**
 *
 * @author Gestão Tech
 */
public class Gerente extends Funcionario {

    private String funcao;

    public Gerente(String nome, double salario, int idade, String funcao) {
        super(nome, salario, idade);
        this.funcao = funcao;
    }

      @Override
    public void calcularBonus(){
        this.salario = this.salario + this.salario * 0.1;
    }
    
    
    @Override
    public void imprime() {
        super.imprime();
        System.out.println("Fundo do cargo de Gerente: "+funcao);
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

}
