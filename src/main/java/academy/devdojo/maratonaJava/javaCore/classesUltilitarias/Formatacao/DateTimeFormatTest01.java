/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.classesUltilitarias.Formatacao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;



/**
 *
 * @author Gestão Tech
 */
public class DateTimeFormatTest01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        
        LocalDate parse1 = LocalDate.parse("20220331", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2022-03-31+06:00", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2022-03-31", DateTimeFormatter.ISO_LOCAL_DATE);
        
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);
        
        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);
        LocalDateTime parse4 = LocalDateTime.parse("2022-03-31T11:13:44.1886341", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parse4);
        
        DateTimeFormatter formatBr =DateTimeFormatter.ofPattern("dd/MM/YYYY");
        String brData = LocalDate.now().format(formatBr);
        System.out.println(brData);
        LocalDate parseBr = LocalDate.parse("31/03/2022", formatBr);
        System.out.println(parseBr);
        
        DateTimeFormatter formatUS = DateTimeFormatter.ofPattern("MM-dd-YYYY", Locale.US);
        String usData = LocalDate.now().format(formatUS);
        System.out.println(usData);
        
    }

}
