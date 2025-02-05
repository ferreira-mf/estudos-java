package conteudonelioalves.introducao.exercicios;

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
//        seguir, calcule e mostre o valor da conta a pagar.

        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();

        double total;
        if (codigo == 1)
            total = quantidade * 4.00;
        else if (codigo == 2)
            total = quantidade * 4.50;
        else if (codigo == 3)
            total = quantidade * 5.00;
        else if (codigo == 4)
            total = quantidade * 2.00;
        else
            total = quantidade * 1.50;


        System.out.printf("Total: R$ %.2f%n", total);

        sc.close();

    }

}
