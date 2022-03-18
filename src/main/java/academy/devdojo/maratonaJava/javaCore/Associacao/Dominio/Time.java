/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.Associacao.Dominio;

/**
 *
 * @author Gestão Tech
 */
public class Time { 
 private String time;
 private Jogador[] jogadores;

    public Time(String time) {
    this.time = time;
    }

    public Time(String time, Jogador[] jogadores) {
        this.time = time;
        this.jogadores = jogadores;
    }


    public void imprimeTime(){
        System.out.println("Nome do time: "+this.time);
        System.out.println("Lista de Jogadores vinculado ao time são: ");
        if(jogadores == null) return;
        for(Jogador jogador : jogadores){
            System.out.println("Nome do jogador: "+jogador.getNome());
        }
    }
    
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }
 
 public String getNomeTime() {
        return time;
    }

    public void setNomeTime(String time) {
        this.time = time;
    }
 
}
