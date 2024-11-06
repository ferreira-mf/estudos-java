package conteudo.orientacaoobjetos;

import java.util.Scanner;

public class ExercicioMatriz {

    public static void main(String[] args) {

        //exercicio explicado: https://www.udemy.com/course/java-curso-completo/learn/lecture/10566132#overview

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] mat = new int[n][n]; //os 2 [], é oque define que será uma matriz, sendo bi-dimensional... [n](N linhas) e [n] (N colunas)

        for (int i = 0; i < mat.length; i++) { //esse primeiro for, percorre as linhas da matriz
            for (int j = 0; j < mat[i].length; j++) { //esse segundo for percorre as colunas (sendo assim os 2 for juntos percorrem a matriz inteira)
                mat[i][j] = sc.nextInt(); //na linha i, coluna j irá receber o sc.nextInt
            }
        }

        System.out.println("Main diagonal:");
        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();

        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] < 0) {
                    count++;
                }
            }
        }
        System.out.println("Negative numbers = " + count);

        sc.close();
    }
}
