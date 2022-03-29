/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.String.Test;

/**
 *
 * @author Gestão Tech
 */
public class StringTest01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String  nome = "Willian";
        String  nome2 = "Willian";
         nome = nome.concat(" Suane");
        System.out.println(nome == nome2);
        System.out.println(nome);
        System.out.println(nome2);
        String nome3 = new String("Willian");
        System.out.println((nome2 == nome3));
        System.out.println((nome2 == nome3.intern()));
    }
    
}
