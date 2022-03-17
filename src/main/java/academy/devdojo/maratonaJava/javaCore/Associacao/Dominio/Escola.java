/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.Associacao.Dominio;
import academy.devdojo.maratonaJava.javaCore.Associacao.Dominio.Professor;

 
public class Escola {
    private String nomeEscola;
    private Professor[] professor;

    public Escola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public Escola(String nomeEscola, Professor[] professor) {
        this.nomeEscola = nomeEscola;
        this.professor = professor;
    }

    public void imprimeEscola(){
        System.out.println("Nome da escola: "+this.nomeEscola);
        if(professor == null) return;
        for(Professor prof : professor){
            System.out.println("nome do professor: "+prof.getNomeProfessor());
        }
    }
    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public Professor[] getProfessor() {
        return professor;
    }

    public void setProfessor(Professor[] professor) {
        this.professor = professor;
    }

    
}
