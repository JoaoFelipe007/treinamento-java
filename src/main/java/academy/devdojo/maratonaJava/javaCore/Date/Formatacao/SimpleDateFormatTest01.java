/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.Date.Formatacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Gestão Tech
 */
public class SimpleDateFormatTest01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        String pattern = " dd'/'MM'/'yy";// isso é o exemplo a mascara que a data deve seguir
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));

        try{
            System.out.println(sdf.parse("30/03/22"));
        }catch(ParseException e){
            e.printStackTrace();
        }
    }
}
