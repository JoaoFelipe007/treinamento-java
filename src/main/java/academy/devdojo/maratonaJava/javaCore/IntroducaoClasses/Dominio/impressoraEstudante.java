/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.IntroducaoClasses.Dominio;

/**
 *
 * @author Gestão Tech
 */
public class impressoraEstudante {
    public void imprimir(Estudante estudante){
        System.out.println("---------------------------");
        
        System.out.println("Nome estudante: "+estudante.nome);
        System.out.println("idade do estudante: "+estudante.idade);
        System.out.println("O sexo do estudante: "+estudante.sexo);

        estudante.nome ="Bruno";
    }
}

