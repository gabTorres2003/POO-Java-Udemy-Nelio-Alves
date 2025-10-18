package ex2;

import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double raio, PI=3.14159;
        
        System.out.println("Insira o valor do raio: ");
        raio = teclado.nextDouble();

        double area = PI * (raio * raio);

        System.out.println("Área do círculo: " + area);

        teclado.close();
    }
}
