package ArrayELista.ex3;

import java.util.Scanner;

public class Pessoas {
    Scanner sc = new Scanner(System.in);
    int totalPessoas;
    private String[] nome;
    private int[] idade;
    private double[] altura;
    
    public void inserirValores(int totalPessoas){
        
        this.totalPessoas = totalPessoas;
        this.altura = new double[totalPessoas];
        this.nome = new String[totalPessoas];
        this.idade = new int[totalPessoas];
    
        for(int i = 0; i < totalPessoas; i++){
            System.out.println("Dados da " + (i+1) + "° pessoa:");
            System.out.print("Nome: ");
            nome[i] = sc.next();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();
        }
    }
    
    public double mediaAltura(int totalPessoas){
        double somaAlturas = 0;
        for(int i=0; i < totalPessoas; i++){
            somaAlturas += altura[i];
        }
        double mediaAlturas = somaAlturas / totalPessoas;
        return mediaAlturas;
    }

    public double porcentagemAdolescentes(int totalPessoas){
        double quantidadeAdolescentes = 0;
        for(int i = 0; i < totalPessoas; i++){
            if (idade[i] < 16) {
                quantidadeAdolescentes++;
            }
        }
        double porcentagem = (quantidadeAdolescentes / totalPessoas) * 100;
        return porcentagem;
    }

    public void nomesDosAdolescentes(int totalPessoas){
        int contadorAdolescentes=0;
        for(int i=0; i < totalPessoas; i++){
            if(idade[i] < 16){
                System.out.println(nome[i]);
                contadorAdolescentes++;
            }
        }
        if (contadorAdolescentes == 0) {
            System.out.println("Não foram inseridos menores de 16.");
        }
    }
}