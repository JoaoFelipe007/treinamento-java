/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.classesUltilitarias.Test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Gestão Tech
 */
public class ChronoUnitTest01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2003, Month.FEBRUARY, 24, 10, 30);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(ChronoUnit.DAYS.between(ldt,now));
        System.out.println(ChronoUnit.WEEKS.between(ldt,now));
        System.out.println(ChronoUnit.MONTHS.between(ldt,now));
        System.out.println(ChronoUnit.YEARS.between(ldt,now));
        System.out.println(ChronoUnit.HOURS.between(ldt,now));
    }
    
}
