/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonaJava.Introducao;

/**
 *
 * @author Gestão Tech
 */
public class AulaArrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int[] numeros2 ={1,2,3,4,5,6,7,8,9,10};
        int[] numeros3 = new int[]{1,2,3,4,5,6,7,8,9,10};
  
//        for(int i = 0; i < numeros3.length; i++){
//            System.out.println(numeros3[i]);
//        }
        
       
        for(int num : numeros3){
            System.out.println(num);
        }
    }
}
