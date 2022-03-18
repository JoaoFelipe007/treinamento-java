/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.Associacao.Atividade;

/**
 *
 * @author Gestão Tech
 */
public class Aluno {

    private String nomeAluno;
    private int idade;
    private Seminario seminario;
    private Local local;

    public Aluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public Aluno(String nomeAluno, int idade) {
        this.nomeAluno = nomeAluno;
        this.idade = idade;
    }

    public Aluno(String nomeAluno, int idade, Seminario seminario) {
        this(nomeAluno, idade);
        this.seminario = seminario;
    }

    public void imprimeAluno() {
        System.out.println("Nome do aluno: " + this.nomeAluno);
        System.out.println("Idade do aluno: " + this.idade);
        System.out.println("Seminário escolhido: " + seminario.getTitulo());
        System.out.println("Local do seminário : "+local.getEndereco());
        System.out.println("");
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

}
