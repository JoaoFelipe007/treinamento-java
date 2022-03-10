/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.IntroducaoClasses.teste;

import academy.devdojo.maratonaJava.javaCore.IntroducaoClasses.Dominio.CarroAtividade;

/**
 *
 * @author Gestão Tech
 */
public class CarroTeste {
    public static void main(String[] args) {
        CarroAtividade carro = new CarroAtividade();
        CarroAtividade carro2 = new CarroAtividade();
        
        carro.nome = "Corolla";
        carro.ano = 2022;
        carro.modelo ="Toyota Corolla GLi 2.0 Flex";
        
        carro2.nome = "Porsche";
        carro2.ano = 2021;
        carro2.modelo ="sport";
        
        carro = carro2;
    
        System.out.println("Meu carro é o "+carro.nome+", ele é do modelo "+carro.modelo+" do ano de "+carro.ano);
       
        System.out.println("///////////////////////////////////////");
      
      
        System.out.println("O meu carro é um "+carro2.nome+", do ano de "+carro2.ano+" que é um modelo "+carro2.modelo);
         
    }
    
}
