/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.Polimorfismo.Test;

import academy.devdojo.maratonaJava.javaCore.Polimorfismo.servico.RepositorioArquivo;
import academy.devdojo.maratonaJava.javaCore.Polimorfismo.repositorio.repositorio;
import academy.devdojo.maratonaJava.javaCore.Polimorfismo.servico.RepositorioBancoDeDados;

/**
 *
 * @author Gestão Tech
 */
public class PolimorfismoTest03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
    }
    
}
