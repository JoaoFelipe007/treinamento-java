/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.Construtores.Test;

import academy.devdojo.maratonaJava.javaCore.Construtores.Dominio.Anime;

/**
 *
 * @author Gestão Tech
 */
public class AnimeTest {
     public static void main(String[] args) {
        Anime anime = new Anime("TV", 545, "Narutin",2005);
        Anime anime2 = new Anime();
        anime.imprimeAnime();
        System.out.println("*/*/*/*/*/*/*/*/*/*/");
        anime2.imprimeAnime();
   
}
}