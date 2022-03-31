/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.classesUltilitarias.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class proximoDiaUtil implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dfw = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int addDays;

        switch (dfw) {
            case THURSDAY:
                addDays = 3;
                break;

            case FRIDAY:
                addDays = 4;
                break;

            case SATURDAY:
                addDays = 2;
                break;

            default:
                addDays = 1;
                break;

        }
        return temporal.plus(addDays, ChronoUnit.DAYS);
    }

}

public class temporalAdjusterTest01 {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        System.out.println("");

        
        now = LocalDate.now().withDayOfMonth(19).with(new proximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        System.out.println("");
        
        now = LocalDate.now().withDayOfMonth(15).with(new proximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        System.out.println("");

                
        now = LocalDate.now().withDayOfMonth(30).with(new proximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        System.out.println("");

        
        now = LocalDate.now().withDayOfMonth(8).with(new proximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        System.out.println("");

    }

}
