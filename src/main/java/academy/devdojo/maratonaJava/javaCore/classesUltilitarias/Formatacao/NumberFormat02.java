/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.classesUltilitarias.Formatacao;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 *
 * @author Gestão Tech
 */
public class NumberFormat02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale localeDeafault = Locale.getDefault();
        Locale localeUSA = Locale.US;
        Locale localeItalia = Locale.ITALY;
        Locale localeAle = Locale.CHINA;
        NumberFormat[] nf = new NumberFormat[4];
        nf[0] = NumberFormat.getCurrencyInstance(localeDeafault);// curerncy converte o numero em dinheiro e coloca no sistema monetario da pais
        nf[1] = NumberFormat.getCurrencyInstance(localeUSA);
        nf[2] = NumberFormat.getCurrencyInstance(localeItalia);
        nf[3] = NumberFormat.getCurrencyInstance(localeAle);
        double valor = 1_000.45;

        for (NumberFormat numberFormat : nf) {
            System.out.println(numberFormat.format(valor));
        }

        String valorString = "$1000.45";// Para o parse funcionar no valor vc tem que colocar a formatação correspondente a posição que escolheu
        try {
            System.out.println(nf[1].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}
