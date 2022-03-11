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
public class EstudanteTest03 {
    public static void main(String[] args) {
    Estudante estudante01 = new Estudante();
    Estudante estudante02 = new Estudante();
    
    estudante01.nome="Sonic";
    estudante01.idade=45;
    estudante01.sexo='m';
    
    estudante02.nome="Helio";
    estudante02.idade=150;
    estudante02.sexo='M';
    
    estudante02.imprimir();
    estudante01.imprimir();
    
    
            }
}
