/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.String.Test;

import java.util.Date;

/**
 *
 * @author Gestão Tech
 */
public class StrignBuilderTest01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome = "João";
        nome = nome.concat(" Felipe");
        nome.substring(0, 3);
        System.out.println(nome);
        StringBuilder nome2 = new StringBuilder("Cristinao");// cria variavel de referencia da StringBuilder
        nome2.append(" Ronaldo").append(" Aveiro");// faz a concatenação de da StringBuilder
        nome2.reverse();//coloca a palavra ao contrario
        nome2.reverse();
        nome2.delete(0, 2);
        System.out.println(nome2);
    }

}