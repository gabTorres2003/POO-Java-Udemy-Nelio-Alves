package ArrayELista.ex1;

import java.util.Scanner;


public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tamanhoTotal;
        System.out.println("Informe o número total de números do vetor: ");
        tamanhoTotal = sc.nextInt();
        int vetor[] = new int[tamanhoTotal];

        for(int i=0; i < tamanhoTotal; i++){
            System.out.println("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        int negativos=0;
        
        if (negativos == 0) {
            System.out.println("Não foram inseridos números negativos!");
        }else{
            System.out.println("Números negativos: ");
            for(int i=0; i <tamanhoTotal; i++){
                if (vetor[i] < 0) {
                    System.out.println(vetor[i]);
                    negativos++;
                }
            }
        }
        sc.close();
    }
}