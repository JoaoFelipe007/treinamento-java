/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonaJava.Introducao;

/**
 *
 * @author Gestão Tech
 */
public class AulaArrayMultiDimenssionais02 {
    public static void main(String[] args) {
        int[][] numero = new int[3][];
        
        
        numero[0] = new int[]{1,2,3,4,5};
        numero[1] = new int[]{6,7,8};
        numero[2] = new int[]{9,10, 11, 12};
        
        for(int[] arrBase:numero){
            
            for(int cont: arrBase){
                System.out.print(cont+" ");
            }
            System.out.println("\n*****************");
        }
    }
}
