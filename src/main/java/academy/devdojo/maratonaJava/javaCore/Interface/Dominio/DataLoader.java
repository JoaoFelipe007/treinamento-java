/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.Interface.Dominio;

/**
 *
 * @author Gestão Tech
 */
public interface DataLoader {
    int tamanho_Max =10;
    
    void load();
    
    default void permissao(){
        System.out.println("carregando permissão para essa ação");
    }
    
    static void retrive(){
        System.out.println("Dentro do retrive MaxSize na interface  ");
    }
}
