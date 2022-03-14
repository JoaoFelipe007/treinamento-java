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
 public String nomeFuncionario;
 public int idade;
 public double[] salarios;
 public String funcao;
 public int anoEntrada;
 public int anoAtual;
 
 public void imprimirDados(){
     System.out.println("O nome do funcionário "+this.nomeFuncionario);
     System.out.println("A idade dele é "+this.nomeFuncionario);
     System.out.println("que é da função "+this.funcao);
     System.out.println("Trabalha desde o ano "+this.anoEntrada);
     mediaSalario();
     tempodeEmpresa();
 }
 public void mediaSalario(){
double media= 0;
     if(salarios == null){
         return;
     }
    for(double salario : salarios){
        media += salario;
    }
    media/=salarios.length;
     
     System.out.println("E a media do seu salario é: "+media); 
 }
 
 public void tempodeEmpresa(){
     int contribuicao = anoAtual - anoEntrada;
     if(contribuicao <=2){
         System.out.println("Relativamente novo na empresa");
 }else if(contribuicao <= 5){
         System.out.println("Tem um bom tempo de empresa");
 }else if(contribuicao >5 ){
     System.out.println("Esta faz tempo na empresa");
 }
 }
}

        
