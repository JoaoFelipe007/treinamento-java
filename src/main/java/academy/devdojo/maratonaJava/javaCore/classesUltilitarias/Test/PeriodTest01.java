/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.classesUltilitarias.Test;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/**
 *
 * @author Gestão Tech
 */
public class PeriodTest01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDate now = LocalDate.of(1989, Month.MARCH, 25);
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(456).plusDays(14);
        Period p1 = Period.between(now, nowAfterTwoYears);
        Period p2 = Period.ofDays(63);
        Period p3 = Period.ofMonths(4);
        Period p4 = Period.ofWeeks(18);
        Period p5 = Period.ofYears(4);

        System.out.println(now);
        System.out.println(nowAfterTwoYears);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(now.until(now.plusDays(p4.getDays()),ChronoUnit.MONTHS));

    }

}
