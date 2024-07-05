package exercicios;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {

        /*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
        casas decimais conforme exemplos.
        Fórmula da área: area = π . raio2
        Considere o valor de π = 3.14159*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do raio de um circulo: ");
        double x = sc.nextDouble();
        double pi = 3.14159;
        double raio = (x * x);
        double area = pi * raio;

        System.out.printf("o valor da area é de: %.4f%n", area);  //O %.4f%n é para contar apenas 4 casas decimais.


        sc.close();
    }
}