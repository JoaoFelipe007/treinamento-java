/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.String.Test;

/**
 *
 * @author Gestão Tech
 */
public class StringTest02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome = "  Goku";
        System.out.println(nome);
        System.out.println(nome.charAt(2));//Mostra a posição da Letra
        System.out.println(nome.charAt(3));
        System.out.println(nome.charAt(4));
        System.out.println(nome.charAt(5));
        System.out.println(nome.length());//Mostra a qtd de character
        System.out.println(nome.replace("k", "s"));//substitui uma Eltra por outra
        System.out.println(nome.toLowerCase());//Deixa toda minuscula
        System.out.println(nome.toUpperCase());//Deixa toda MAISCULA
        System.out.println(nome.substring(1));//Mostra a palavra A parit de uma letra/posição
        System.out.println(nome.trim());// tira os espaço
    }
    
}
