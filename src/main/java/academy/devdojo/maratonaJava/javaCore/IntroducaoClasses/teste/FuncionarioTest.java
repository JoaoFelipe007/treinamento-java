/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.IntroducaoClasses.teste;

import academy.devdojo.maratonaJava.javaCore.IntroducaoClasses.Dominio.Funcionario;

/**
 *
 * @author Gestão Tech
 */
public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNomeFuncionario("João Felipe");
        funcionario.setIdade(19);
        funcionario.setSalarios(new double[]{2500, 3250.87, 600});
         funcionario.imprimirDados();
        
        System.out.println("Media: "+funcionario.getMedia());
    }
    
}
