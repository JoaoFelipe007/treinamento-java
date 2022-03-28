/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.Exception.Exception.Dominio;

/**
 *
 * @author Gestão Tech
 */
public class LoginInvalidoException extends Exception{

    public LoginInvalidoException() {
        System.out.println("Sem parametros para acessar");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
    
}
