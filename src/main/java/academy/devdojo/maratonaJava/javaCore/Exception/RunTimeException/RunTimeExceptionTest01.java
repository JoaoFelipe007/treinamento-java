/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.Exception.RunTimeException;

/**
 *
 * @author Gestão Tech
 */
public class RunTimeExceptionTest01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("O resultado da divisão é: "+divisao(8, 0));
    }

    private static int divisao(int A, int B) {
        if (B == 0) {
            throw new IllegalArgumentException("Argumento ilegal, não pode ser zero");
        }
        return A / B;

    }
}
