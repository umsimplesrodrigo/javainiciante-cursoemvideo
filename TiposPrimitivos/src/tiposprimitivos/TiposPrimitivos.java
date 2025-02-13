package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author suporte-01
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o nome: ");
        String nome = teclado.nextLine();
        System.out.print("Informe a nota: ");
        float nota = teclado.nextFloat();
        System.out.format("A nota de %s eh %.1f \n", nome, nota);
    }
    
}
