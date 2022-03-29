/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.String.Test;

/**
 *
 * @author Gestão Tech
 */
public class StringTest03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();// contar o inicio da execução em milisegundos
        concatString(30_000);
        long fim = System.currentTimeMillis();// até o final da execução em milisegundos
        System.out.println("Tempo gasto para Strig: "+(fim - inicio)+" ms");
   
         inicio = System.currentTimeMillis();// contar o inicio da execução em milisegundos
        concatStringBuilder(1_000_000);
         fim = System.currentTimeMillis();// até o final da execução em milisegundos
        System.out.println("Tempo gasto para StrigBuilder: "+(fim - inicio)+" ms");
        
        inicio = System.currentTimeMillis();// contar o inicio da execução em milisegundos
        concatStringBuffer(1_00_000);
         fim = System.currentTimeMillis();// até o final da execução em milisegundos
        System.out.println("Tempo gasto para StrigBuffer: "+(fim - inicio)+" ms");
    }
    
    public static void concatString(int tamanho){
        String texto = "";
        
        for(int i = 0; i < tamanho; i++){
            texto += i;
        }
    }

      public static void concatStringBuilder(int tamanho){
        StringBuilder texto = new StringBuilder(tamanho);
        
        for(int i = 0; i < tamanho; i++){
            texto.append(i);
        }
    }
      
        public static void concatStringBuffer(int tamanho){
        StringBuffer texto = new StringBuffer(tamanho);
        
        for(int i = 0; i < tamanho; i++){
            texto.append(i);
        }
    }
}
