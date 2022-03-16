/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.modificadorStatic.Test;

import academy.devdojo.maratonaJava.javaCore.modificadorStatic.Dominio.Carro;

/**
 *
 * @author Gestão Tech
 */
public class CarroTest {
    public static void main(String[] args) {
       Carro carro1 = new Carro("BMW",275);
       Carro carro2 = new Carro("Porsche",280);
       Carro carro3 = new Carro("Mercedea",290);
       
       Carro.setVelocidadeLimite(210);
       
       carro1.imprimeCarro();
       carro2.imprimeCarro();
       carro3.imprimeCarro();
}
}