/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.Date.Test;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Gestão Tech
 */
public class LocalDateTest01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDate date =LocalDate.of(2103, Month.FEBRUARY,24);
        LocalDate now = LocalDate.now();
        System.out.println(date.getYear());// MOSTRA O ANO CORRESPONDENTE NO QUE COLOCOU NO CONSTRUTOR
        System.out.println(date.getMonth());//MOSTRA MÊS CORRESPONDENTE NO QUE COLOCOU NO CONSTRUTOR
        System.out.println(date.getMonthValue());//MOSTRA A QTD DE DIA DO MÊS
        System.out.println(date.getDayOfWeek());//MOSTRA O QUAL É O DIA DA SEMANA
        System.out.println(date.getDayOfMonth());//MOSTRA O DIA DO MÊS
        System.out.println(date.lengthOfMonth());//MOSTRA QTD DE DIA DO MÊS
        System.out.println(date.lengthOfYear());//MOSTRA A QTD DE DIA DO ANO
        System.out.println(date);//MOSTRA A DATA QUE VC COLOCOU
        System.out.println(now);//MOSTRA A DATA DE HOJE
        System.out.println(LocalDate.MAX);//MOSTRA O A DATA MAXIMA QUE VC PODE USAR
        System.out.println(LocalDate.MIN);//MOSTRA A DATA MIN QUE VC PODE USAR
        
    }
    
}
