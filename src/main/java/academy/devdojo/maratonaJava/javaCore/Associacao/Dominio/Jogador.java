/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.Associacao.Dominio;
import academy.devdojo.maratonaJava.javaCore.Associacao.Dominio.Time;

/**
 *
 * @author Gestão Tech
 */
public class Jogador {
    private String nome;
    private Time time;
    
    
    public Jogador(String nome) {
        this.nome = nome;
    }


    public void imprimeJogador(){
        System.out.println(this.nome);
        if(time !=null){
            System.out.println(time.getNomeTime());
        }
    
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
