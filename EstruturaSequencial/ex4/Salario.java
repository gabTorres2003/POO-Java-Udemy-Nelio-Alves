package EstruturaSequencial.ex4;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horasTrabalhadas;
        double valorHora;

        System.out.println("Total de horas trabalhadas: ");
        horasTrabalhadas = sc.nextInt();

        System.out.println("Valor da hora: ");
        valorHora = sc.nextDouble();

        double salario = horasTrabalhadas * valorHora;
        System.out.println("Salário: " + salario);

        sc.close();
    }
}
