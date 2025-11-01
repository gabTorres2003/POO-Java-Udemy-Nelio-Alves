package ArrayELista.ex5;

import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números? ");
        int totalNumeros = sc.nextInt();

        int[] numerosReais = new int[totalNumeros];
        int maiorNumero=0;
        int posicaoMaiorNumero=0;

        for (int i=0; i < totalNumeros; i++){
            numerosReais[i] = sc.nextInt();
            if (numerosReais[i] > maiorNumero) {
                maiorNumero = numerosReais[i];
                posicaoMaiorNumero = i;
            }
        }

        System.out.println("Maior número: " + maiorNumero);
        System.out.println("Posição do maior número: " + posicaoMaiorNumero);

        sc.close();
    }
}
