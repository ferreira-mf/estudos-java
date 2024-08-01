package conteudo.introducao;

import java.util.Scanner;

public class EstruturaWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Estrutura Repetitiva "while"

        REGRA:
        Verdadeiro: executa e volta
        Falso: pula fora

        SINTAXE:

        while (condicao) {
        comando 1
        comando 2
        }

        obs: estudar teste de mesa com estrutura repetitiva (while) para treinar.
         */

        /* PROBLEMA EXEMPLO:
        Fazer um programa que lê números inteiros até que um zero seja lido. Ao final, mostra a soma de todos inteiros inseridos.
         */

        int x = sc.nextInt();
        int soma = 0;

        while (x != 0) {  // enquanto x=! 0 (x diferente de 0) (true), será repetido o comando de inserir uma int.
            soma = soma + x; //a variavel 'soma' é ela mesma + x (valor inserido), ou seja, enquanto for repetindo, ela vai somando
            x = sc.nextInt();
        }
        System.out.println(soma);
        sc.close();
    }
}
