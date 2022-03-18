/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.Associacao.Atividade;

/**
 *
 * @author Gestão Tech
 */
public class Seminario {

    private String titulo;
    private Aluno[] alunos;
    private Local local;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, Aluno[] alunos, Local local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
    }

    public void imprimeSeminario(){
        System.out.println("Nome do seminario: "+this.titulo);
        System.out.println("Local onde será realizado: "+local.getEndereco());
        if(alunos == null) return;
        System.out.println("Lista de Alunos que irão fazer o seminario:");
        for(Aluno aluno : alunos){
            System.out.println(" "+aluno.getNomeAluno());
        }
        System.out.println("");
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


  
}
