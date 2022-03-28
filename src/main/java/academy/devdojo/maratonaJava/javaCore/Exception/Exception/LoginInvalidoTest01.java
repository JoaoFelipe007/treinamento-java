/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.Exception.Exception;

import academy.devdojo.maratonaJava.javaCore.Exception.Exception.Dominio.LoginInvalidoException;
import java.util.Scanner;

/**
 *
 * @author Gestão Tech
 */
public class LoginInvalidoTest01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            logar();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner teclado = new Scanner(System.in);
        String NomeUsuario = "Peter Parker";
        String senha = "amazingSpiderMan01";
        System.out.println(" Nome do Usuario");
        String nomeDigitado = teclado.nextLine();
        System.out.println("Login do Usuario");
        String senhaDigitada = teclado.nextLine();
        if (!NomeUsuario.equals(nomeDigitado) || !senha.equals(senhaDigitada)) {
            System.out.println("Senha ou login Invalidos");
        }else{
         System.out.println("Usuario Logado com sucesso");
        }
       
    }

}
