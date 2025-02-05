package conteudonelioalves.orientacaoobjetos;

import java.util.Scanner;

public class ExercicioArray2 {
    public static void main(String[] args) {

        //link do exercicio: https://www.udemy.com/course/java-curso-completo/learn/lecture/32875594#questions

        Scanner sc = new Scanner(System.in);


        System.out.println("Quantas pessoas serão digitadas: ");
        int n = sc.nextInt();

        String nomes[] = new String[n];
        int idades[] = new int[n];
        double alturas[] = new double[n];

        for (int i=0; i<n; i++) {
            System.out.println("Dados da " + (i+1) + "a pessoa: ");
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();
        }


        // media da altura das pessoas
        double soma = 0.0;
        for (int i=0; i<n; i++) {
            soma = soma + alturas[i];
        }
        double mediaAlturas = soma / n;
        System.out.println("Altura média: " + mediaAlturas);

        //contar quantas pessoas com menos de 16 anos:
        int cont = 0;
        for (int i=0; i<n; i++) {
            if (idades[i]<16) {
                cont = cont + 1;
            }
        }

        //ver qual a % de pessoas tem menos de 16 anos:
        double percent = cont * 100.0 / n;

        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent);

        for (int i=0; i<n; i++) {
            if (idades[i]<16) {
                System.out.println(nomes[i]);
            }

        }

        sc.close();
    }
}
