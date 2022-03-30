/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.Date.Formatacao;

import java.util.Locale;

/**
 *
 * @author Gestão Tech
 */
public class LocaleTest02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());// mostra A formatação da lingua do seu pc
        String[] isoLingua = Locale.getISOLanguages();
        String[] isoPaises = Locale.getISOCountries();
        
        for(String lingua : isoLingua){
            System.out.print(lingua+" ");
        }
        
        System.out.println("");
        
        for(String paises: isoPaises){
            System.out.print(paises+" ");
        }
    }
    
}
