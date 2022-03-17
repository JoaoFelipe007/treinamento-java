/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.Associacao.Test;

import academy.devdojo.maratonaJava.javaCore.Associacao.Dominio.Jogador;
import academy.devdojo.maratonaJava.javaCore.Associacao.Dominio.Time;

/**
 *
 * @author Gestão Tech
 */
public class JogadorTest02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cristiano Ronaldo");
        Time time = new Time("Manchester United");
    
         jogador.setTime(time);
         jogador.imprimeJogador();
    
    }
    
}
