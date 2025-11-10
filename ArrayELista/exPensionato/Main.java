package ArrayELista.exPensionato;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Aluguel[] vetorApartamentos = new Aluguel[10];

        System.out.print("Quantos aluguéis serão realizados no momento?: ");
        int numeroDeAlugueis = sc.nextInt();

        for(int i=0; i < numeroDeAlugueis; i++){
            System.out.println("Aluguel n° " + i + ":");
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Número do quarto:");
            int numeroDoQuarto = sc.nextInt();
            vetorApartamentos[numeroDoQuarto] = new Aluguel(nome, email);
        }

        System.out.println("Quartos ocupados: ");
        for(int i=0; i < 10; i++){
            if(vetorApartamentos[i] != null){
                System.out.println(vetorApartamentos[i]);
            }
        }

        sc.close();
    }
    
}