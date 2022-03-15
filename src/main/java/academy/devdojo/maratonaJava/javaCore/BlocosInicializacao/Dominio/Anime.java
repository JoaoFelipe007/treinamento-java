/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.BlocosInicializacao.Dominio;

/**
 *
 * @author Gestão Tech
 */
public class Anime {
    private String nome;
    private int[] episodios = {1,2,3,4,5,6,7,8,9,10,11,12};

      
    
    public Anime() {
     for(int episodio : this.episodios){
         System.out.print(episodio+" ");
     }
    }

    public void imprimeAnime(){
        System.out.println(this.nome);
         for(int episodio : this.episodios){
             System.out.println(episodio+" ");
         }
     }
 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }
     
    
}
