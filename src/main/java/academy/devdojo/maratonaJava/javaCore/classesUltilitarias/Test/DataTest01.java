/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.classesUltilitarias.Test;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Gestão Tech
 */
public class DataTest01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date data = new Date();
        Calendar c = Calendar.getInstance();
//        System.out.println("Data de hoje: "+data);
        System.out.println("Data Calendar: "+c.getTime());
        System.out.println("Dia do Mês "+c.get(Calendar.DAY_OF_MONTH));
        System.out.println("Dia do Ano "+c.get(Calendar.DAY_OF_YEAR));
        System.out.println("Ano "+c.get(Calendar.YEAR));
        System.out.println("MÊS "+c.get(Calendar.JANUARY));
    }

}
