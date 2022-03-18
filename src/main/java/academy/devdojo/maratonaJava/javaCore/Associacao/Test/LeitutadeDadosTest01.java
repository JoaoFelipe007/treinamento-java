/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.Associacao.Test;

import java.util.Scanner;

/**
 *
 * @author Gestão Tech
 */
public class LeitutadeDadosTest01 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
        System.out.println("Digite seu nome");
        String nome =entrada.nextLine();
        
        System.out.println("Digite sua idade");
        int idade =entrada.nextInt();
        
        System.out.println("Digite o filme que vc qer Assistir");
        String nomeFilme = entrada.nextLine();
        
        System.out.println("Digite o eu CPF ");
        String cpf =entrada.nextLine();
        
        System.out.println("Digite a qtd de assentos que vc quer comprar");
        int numeroDeAssentos =entrada.nextInt();
       
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*--*-*-*-*-*-*");
        
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Nome do Filme: "+nomeFilme);
        System.out.println("cpf: "+cpf);
        System.out.println("Numero de Assentos: "+numeroDeAssentos);
        
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*--*-*-*-*-*-*");
        
        System.out.println("Preço unico do igresso individual : R$ 17,00");
        System.out.println("Valor Total é: "+(numeroDeAssentos*17)+" R$");
       
    }   
}
