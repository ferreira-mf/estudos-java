package conteudonelioalves.introducao.exercicios;

import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não

        int x = sc.nextInt();
        if (x > 0) {
            System.out.println("Este número é positivo");
        } else
            System.out.println("Este número é negativo");

        sc.close();
    }
}

