/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.Interface.Test;

import academy.devdojo.maratonaJava.javaCore.Interface.Dominio.DataBaseLoader;
import academy.devdojo.maratonaJava.javaCore.Interface.Dominio.DataLoader;
import academy.devdojo.maratonaJava.javaCore.Interface.Dominio.FilderDataLoader;

/**
 *
 * @author Gestão Tech
 */
public class InterfaceTest01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DataBaseLoader dataBase = new DataBaseLoader();
        FilderDataLoader file = new FilderDataLoader();
        dataBase.load();
        file.load();

        dataBase.remove();
        file.remove();
       
        dataBase.permissao();
        file.permissao();
     
        DataLoader.retrive();
        dataBase.retrive();
    }

}
