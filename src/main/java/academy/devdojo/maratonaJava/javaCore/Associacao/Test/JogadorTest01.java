/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.Associacao.Test;

import academy.devdojo.maratonaJava.javaCore.Associacao.Dominio.Jogador;



/**
 *
 * @author Gestão Tech
 */
public class JogadorTest01 {

    public static void main(String[] args)  {
        Jogador jogador1 = new Jogador("Cristiano Ronaldo");
        Jogador jogador2 = new Jogador("Neymar");
        Jogador jogador3 = new Jogador("Messi");

        Jogador[] jogadores = new Jogador[]{jogador1, jogador2, jogador3};
        for(Jogador jogador : jogadores){
            jogador.imprimeJogador();
        }
    }

}
