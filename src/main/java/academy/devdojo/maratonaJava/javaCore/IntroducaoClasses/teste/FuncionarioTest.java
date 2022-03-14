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
        funcionario.nomeFuncionario ="João Felipe de Paula Silva";
        funcionario.idade =19;
        funcionario.funcao ="programador";
        funcionario.anoEntrada =2019;
        funcionario.anoAtual =2022;
        funcionario.salarios = new double[]{2500, 3250.87, 600};
       funcionario.imprimirDados();
        
    }
    
}
