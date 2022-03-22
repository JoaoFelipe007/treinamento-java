/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.Heranca.test;

import academy.devdojo.maratonaJava.javaCore.Heranca.Dominio.Endereco;
import academy.devdojo.maratonaJava.javaCore.Heranca.Dominio.Funcionario;
import academy.devdojo.maratonaJava.javaCore.Heranca.Dominio.Pessoa;

/**
 *
 * @author Gestão Tech
 */
public class FuncionarioTest {
    public static void main(String[] args) {
    Endereco endereco = new Endereco();
    endereco. setEndereco("Rua Alez Vasconcelo");
    endereco.setCep("15600-00");
    Pessoa pessoa = new Pessoa("Paulo André");
    pessoa.setNome("José Bonifácio");
    pessoa.setIdade(45);
    pessoa.setCpf("000.000.000-00");
    pessoa.setEndereco(endereco);
    pessoa.imprime();
    
        System.out.println(".+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+");
    Funcionario funcionario = new Funcionario("Joselito Bruno");
    funcionario.setNome("João Felipe");
    funcionario.setCpf("xxx.xxx.xxx-xx");
    funcionario.setIdade(23);
    funcionario.setSalario(1200.56);
    funcionario.setEndereco(endereco);
    funcionario.imprime();
    
        System.out.println("+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+");
    
    funcionario.nomeFunc();
    }
}
