/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.Interface.Dominio;

/**
 *
 * @author Gestão Tech
 */
public class FilderDataLoader implements DataLoader,DataRemove{
    @Override
    public void load(){
        System.out.println("Carregando dados de um arquivo do Banco de dados"); 
   }
    
    @Override
    public void remove(){
        System.out.println("Removendo dados de um arquivo do Banco de dados");
    }
}
