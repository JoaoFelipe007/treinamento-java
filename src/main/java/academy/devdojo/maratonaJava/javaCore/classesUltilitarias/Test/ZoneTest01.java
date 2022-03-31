/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.classesUltilitarias.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Map;

/**
 *
 * @author Gestão Tech
 */
public class ZoneTest01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        ZoneId id = ZoneId.of("Asia/Dhaka");
        System.out.println(id);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        
        ZonedDateTime now1 = now.atZone(id);
        System.out.println(now1);
    }
    
}
