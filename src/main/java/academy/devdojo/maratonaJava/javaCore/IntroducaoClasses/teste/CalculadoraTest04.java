/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.IntroducaoClasses.teste;

import academy.devdojo.maratonaJava.javaCore.IntroducaoClasses.Dominio.Calculadora;

/**
 *
 * @author Gestão Tech
 */
public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        
      //  int[] num = {1,2,3,4,5,6};
    //    calculadora.somaArray(num);// feito usando Array
        
//        calculadora.somaVarArgs(1,2,3,4,5,6,7);// usandoVarArgs
      
      int soma = calculadora.multiplicarVaarargs(2,10,20,5,15);
        System.out.println(soma);
    }
}
