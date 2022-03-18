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
public class TimeTest01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Rildo");
        Jogador jogador2 = new Jogador("Nilmar");
        Jogador jogador3 = new Jogador("Fred");
        Jogador jogador4 = new Jogador("Alan Kardeck");
        Jogador jogador5 = new Jogador("Gilberto");
       Jogador[] jogadores ={jogador1, jogador2, jogador3, jogador4, jogador5};
       Time time = new Time("VASCO", jogadores); 
       
       jogador1.setTime(time);
       jogador2.setTime(time);
        System.out.println("---Classe jogadores---");
        jogador2.imprimeJogador();
        jogador1.imprimeJogador();
        System.out.println("---Classe Time---");
       time.imprimeTime();
    }
    
}
