/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.classesUltilitarias.Formatacao;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 *
 * @author Gestão Tech
 */
public class LocaleTest01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale  localeBR = new Locale("pt","BR");
        Locale  localefra = new Locale("fr","FRA");
        Calendar c = Calendar.getInstance();
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, localeBR);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localefra);
        System.out.println(df.format(c.getTime()));
        System.out.println(df2.format(c.getTime()));
    }
    
}
