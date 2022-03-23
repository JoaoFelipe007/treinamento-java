/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.ClassesAbstratas.Test;

import academy.devdojo.maratonaJava.javaCore.ClassesAbstratas.Dominio.Gerente;

/**
 *
 * @author Gestão Tech
 */
public class Funcionario01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Draco Malfoy", 3500.45, 17, "Fazer a gerencia da empresa, com isso engloba gestão de pessoas e desempenho");
        gerente.imprime();
    }

}
