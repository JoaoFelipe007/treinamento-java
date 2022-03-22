/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.ModificadorFinal.Test;

import academy.devdojo.maratonaJava.javaCore.ModificadorFinal.Dominio.Carro;
import academy.devdojo.maratonaJava.javaCore.ModificadorFinal.Dominio.Comprador;

/**
 *
 * @author Gestão Tech
 */
public class CarroTest01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(carro.getCOMPRADOR());
        carro.COMPRADOR.setNomeComprador("jOSÉ");
        System.out.println(carro.toString());
    }
    
}
