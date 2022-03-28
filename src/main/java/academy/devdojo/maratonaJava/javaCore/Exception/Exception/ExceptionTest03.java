/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.Exception.Exception;

import academy.devdojo.maratonaJava.javaCore.Exception.Exception.Dominio.Leitor1;
import academy.devdojo.maratonaJava.javaCore.Exception.Exception.Dominio.Leitor2;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 *
 * @author Gestão Tech
 */
public class ExceptionTest03 {

    public static void main(String[] args) {
        lerArquivo();
        System.out.println("*-+*-+*-+*-+*-+*-+*-+*");
        lerArquivo2();
    }

    public static void lerArquivo() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\Gestão Tech\\Desktop\\text.txt"));
            System.out.println("Lido com sucesso");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Erro em Abrir o Arquivo");
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                    System.out.println("Fechado com Sucesso");
                }
            }catch(IOException exception){
                exception.printStackTrace();
                System.out.println("Erro ao tentar fechar o arquivo");
            }
        }
    }
    
    
    public static void lerArquivo2(){
    try(Leitor1 leitor1 = new Leitor1();
        Leitor2 leitor2 = new Leitor2()){
    
    }catch(IOException e){
    e.printStackTrace();
    }
        }
}
