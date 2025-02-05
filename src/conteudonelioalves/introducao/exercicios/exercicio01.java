package conteudonelioalves.introducao.exercicios;

import java.util.Scanner;


public class exercicio01 {
    public static void main(String[] args) {

    /*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
      mensagem explicativa.*/

       Scanner sc = new Scanner(System.in);
       System.out.println("Digite um numero inteiro:");
       int n1 = sc.nextInt();
       System.out.println("Digite outro numero inteiro:");
       int n2 = sc.nextInt();
       int soma = n1 + n2;

       System.out.println("A soma destes dois números é igual a: " + soma);
        sc.close();
    }
}
