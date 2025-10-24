package Construtores.Exercicio82;

public class Conta {
    
    private int numeroDaConta;
    private String nomeTitular;
    private double saldo;

    public Conta(int numeroDaConta, String nomeTitular, double saldoInicial){
        this.nomeTitular = nomeTitular;
        this.numeroDaConta = numeroDaConta;
        depositar(saldoInicial);
    }

    public Conta(int numeroDaConta, String nomeTitular){
        this.nomeTitular = nomeTitular;
        this.numeroDaConta = numeroDaConta;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo(){
        return saldo;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar (double valor){
        saldo -= (valor + 5);
    }

    public String toString(){
        return "Conta: " + numeroDaConta + ", titular: " + nomeTitular + ", saldo: " + saldo;
    }
    
}
