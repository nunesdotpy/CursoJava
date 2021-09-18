/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faculdadecontador;

import java.util.Scanner;

/**
 *
 * @author nunesdotpy
 */
public class FaculdadeContador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 1;
        int soma = 0;
        System.out.println("Quantos números você quer somar? ");
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        while (contador<=num){
            System.out.printf("Digite o %sº: ", contador);
            soma += kb.nextInt();
            contador++;
        }
        int media = soma / num;
        System.out.printf("A soma de todos esses números é %s e a média é %s", soma, media);
    }
}
