package Construtores.Exercicio82;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroDaConta;
        String depositoInicial;
        String nomeDoTitular;
        double valorDepInicial;
        Conta conta;

        
        System.out.print("Numero da conta: ");
        numeroDaConta = scanner.nextInt();
        System.out.print("Nome do titular: ");
        scanner.nextLine();
        nomeDoTitular = scanner.nextLine();
        System.out.printf("Depósito inicial? (Y/N): ");
        depositoInicial = scanner.nextLine();

        
        if (depositoInicial.equalsIgnoreCase("Y")) {
            System.out.printf("Valor do depósito inicial: ");
            valorDepInicial = scanner.nextDouble();
            conta = new Conta(numeroDaConta, nomeDoTitular, valorDepInicial);
        }else{
            conta = new Conta(numeroDaConta, nomeDoTitular);
        }

        System.out.println("Dados da conta: " + conta.toString());
        
        System.out.println("Valor de depósito: ");
        double valorDeposito = scanner.nextDouble();
        conta.depositar(valorDeposito);
        System.out.println("Dados atualizados da conta: " + conta.toString());
        
        System.out.println("Valor de saque: ");
        double valorSaque = scanner.nextDouble();
        conta.depositar(valorSaque);
        System.out.println("Dados atualizados da conta: " + conta.toString());

        scanner.close();
    }
}