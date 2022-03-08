/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonaJava.Introducao;

/**
 *
 * @author Gestão Tech
 */
public class AulaArrays02 {
        public static void main(String[] args) {
        String[] nomes = new String [3];
       nomes[0] = "José";
       nomes[1] = "Maria";
       nomes[2] = "Mateus";
    //   nomes[3] = "Marta";
       
       for(int a=0;a<nomes.length;a++){ // com o nome.legth você não irá precisar colocar algum numero pq ele pegou a qtd da varaivel
            System.out.println("Seu nome é "+nomes[a]);
        }
       
       nomes = new String[3];
            System.out.println(nomes[0]);
            System.out.println(nomes[1]);
            System.out.println(nomes[2]);
       
    }
}
