/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane;
/**
 *
 * @author suporte-01
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        int s = 0;
        int totalv = 0, totalp = 0, totali = 0, acimac = 0, media;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número:<br><em>(Valor 0 interrompe)</em></br></html>"));
            s += n;
            if (n > 0) {
                totalv++;
            }
            if (n % 2 == 0 && n != 0) {
                totalp++;
            } else if (n % 2 == 1 && n != 0) {
                totali++;
            }
            if (n > 100) {
                acimac++;
            }
        } while (n != 0);
        media = s / totalv;
        JOptionPane.showMessageDialog(null, String.format("<html><h1>Resultado</h1><ul><li>Total Valores: %d</li>"
                + "<li>Total Pares: %d</li><li>Total Ímpares: %d</li><li>Acima de 100: %d</li>"
                + "<li>Média do valores: %d</li></ul></html>", totalv, totalp, totali, acimac, media));
        
    }
    
}
