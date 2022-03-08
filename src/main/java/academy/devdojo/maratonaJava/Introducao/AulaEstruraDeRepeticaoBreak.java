/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonaJava.Introducao;

/**
 *
 * @author Gestão Tech
 */
public class AulaEstruraDeRepeticaoBreak {
    public static void main(String[] args) {
        for(int i =0;i<=50;i++){
            if(i >25){
            break; 
            }
            System.out.println("Esse é o numero "+i);
            }
        System.out.println("*************************");
        // Exercicio: Dadod o valor do carro, descubra em quantas vezes ele pode ser parcelado
        // Condição valorParcela >= 1000;
        double valorCarro = 30000;
        for(int parcela= 1;parcela <= valorCarro; parcela++){
           double valorParcela = valorCarro / parcela;
            if(valorParcela < 1000){
                break;
            }
                System.out.println("Parcela "+ parcela + "R$ "+valorParcela);
        }
        System.out.println("*************************");
        for(int parcelaa= (int) valorCarro ;parcelaa >=1; parcelaa--){
            double valorParcelaa = valorCarro/parcelaa;
                if(valorParcelaa < 1000){
                       continue;
                 }
                System.out.println("Parcela "+parcelaa +"° " +" R$ "+valorParcelaa);
                }      
    }
   
}
