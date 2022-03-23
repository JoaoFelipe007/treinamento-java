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
    PESSOA_JURIDICA(2, "Pessoa Juiridica");

    public final int Valor;
    public final String Descricao;

    private TipoCliente(int valor, String descricao) {
        this.Descricao = descricao;
        this.Valor = valor;
    }

}
