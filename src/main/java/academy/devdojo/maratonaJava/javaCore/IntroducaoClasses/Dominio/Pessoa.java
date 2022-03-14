/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.IntroducaoClasses.Dominio;

/**
 *
 * @author Gestão Tech
 */
public class Pessoa {
    private String nome;
    private int idade;
    
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }
    
    public void setNome(String nome){
    this.nome = nome;
    }
    
    public void setIdade(int idade){
        if(idade<0){
            System.out.println("Idade Invalida");
            return;
        }
    this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

}
