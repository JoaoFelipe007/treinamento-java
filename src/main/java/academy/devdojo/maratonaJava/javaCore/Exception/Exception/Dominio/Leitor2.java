/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.Exception.Exception.Dominio;

import java.io.Closeable;
import java.io.IOException;

/**
 *
 * @author Gestão Tech
 */
public class Leitor2 implements  Closeable{
    @Override
    public void close() throws IOException {
        System.out.println("Fechando Leitor 2");
    }

}
