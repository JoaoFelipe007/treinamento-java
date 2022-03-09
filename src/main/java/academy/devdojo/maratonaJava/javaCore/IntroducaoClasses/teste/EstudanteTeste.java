/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.IntroducaoClasses.teste;

import academy.devdojo.maratonaJava.javaCore.IntroducaoClasses.Dominio.Estudante;

/**
 *
 * @author Gestão Tech
 */

public class EstudanteTeste {
    public static void main(String[] args) {
     Estudante estudante = new Estudante();
     Estudante estudante1 = new Estudante();
     estudante.idade =18;
     estudante.sexo= 'M';
     estudante1.sexo= 'F';
     estudante1.idade= 20;
     estudante1.nome = "Raianne";
     
     
     
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
         
        System.out.println("///////////////////////////////////////");
        
         System.out.println(estudante1.nome);
        System.out.println(estudante1.idade);
        System.out.println(estudante1.sexo);
     
     
   }
}
