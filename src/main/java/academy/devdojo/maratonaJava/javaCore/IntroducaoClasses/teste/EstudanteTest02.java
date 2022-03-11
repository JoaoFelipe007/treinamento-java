/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.IntroducaoClasses.teste;

import academy.devdojo.maratonaJava.javaCore.IntroducaoClasses.Dominio.Estudante;
import academy.devdojo.maratonaJava.javaCore.IntroducaoClasses.Dominio.impressoraEstudante;

/**
 *
 * @author Gestão Tech
 */
public class EstudanteTest02 {
   public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        impressoraEstudante impressora = new impressoraEstudante();
        
        estudante.nome = "João Felipe";
        estudante.idade = 19;
        estudante.sexo = 'M';
        
        estudante2.nome = "Raianne";
        estudante2.idade = 17;
        estudante2.sexo = 'F';
        
        impressora.imprimir(estudante);
        impressora.imprimir(estudante2);
         
        System.out.println("+++++++++++++++++++++++++");
        
        //impressora.imprimir(estudante);
        //impressora.imprimir(estudante2);
        
        
       
   }
}
