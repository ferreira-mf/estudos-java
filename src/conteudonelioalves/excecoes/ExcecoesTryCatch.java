package conteudonelioalves.excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcecoesTryCatch {
    public static void main(String[] args) {

    /*SINTAXE:

    video: https://www.udemy.com/course/java-curso-completo/learn/lecture/10793842#overview

    try {
    }
    catch (ExeptionType e) {
    }

     */
        Scanner sc = new Scanner(System.in);

        try { //ele vai tentar o codigo abaixo
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) { //ao apresentar essa excecao (erro ao pegar uma posicao nao existente do array), ele vai printar posicao invalida
            System.out.println("Posicao Invalida");
        }
        catch (InputMismatchException e) {
            System.out.println("Input Error");
        }
        System.out.println("Fim do programa");
        sc.close();


        //STACK TRACE (Rastrear onde as exceçoes estão ocorrendo)
        // VIDEO EXPLICANDO: https://www.udemy.com/course/java-curso-completo/learn/lecture/10793846#overview

        //BLOCO FINALLY
        // VIDEO EXPLICANDO: https://www.udemy.com/course/java-curso-completo/learn/lecture/10793850#overview
    }
}
