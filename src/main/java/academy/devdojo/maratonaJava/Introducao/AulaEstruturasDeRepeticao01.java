/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonaJava.Introducao;

/**
 *
 * @author Gestão Tech
 */
public class AulaEstruturasDeRepeticao01 {
        public static void main(String[] args) {
//while, do while, for
        int contado = 0;
        while ( contado <=10){
            System.out.println("While " +contado);
            contado += 1;
            }
        contado = 0;
    System.out.println("*************************************************"); 

        do{
    System.out.println("Do While " +contado);
            contado += 1;
        }while(contado <=10);
    System.out.println("*************************************************"); 
             
       for(int i = 0; i<=10;i++){
    System.out.println("For "+ i);
       }
       
    System.out.println("*************************************************"); 
          //Exercio
           for (int ii=3; ii<=100;ii++){
                if(ii % 2 == 0){
                    System.out.println(ii); 
               }
           }
            
           
           
       } 
   }

