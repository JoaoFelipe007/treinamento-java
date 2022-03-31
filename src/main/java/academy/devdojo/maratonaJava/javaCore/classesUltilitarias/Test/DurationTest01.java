/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.classesUltilitarias.Test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 *
 * @author Gestão Tech
 */
public class DurationTest01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2);
        LocalTime lT = LocalTime.now();
        LocalTime lTAfterSevenMinutes = LocalTime.now().plusMinutes(7);
        
        Duration d1 = Duration.between(now, nowAfterTwoYears);
        Duration d2 = Duration.between(lT, lTAfterSevenMinutes);
        Duration d3 = Duration.ofDays(20);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d2);
    }

}
