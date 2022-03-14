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
    public int imprimeNomes(String...nomes){
      String padrao = "Gustavo";
        
        int qtd = 0;
        for(String nome: nomes){
            if(nome.equals(padrao)){
                qtd++;
            }
       }
       
        return qtd;
    }
}
