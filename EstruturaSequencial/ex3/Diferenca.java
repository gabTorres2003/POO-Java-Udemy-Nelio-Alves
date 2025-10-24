package EstruturaSequencial.ex3;

import java.util.Scanner;

public class Diferenca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, C, D;

        System.out.println("Valor de A: ");
        A = sc.nextInt();
        System.out.println("Valor de B: ");
        B = sc.nextInt();
        System.out.println("Valor de C: ");
        C = sc.nextInt();
        System.out.println("Valor de D: ");
        D = sc.nextInt();

        int diferenca = (A * B) - (C * D);

        System.out.println("Total: " + diferenca);

        sc.close();
    }
}
