/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.IntroducaoClasses.teste;

import academy.devdojo.maratonaJava.javaCore.IntroducaoClasses.Dominio.Pessoa;

/**
 *
 * @author Gestão Tech
 */
public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        
        pessoa.setNome("Cristiano Ronaldo");
        pessoa.setIdade(37);
         pessoa.imprime();
        System.out.println("++++++++++++++++++++++++++++++++");
       //GETTER
        System.out.println(pessoa.getNome());
       
    }   
}
