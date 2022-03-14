/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.IntroducaoClasses.Dominio;

/**
 *
 * @author Gestão Tech
 */
public class Funcionario {
 private String nomeFuncionario;
 private int idade;
 private double[] salarios;
 private double media;
 
 public void imprimirDados(){
     System.out.println("O nome do funcionário "+this.nomeFuncionario);
     System.out.println("A idade dele é "+this.nomeFuncionario);
     mediaSalario();
  
 }
 public void mediaSalario(){

     if(salarios == null){
         return;
     }
    for(double salario : salarios){
        media += salario;
    }
    media/=salarios.length;
     
     System.out.println("E a media do seu salario é: "+media); 
 }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

   

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMedia() {
        return media;
    }

    

    
 
}

        
