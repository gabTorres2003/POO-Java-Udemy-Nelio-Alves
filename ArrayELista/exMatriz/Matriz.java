package ArrayELista.exMatriz;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("insira os valores de M (linhas) e N (colunas):");
        System.out.print("M: ");
        int m = sc.nextInt();
        System.out.print("N: ");
        int n = sc.nextInt();
        int[][] matriz = new int[m][n];

        for (int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.println();
                System.out.print("insira o número na posição " + i + " | " + j + ": ");
                matriz[i][j] = sc.nextInt();
            }
        }
        
        System.out.print("\nNúmero para comparar: ");
        int x = sc.nextInt();
        
        for (int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matriz[i][j] == x){
                    System.out.println("Posição encontrada: " + i + "," + j);

                    if (j > 0) {
                        System.out.println("Número à esquerda: " + matriz[i][j-1]);
                    }

                    if (j < n - 1) {
                        System.out.println("Número à direita: " + matriz[i][j+1]);
                    }

                    if (i > 0) {
                        System.out.println("Número acima: " + matriz[i-1][j]); 
                    }
                    
                    if (i < m - 1) {
                        System.out.println("Número abaixo: " + matriz[i+1][j]);
                    }
                    
                    System.out.println("---");
                }
            }
        }

        sc.close();
    }
}