/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.Associacao.Atividade;

/**
 *
 * @author Gestão Tech
 */
public class Professor {
 private String nomeProfessor;
 private String especialidade;
 private Seminario[] seminario;
 

    public Professor(String nomeProfessor, String especialidade) {
        this.nomeProfessor = nomeProfessor;
        this.especialidade = especialidade;
    }    

    public Professor(String nomeProfessor, String especialidade, Seminario[] seminario) {
        this.nomeProfessor = nomeProfessor;
        this.especialidade = especialidade;
        this.seminario = seminario;
    }

    public void imprimeProfessor(){
        System.out.println("Nome do Professor: "+this.nomeProfessor);
        System.out.println("Especialidade: "+this.especialidade);
         if(seminario == null)return;       
        for(Seminario seminarios: seminario){
            System.out.println("");
            System.out.println("Seminario Escolhido:");
            System.out.println(" "+seminarios.getTitulo());
            System.out.println(" "+seminarios.getLocal().getEndereco());
            if(seminarios.getAlunos() == null || seminarios.getAlunos().length == 0) continue;
            System.out.println("    ****Alunos Seminario***");
                for(Aluno aluno : seminarios.getAlunos()){
                    System.out.println(" Nome Aluno: "+aluno.getNomeAluno()+" Idade: "+aluno.getIdade());
                }
        }
        
    }
    
    public Seminario[] getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario[] seminario) {
        this.seminario = seminario;
    }
    
    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
 
 
}
