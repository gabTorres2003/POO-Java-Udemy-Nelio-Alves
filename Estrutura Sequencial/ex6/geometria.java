package ex6;

import java.util.Locale;
import java.util.Scanner;

public class geometria {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c;
        double triangulo, circulo, trapezio, quadrado, retangulo;
        double pi = Math.PI;

        System.out.println("Sistema polígonos!");
        System.out.print("Insira os valores de A, B e C, em sequência com um espaço de distância: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        triangulo = (a * c) / 2;
        circulo = pi * Math.pow(c, 2);
        trapezio = ((a + b) * c) / 2;
        quadrado = Math.pow(b, 2);
        retangulo = a * b;

        System.out.println("\nCalculando área dos polígonos:");
        System.out.printf("TRIÂNGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPÉZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETÂNGULO: %.3f%n", retangulo);

        sc.close();
    }
}