/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.Enumeracao.Dominio;

/**
 *
 * @author Gestão Tech
 */
public enum TipoPagamento {
    Debito {
        @Override
        public double CalcularDesconto(double valor) {
            return valor * 0.1;
        }
    }, Credito {
        @Override
        public double CalcularDesconto(double valor) {
            return valor * 0.05;
        }
    };

    public abstract double CalcularDesconto(double valor);
}
