/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.IntroducaoClasses.teste;

import academy.devdojo.maratonaJava.javaCore.IntroducaoClasses.Dominio.Professor;

/**
 *
 * @author Gestão Tech
 */
public class ProfessorTeste {
    public static void main(String[] args) {
       
 Professor professor = new Professor();
 professor.nome = "Junior";
 professor.idade = 40;
 professor.sexo = 'M';
 
        System.out.print("Meu nome é "+professor.nome+" sou professor,"+" tenho "+professor.idade+" anos de idade"+" e sou do sexo "+professor.sexo);
        
 
    }
}
