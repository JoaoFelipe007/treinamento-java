/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.Enumeracao.Dominio;

/**
 *
 * @author Gestão Tech
 */
public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    private  int Valor;
    private String Descricao;

    

    private TipoCliente(int valor, String descricao) {
        this.Descricao = descricao;
        this.Valor = valor;
    }

    public static TipoCliente tipoClientePorRealtorio (String Descricao){
    for(TipoCliente tipoCliente : values()){
        if(tipoCliente.getDescricao().equals(Descricao)){
        return tipoCliente;
        }
    }
        
        return null;
    }
  public int getValor() {
        return Valor;
    }

    public String getDescricao() {
        return Descricao;
    }
    
}
