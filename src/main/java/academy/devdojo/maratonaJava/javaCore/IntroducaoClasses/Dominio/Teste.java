/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.IntroducaoClasses.Dominio;

/**
 *
 * @author Gestão Tech
 */
public class Teste {
    public String[] imprimeNomes(String...nomes){
       
        for(String nome: nomes){
            System.out.println(nome);
       }
       
        return nomes;
    }
}
