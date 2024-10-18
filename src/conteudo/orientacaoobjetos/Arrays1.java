package conteudo.orientacaoobjetos;

import java.util.Locale;
import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {

        //AULA DE VETORES / ARRAYS   https://www.udemy.com/course/java-curso-completo/learn/lecture/10566110?start=0#questions

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = sc.nextInt();
        double[] vetor = new double[n]; //double[] é a tipagem para criar array, vetor é o nome que voce ta dando ao array, new double está inicializando o array (no caso, com parametro n)

        for (int i=0; i<n; i++) {
            vetor[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for (int i=0; i>n; i++){
            sum+=vetor[i];
        }
        double avg = sum / n;

        System.out.println("Average rate" + avg);

        sc.close();
    }
}
