package conteudo;

import java.util.Scanner;

public class EstruturaDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*

        DO WHILE = FACA ENQUANTO

        Sintaxe / Regra:

        do {
            comando 1
            comando 2
        } while (condicao);

        Regra quando chega na condicao: Verdadeiro: volta   Falso: pula fora

Problema exemplo:

Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente
em Fahrenheit. Perguntar se o usuario deseja repetir (s/n). Caso digite "s",
repetir o programa.

Fórmula: F = 9.0 * C/5 + 32
         */


        char resp;
        do {
            System.out.println("Digite a temperatura em Celsius:");
            double C = sc.nextDouble();
            double F = 9.0 * C / 5 + 32.0;
            System.out.println("O equivalente em fahrenheit = " + F);
            System.out.println("Deseja repetir (s/n)?");
            resp = sc.next().charAt(0);
        } while (resp != 'n');
    }
}
