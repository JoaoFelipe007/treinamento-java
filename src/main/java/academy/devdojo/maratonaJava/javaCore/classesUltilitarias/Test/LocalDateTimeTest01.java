/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.classesUltilitarias.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 *
 * @author Gestão Tech
 */
public class LocalDateTimeTest01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDateTime ldtNow = LocalDateTime.now();
        LocalDate lD = LocalDate.parse("2022-08-05");
        LocalTime lT = LocalTime.parse("15:13:32");
        System.out.println(ldtNow);
        System.out.println(lD);
        System.out.println(lT);
        
        LocalDateTime ldt1 = lT.atDate(lD);
        LocalDateTime ldt2 = lD.atTime(lT);
        
        System.out.println(ldt1);
        System.out.println(ldt2);
        
    }

}
