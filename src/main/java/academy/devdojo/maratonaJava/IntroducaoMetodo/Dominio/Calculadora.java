/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonaJava.IntroducaoMetodo.Dominio;

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
}
