/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.Exception.RunTimeException;

/**
 *
 * @author Gestão Tech
 */
public class RunTimeExceptionTest03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
         throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException ");
        }catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do IndexOutOfBoundsException ");
        }catch (IllegalArgumentException e) {
            System.out.println("Dentro do IllegalArgumentException ");
        }catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException ");
        }

    }

}
