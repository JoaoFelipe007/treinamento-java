/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonaJava.Introducao;

/**
 *
 * @author João
 */
public class Aula04Operadores {
    public static void main(String[] args) {
         int numero1 = 10;
         int numero2 = 20;
         double conta = numero1/(double) numero2;
         System.out.println("O valor é esse "+numero1*numero2);
         System.out.println("O valor da conta 10/20 é: "+ conta);
         
         //%
         int resto = 29%6;
         System.out.println(resto);
         
         //< > <= >= == !=
         boolean isMaiorQue = 20 < 10;
         boolean isMenorQue = 30 < 40;
         boolean isIgualQue = 15 == 15;
         boolean isIgualOuMenor = 15<=20;
         boolean isIgualOuMaior = 15>=20;
         boolean isDiferente = 15!=20;

         System.out.println(" Vinte é maior que Dez é "+isMaiorQue);
         System.out.println(" 30 é Menor que 40 é "+isMenorQue);
         System.out.println("15 é igual a 15 é " +isIgualQue);
        System.out.println("15 é igual ou menor que 20 é "+isIgualOuMenor);
        System.out.println("15 é igual ou maoir que 20 é "+isIgualOuMaior);
        System.out.println("15 é diferente de 20 é "+isDiferente);
    }
}
