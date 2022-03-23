/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.Enumeracao.Test;

import academy.devdojo.maratonaJava.javaCore.Enumeracao.Dominio.Cliente;
import academy.devdojo.maratonaJava.javaCore.Enumeracao.Dominio.TipoCliente;
import academy.devdojo.maratonaJava.javaCore.Enumeracao.Dominio.TipoPagamento;

/**
 *
 * @author Gestão Tech
 */
public class TipoPessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TipoPagamento TipoPagamento = null;
      Cliente cliente = new Cliente("João Felipe",19,TipoCliente.PESSOA_JURIDICA,TipoPagamento.Credito);
      Cliente cliente2 = new Cliente("Felipe",20,TipoCliente.PESSOA_JURIDICA,TipoPagamento.Debito); 
      cliente.imprime();
      cliente2.imprime();
        System.out.println("Total em desconto em reais: "+TipoPagamento.Debito.CalcularDesconto(250));
        System.out.println("Total em desconto em reais: "+TipoPagamento.Credito.CalcularDesconto(250));
        
        TipoCliente tipoCliente = TipoCliente.tipoClientePorRealtorio("Pessoa Juridica");
        System.out.println(tipoCliente);
    }
    
}
