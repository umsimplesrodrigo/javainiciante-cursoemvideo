/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor03;

import java.util.Arrays;

/**
 *
 * @author suporte-01
 */
public class Vetor03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vet[] = new int[20];
        Arrays.fill(vet, 0);
        for (int v:vet){
            System.out.print("[" + v + "]");
        }
        /*int p = Arrays.binarySearch(vet, 1);
        System.out.println("\nEncontrei o valor " + vet[p] + " na posicao: " + p);*/
    }
    
}
