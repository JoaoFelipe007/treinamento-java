/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package academy.devdojo.maratonaJava.javaCore.Exception.RunTimeException;

/**
 *
 * @author Gestão Tech
 */
public class RunTimeExceptionTest02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        abrindoConexao();
    }

    private static String abrindoConexao() {
        try {
            System.out.println("Abrindo Arquivo");
            System.out.println("Escrevendo Dados do Arquivo");
            return "Conexao Aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recursos...");
        }

        return null;
    }
    private static void abrindoConexa2o(){
        try {
            System.out.println("Abrindo Arquivo");
            System.out.println("Escrevendo Dados do Arquivo");
            throw new RuntimeException();
        } finally {
            System.out.println("Fechando Conexão por erro encontrado");
        }
    }
}
