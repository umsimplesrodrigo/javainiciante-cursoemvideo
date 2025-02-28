/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor01;

import java.time.LocalDate;

/**
 *
 * @author suporte-01
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int n[] = {3,2,8,7,5};
        
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i]);
        }*/
        //int anoat = LocalDate.now().getYear();
        int anoat = 2028;
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        if (anoat % 4 == 0) {
            if (anoat % 100 == 0) {
                if (anoat % 400 == 0) {
                    tot[1] = 29;
                }
            } else {
                tot[1] = 29;
            }
        }
        for (int i = 0; i < tot.length; i++) {
            System.out.println(mes[i] + " = " + tot[i] + " dias");
        }
    }
    
}
