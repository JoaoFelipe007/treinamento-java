/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.Polimorfismo.servico;

import academy.devdojo.maratonaJava.javaCore.Polimorfismo.repositorio.repositorio;

/**
 *
 * @author Gestão Tech
 */
public class RepositorioArquivo implements repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo");
    }
    
    
}
