package programamedia;

import java.util.Scanner;

/**
 *
 * @author nunesdotpy
 */
public class ProgramaMedia {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite sua primeira nota");
        float n1 = teclado.nextFloat();
        System.out.println("Digite sua segunda nota");
        float n2 = teclado.nextFloat();
        float m = (n1+n2)/2;
        System.out.println("Sua média é "+ m);
        if (m>=9){
            System.out.println("Parabéns!");
        }
    }
}
