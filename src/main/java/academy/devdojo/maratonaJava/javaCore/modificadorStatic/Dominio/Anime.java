/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.modificadorStatic.Dominio;

import academy.devdojo.maratonaJava.javaCore.BlocosInicializacao.Dominio.*;

/**
 *
 * @author Gestão Tech
 */
public class Anime {
    private String nome;
    private static int[] episodios;
    
    static{
        System.out.println("Dentro do Bloco de Inicialização");
        episodios = new int[100];
        for(int i = 0; i< episodios.length; i++){
        episodios[i] = i+1;
        }
    }
    public Anime(String nome){this.nome = nome;}
    
    public Anime() {
     for(int episodio : Anime.episodios){
         System.out.print(episodio+"\n");
     }
    }

    public void imprimeAnime(){
        System.out.println(this.nome);
         for(int episodio : Anime.episodios){
             System.out.print(episodio+" ");
         }
     }
// 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static int[] getEpisodios() {
        return episodios;
    }

    public static void setEpisodios(int[] episodios) {
        Anime.episodios = episodios;
    }
     
    
}
