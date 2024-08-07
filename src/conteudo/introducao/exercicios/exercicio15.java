package conteudo.introducao.exercicios;

import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {


        //Operadores de atribuição cumulativa

        Scanner sc = new Scanner(System.in);

        int minutos = sc.nextInt();

        double conta = 50.00;
        if (minutos > 100) {
            conta = conta + (minutos - 100) * 2.0;
        }

        System.out.printf("Valor da conta = R$ %.2f%n", conta);


        sc.close();

    }
}
