/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.Associacao.Test;

import academy.devdojo.maratonaJava.javaCore.Associacao.Dominio.Escola;
import academy.devdojo.maratonaJava.javaCore.Associacao.Dominio.Professor;

/**
 *
 * @author Gestão Tech
 */
public class EscolaTest01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Professor professor1 = new Professor("Jailson");
     Professor professor2 = new Professor("Cleber");
     Professor[] professores={professor1,professor2};
     
     Escola escola = new Escola("Escola Libero de Almeida Silvares",professores);
     escola.setProfessor(new Professor[10]);
     escola.imprimeEscola();
     
    }
    
}
