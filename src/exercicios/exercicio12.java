package exercicios;

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
//        seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
//        nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”

        int valor1 = sc.nextInt();

        if (valor1 < 0) {
            System.out.println("Fora de intervalo");
            }
            else if (valor1 <= 25) {
                System.out.println("Intervalo [0,25]");
            }
            else if (valor1 < 51) {
                System.out.println("Intervalo [26,50]");
            }
            else if (valor1 < 76) {
                System.out.println("Intervalo [51,75]");
            }
            else if (valor1 < 101) {
                System.out.println("Intervalo [76,100]");
            }
            else {
                System.out.println("Fora de intervalo");
                }

        sc.close();
    }
}
