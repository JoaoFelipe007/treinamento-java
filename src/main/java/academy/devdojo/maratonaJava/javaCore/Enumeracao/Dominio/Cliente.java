/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.Enumeracao.Dominio;

/**
 *
 * @author Gestão Tech
 */
public class Cliente {

    private String nome;
    private int idade;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;
    public Cliente() {
    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public Cliente(String nome, int idade, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.idade = idade;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("idade: " + this.idade);
        System.out.println("tipo de pessoa: " + this.tipoCliente.Descricao);
        System.out.println("tipo de operação: " + this.tipoCliente.Valor);
        System.out.println("forma de pagamento: " + this.tipoPagamento);
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
