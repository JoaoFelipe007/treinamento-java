/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.Exception.Exception;

/**
 *
 * @author Gestão Tech
 */
import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {

    public static void main(String[] args) throws IOException {
        criarNovoArquivo();

    }

    public static void criarNovoArquivo() throws IOException {
        File file = new File("C:\\Users\\Gestão Tech\\Desktop\\Joao\\Word.docx");
        File file2 = new File("C:\\Users\\Gestão Tech\\Desktop\\Joao\\ Excel.xls");
        try {
            System.out.println("arquivo2 criado " + file2.createNewFile());
            System.out.println("arquivo criado " + file.createNewFile());

        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
