package conteudonelioalves.orientacaoobjetos;

import java.util.Scanner;

public class ExercicioArray1 {
    public static void main(String[] args) {

        //Digitar a variavel N, digitar N numeros e printar os numeros negativos

        //link exercicio: https://www.udemy.com/course/java-curso-completo/learn/lecture/32875592#questions

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");
        int N = sc.nextInt();
        double vetor [] = new double[N];


        for (int i=0; i< vetor.length; i++ ) {
            System.out.println("Digite um numero: ");
            vetor [i] = sc.nextInt();
        }

        System.out.println("numeros negativos: ");
        for (int i=0; i< vetor.length; i++) {
            if (vetor[i]<0) {
                System.out.println(vetor[i]);
            }
        }

        sc.close();
    }
}
