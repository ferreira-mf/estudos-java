package conteudonelioalves.introducao.exercicios;

import java.util.Scanner;

public class exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
        incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
        impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.*/

        int senha = 2002;
        int validacao = sc.nextInt();

        while(validacao != senha) {
            System.out.println("Senha incorreta");
            validacao = sc.nextInt();
        }

        System.out.println("Senha correta!");
        sc.close();
    }
}
