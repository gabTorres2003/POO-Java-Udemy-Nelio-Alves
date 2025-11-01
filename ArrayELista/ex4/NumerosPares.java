package ArrayELista.ex4;

import java.util.Scanner;

public class NumerosPares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalNumeros;

        System.out.print("Quantos números você vai digitar? ");
        totalNumeros = sc.nextInt();

        int[] numerosInteiros = new int[totalNumeros];
        int quantidadeNumerosInteiros = 0;

        for(int i=0; i < totalNumeros; i++){
            System.out.print("Digite um número: ");
            numerosInteiros[i] = sc.nextInt();
        }

        System.out.println();

        for(int i=0; i < totalNumeros; i++){
            if (numerosInteiros[i] % 2 == 0) {
                System.out.println(numerosInteiros[i]);
                quantidadeNumerosInteiros++;
            }
        }

        System.out.println("Quantidade de números pares: " + quantidadeNumerosInteiros);

        sc.close();
    }
}