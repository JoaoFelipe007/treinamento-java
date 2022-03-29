/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.Exception.Exception.Dominio;

/**
 *
 * @author Gestão Tech
 */
public class Funcionario extends Pessoa{
    @Override
    public void salvar()throws LoginInvalidoException, ArrayIndexOutOfBoundsException{
        System.out.println("Salvando Funcionario");
    }
}
