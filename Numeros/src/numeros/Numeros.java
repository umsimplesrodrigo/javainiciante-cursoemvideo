/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeros;

import java.util.Scanner;

/**
 *
 * @author suporte-01
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s = 0;
        String resp;
        Scanner teclado = new Scanner(System.in);
        
        do {
            System.out.print("Digite um numero: ");
            n = teclado.nextInt();
            s += n;
            System.out.println("Continuar? [Sim/Nao] ");
            resp = teclado.next();
        } while (resp.equals("Sim"));
        System.out.println("A soma de todos os valores eh " + s);
    }
    
}
