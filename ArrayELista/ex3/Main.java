package ArrayELista.ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoas p1 = new Pessoas();

        System.out.print("Insira o total de pessoas à cadastrar: ");
        int totalPessoas = sc.nextInt();

        p1.inserirValores(totalPessoas);
        System.out.println();
        System.out.printf("Média das alturas: %.2f%n", p1.mediaAltura(totalPessoas));
        System.out.println();
        System.out.printf("Porcentagem de menores de 16: %.1f%%%n",  p1.porcentagemAdolescentes(totalPessoas));
        System.out.println();
        System.out.println("Nomes dos menores de 16: ");
        p1.nomesDosAdolescentes(totalPessoas);

        sc.close();
    }
}
