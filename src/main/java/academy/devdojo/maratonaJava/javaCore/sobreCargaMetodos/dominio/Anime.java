/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.sobreCargaMetodos.dominio;

/**
 *
 * @author Gestão Tech
 */
public class Anime {
 private String tipo;
 private int episodios;
 private String nomeAnime;
 private int anoLancamento;
 
 
 
 public void init(String tipo, int episodios, String nome){
    this.nomeAnime = nome;
    this.tipo = tipo;
    this.episodios = episodios;
 }

public void init(String tipo, int espisodios, String nome, int anoLancamento){
    this.init(tipo, episodios, nome);
    this.anoLancamento = anoLancamento;
}
 public void imprimeAnime(){
     System.out.println("Nome do Anime: "+this.nomeAnime);
     System.out.println("Tipo do anime: "+this.tipo);    
     System.out.println("Quantidade de episodios: "+this.episodios);    
     System.out.println("Quantidade de episodios: "+this.anoLancamento);    
 }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public String getNomeAnime() {
        return nomeAnime;
    }

    public void setNomeAnime(String nomeAnime) {
        this.nomeAnime = nomeAnime;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
 
 
}
