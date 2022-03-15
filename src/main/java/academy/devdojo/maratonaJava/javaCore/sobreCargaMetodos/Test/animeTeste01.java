/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.sobreCargaMetodos.Test;

import academy.devdojo.maratonaJava.javaCore.sobreCargaMetodos.dominio.Anime;

/**
 *
 * @author Gestão Tech
 */
public class animeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("TV", 545, "Narutin",2002);
        anime.imprimeAnime();
        System.out.println("*/*/*/*/*/*/*/*/*/*/");
    }
}
