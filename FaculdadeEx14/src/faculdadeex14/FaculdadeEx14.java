package faculdadeex14;

import java.util.Scanner;

/**
 *
 * @author nunesdotpy
 */
public class FaculdadeEx14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 1;
        int input = 0;
        int num = -1;
        Scanner kb = new Scanner(System.in);
        
        while (num<0){
        System.out.println("Quantos números você deseja digitar?");
        num = kb.nextInt();
            if (num<0){
                System.out.println("Digite um número maior que 0");
            }
        }
        while (contador<=num){
            System.out.printf("Digite o %sº número: ",contador);
            input += kb.nextInt();
            contador++;
        }
        System.out.printf("A média desses números é igual a %s \n", input/num);
    }
    
}
