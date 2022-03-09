/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonaJava.Introducao;

/**
 *
 * @author Gestão Tech
 */
public class AulaArrayMultidimenssionais {
    public static void main(String[] args) {
        //1,2,3,4,5 Meses
        //31,28,31,30,31 Dias
        int[][] dias = new int[2][2];
        
        dias[0][0] = 31;
        dias[0][1] = 28;
        
        dias[1][0] = 31;
        dias[1][1] = 30;
        
         for(int i  = 0;i<dias.length;i++){
             for(int a =0; a<dias[i].length;a++){
                 System.out.println(dias[i][a]);
             }
         }
             System.out.println("********************************************");
             for (int[] arrBase : dias){
                 for(int num : arrBase){
                        System.out.println(num);
                 }
             }
             
    
        
    }
}
