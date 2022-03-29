/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.Exception.Exception;

import academy.devdojo.maratonaJava.javaCore.Exception.Exception.Dominio.Funcionario;
import academy.devdojo.maratonaJava.javaCore.Exception.Exception.Dominio.LoginInvalidoException;
import academy.devdojo.maratonaJava.javaCore.Exception.Exception.Dominio.Pessoa;

/**
 *
 * @author Gestão Tech
 */
public class SobrescritaComException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();
        
        try{
            funcionario.salvar();
        }catch(LoginInvalidoException e){
            e.printStackTrace();
        }
    }
    
}
