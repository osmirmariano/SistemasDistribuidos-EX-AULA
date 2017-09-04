/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;
import java.util.Scanner;
/**
 *
 * @author aluno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TesteThreads a, b;
        int numero = 0;
        
        Scanner valor = new Scanner(System.in);
        System.out.println("Informe o numero : ");
        numero = valor.nextInt();
        
        a = new TesteThreads("A1 ", numero);
        a.start();
        b = new TesteThreads("B1 ", numero);
        b.start();
        try {a.join();} catch (Exception e) {}
        try {b.join();} catch (Exception e) {}
    }
    
}
