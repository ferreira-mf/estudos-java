package conteudo.introducao.exercicios;

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {

       /* Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
        código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.*/

        Scanner sc = new Scanner(System.in);

        int codPeca1 = sc.nextInt();
        int numPeca1 = sc.nextInt();
        double valorUnitPeca1 = sc.nextDouble();
        double valorSomaPeca1 = numPeca1 * valorUnitPeca1;

        int codPeca2 = sc.nextInt();
        int numPeca2 = sc.nextInt();
        double valorUnitPeca2 = sc.nextDouble();
        double valorSomaPeca2 = numPeca2 * valorUnitPeca2;
        double valorTotal = (valorSomaPeca1 + valorSomaPeca2);

        System.out.printf("Valor Total do pedido: R$ %.2f%n", valorTotal);

        sc.close();


    }
}
