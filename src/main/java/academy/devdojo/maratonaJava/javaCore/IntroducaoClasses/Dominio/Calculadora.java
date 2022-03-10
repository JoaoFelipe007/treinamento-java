/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.IntroducaoClasses.Dominio;

/**
 *
 * @author Gestão Tech
 */
public class Calculadora {
    
        public int numero;
        public int numero2;
        public int numeroSubtracao;
        public int numero2Subtracao;
        
        public void somaDoisNumeros(){
            System.out.println("O resultado da soma desses dois numeros é: "+(numero2 + numero));
        }
        
        public void subtracaoDoisNumeros(){
            System.out.println("A subitração dos outros dois numeros é: "+(numeroSubtracao - numero2Subtracao));
        }

        public void multiplicacaoDoisNumeros(int num, int num2){
            System.out.println("A multiplicação entre esses dois numeros é de: "+(num*num2));
        }
        
        public double divisaoDoiNumeros(double num, int num2){
            if(num2 == 0){
                return 0;
            }
            return  num/num2;
        }
        
        public void imprimeDoisNumeros(int num, int num2){
        if(num2 == 0){
            System.out.println("é impossivel a fazer a divisão");
            return;
        }
            System.out.println("O resultado da divisão é "+(num/num2));
        }
        
        public void altereDoisValores(int num, int num2){
            num = 88;
            num2 = 45;
            System.out.println("Dentreo do Metodo");
            System.out.println("Num "+ num);
            System.out.println("Num2 "+ num2);
        }
        public void incrementa (int num) {
            num = 15;
            System.out.println("Num incrementado: "+num);
                 
        }
        
       public void copia(int numero){
           System.out.println("c do Metodo= "+(numero+2));
       }
        
}
