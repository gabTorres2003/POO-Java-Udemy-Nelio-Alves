package ArrayELista.ex2;

import java.util.Scanner;

public class Vetores {
    Scanner sc = new Scanner(System.in);

    public void inserirValores(double tamanhoTotal, double vetorNumeros[]){
        for(int i=0; i < tamanhoTotal; i++){
            System.out.print("Insira um número: ");
            vetorNumeros[i] = sc.nextDouble();
        }
    }

    public double somaValores(double vetor[]){
        double soma = 0;
        for(int i = 0; i < vetor.length; i++){
            soma = soma + vetor[i];
        }
        return soma;
    }

    public double mediaValores(double vetor[], double soma){
        double media = soma/vetor.length;
        return media;
    }
}