package conteudonelioalves.introducao.exercicios;

import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {

        /*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
        mostre:
        a) a área do triângulo retângulo que tem A por base e C por altura.
                b) a área do círculo de raio C. (pi = 3.14159)
        c) a área do trapézio que tem A e B por bases e C por altura.
        d) a área do quadrado que tem lado B.
                e) a área do retângulo que tem lados A e B.*/

        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        /* a) a área do triângulo retângulo que tem A por base e C por altura.
        (calcular área de um triângulo qualquer, o método mais comum
        é multiplicar o comprimento da base e da altura e dividir por dois) */

        double areaTriangulo = (A * C / 2);
        System.out.printf("Area do Triangulo: %.3f%n", areaTriangulo);

//      b) a área do círculo de raio C. (pi = 3.14159)

        double raioC = (C * C);
        double pi = 3.14159;
        double areaCirculo = pi * raioC;
        System.out.printf("Circulo: %.3f%n", areaCirculo);

//      c) a área do trapézio que tem A e B por bases e C por altura.
        double areaTrapezio = (A + B) * C / 2;
        System.out.printf("Trapezio: %.3f%n", areaTrapezio);

//      d) a área do quadrado que tem lado B.
        double areaQuadrado = B * B;
        System.out.printf("Quadrado: %.3f%n", areaQuadrado);


//      e) a área do retângulo que tem lados A e B.
        double areaRetangulo = A * B;
        System.out.printf("Retangulo: %.3f%n", areaRetangulo);

        sc.close();
    }
}
