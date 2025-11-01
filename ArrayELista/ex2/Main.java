package ArrayELista.ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vetores operacoes = new Vetores();

        System.out.print("Quantos números você irá inserir? ");
        int tamanhoTotal = sc.nextInt();
        double[] vetorNumeros = new double[tamanhoTotal];

        operacoes.inserirValores(tamanhoTotal, vetorNumeros);

        double soma = operacoes.somaValores(vetorNumeros);
        System.out.println("\nSoma dos valores: " + soma);

        double media = operacoes.mediaValores(vetorNumeros, soma);
        System.out.println("Média dos valores: " + media);

        sc.close();
    }
}
