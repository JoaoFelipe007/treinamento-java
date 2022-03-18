/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.Associacao.Atividade.Dominio;

import academy.devdojo.maratonaJava.javaCore.Associacao.Atividade.Aluno;
import academy.devdojo.maratonaJava.javaCore.Associacao.Atividade.Local;
import academy.devdojo.maratonaJava.javaCore.Associacao.Atividade.Seminario;
import academy.devdojo.maratonaJava.javaCore.Associacao.Atividade.Professor;

/**
 *
 * @author Gestão Tech
 */
public class SeminarioTest01 {

    public static void main(String[] args) {
        //Variveis de Referencias
        Local local = new Local("Parte norte da Faculdade no anfiteatro");
        Local loca2 = new Local("Parte Leste da Faculdade na SALA 15");
        Seminario seminario = new Seminario("Internet das Coisas");
        Seminario seminario2 = new Seminario("Recriando Sites");
        Aluno aluno = new Aluno("José Bezzera", 19);
        Aluno aluno2 = new Aluno("Carlos Alex", 21);
        Aluno aluno3 = new Aluno("Moises", 25);
        Professor professor = new Professor("Derci Duarte", "Programação Avançada");
        Aluno[] alunos = {aluno, aluno3};
        Aluno[] alunos2 = {aluno2};
        Seminario[] seminarios = {seminario, seminario2};

        // set's
        aluno.setSeminario(seminario);
        aluno.setLocal(local);
        aluno2.setSeminario(seminario2);
        aluno2.setLocal(loca2);
        aluno3.setSeminario(seminario);
        aluno3.setLocal(local);

        seminario.setAlunos(alunos);
        seminario.setLocal(local);
        seminario2.setAlunos(alunos2);
        seminario2.setLocal(loca2);

        professor.setSeminario(seminarios);

        //imprime
        System.out.println("      ---Aluno---");
        aluno.imprimeAluno();
        aluno2.imprimeAluno();
        aluno3.imprimeAluno();

        System.out.println("        ---Seminario---");
        seminario.imprimeSeminario();
        seminario2.imprimeSeminario();

        System.out.println("       ---Professor---");
        professor.imprimeProfessor();
    }
}
