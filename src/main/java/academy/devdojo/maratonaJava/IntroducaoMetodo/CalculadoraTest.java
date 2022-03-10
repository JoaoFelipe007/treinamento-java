/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonaJava.IntroducaoMetodo;

import academy.devdojo.maratonaJava.IntroducaoMetodo.Dominio.Calculadora;

/**
 *
 * @author Gestão Tech
 */
public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        // atributos
        calculadora.numero = 20;
        calculadora.numero2 = 45;
        calculadora.numeroSubtracao = 548;
        calculadora.numero2Subtracao = 322;
            
        //Metodos
        double result =  calculadora.divisaoDoiNumeros(3, 0);// Metodo com retorno
        calculadora.multiplicacaoDoisNumeros(15, 40);// metodo com parametro
        calculadora.somaDoisNumeros();
        calculadora.subtracaoDoisNumeros();
        
        //Retorno do metodo divisão
         System.out.println("O resultado da Divisão é: "+result);
    }
}
