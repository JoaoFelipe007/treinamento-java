/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.Date.Formatacao;

import java.text.NumberFormat;
import java.util.Locale;


public class NumberFormat01 {

  
    public static void main(String[] args) {
        Locale localeDeafault = Locale.getDefault();
        Locale localeUSA = Locale.US;
        Locale localeItalia = Locale.ITALY;
        Locale localeAle = Locale.JAPAN;
        NumberFormat[] nf = new NumberFormat[4];
        nf[0]= NumberFormat.getInstance(localeDeafault);
        nf[1]= NumberFormat.getInstance(localeUSA);
        nf[2]= NumberFormat.getInstance(localeItalia);
        nf[3]= NumberFormat.getInstance(localeAle);
        double valor = 125_045_120.450;
        
        for(NumberFormat numberFormat: nf){
            System.out.println(numberFormat.format(valor));
        }
        
    }
    
}
