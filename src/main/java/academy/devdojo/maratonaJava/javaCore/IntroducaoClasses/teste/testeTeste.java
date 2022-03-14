/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.IntroducaoClasses.teste;

import academy.devdojo.maratonaJava.javaCore.IntroducaoClasses.Dominio.Teste;

/**
 *
 * @author Gestão Tech
 */
public class testeTeste {
    public static void main(String[] args) {
        Teste teste = new Teste();
        
        int cont = teste.imprimeNomes("Gustavo","Joao","Lucas","Gutavo");
        
        System.out.println(cont);
    }
}
