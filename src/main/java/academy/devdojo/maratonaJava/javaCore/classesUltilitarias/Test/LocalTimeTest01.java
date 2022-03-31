/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.classesUltilitarias.Test;

import java.time.LocalTime;
import java.util.Locale;

/**
 *
 * @author Gestão Tech
 */
public class LocalTimeTest01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale localeDefault =Locale.getDefault();
        LocalTime time = LocalTime.of(16,56,45);
        LocalTime now =  LocalTime.now();
        System.out.println(time);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time.getNano());
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);
        System.out.println(now);
        
    }
    
}
