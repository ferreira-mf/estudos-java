package conteudo.introducao;

import java.util.Scanner;

public class InputDeDados {
    public static void main(String[] args) {

        //INPUT DE DADOS (necessário importar: import java.util.Scanner;)
        Scanner sc = new Scanner(System.in); //criaçao da variavel que associa o Scanner ao teclado no modo console

        //Input de texto: next() lê a String até o primeiro espaço enquanto nextLine() lê até encontrar uma quebra de linha.
        System.out.println("Escreva uma palavra (String):");
        String digitarString = sc.next();
        System.out.println("1 - Você digitou: " + digitarString);

        //Input para digitar inteiros
        System.out.println("Escreva um numero inteiro (int):");
        int digitarInt = sc.nextInt();
        System.out.println("2 - Você digitou: " + digitarInt);

        //Input para digitar double
        System.out.println("Escreva um numero com casas decimais (double):");
        double digitarDouble = sc.nextDouble();
        System.out.println("3 - Você digitou: " + digitarDouble);

        //Input para digitar um caractere
        System.out.println("Escreva um Caractere (char):");
        char digitarChar = sc.next().charAt(0);
        System.out.println("3 - Você digitou: " + digitarChar);

        //Input de mais de um dado em uma só linha (apertando 1 somente o enter)
        System.out.println("Escreva uma String, um int e um double em uma so linha:");
        String linhaUm = sc.next();
        int linhaDois = sc.nextInt();
        double linhaTres = sc.nextDouble();
        System.out.println("Dados digitados");
        System.out.println(linhaUm);
        System.out.println(linhaDois);
        System.out.println(linhaTres);

        /*Input de texto: next() lê a String até o primeiro espaço (uma palavra) enquanto nextLine() lê até encontrar uma quebra de linha.
        ou seja, quando for para digitar texto com mais de uma palavra, use nextLine().
         */

        // Consumir a linha vazia pendente
        sc.nextLine();

        String s1, s2, s3;
        System.out.println("digite o primeiro texto");
        s1 = sc.nextLine();

        System.out.println("digite o segundo texto");
        s2 = sc.nextLine();

        System.out.println("digite o terceiro texto");
        s3 = sc.nextLine();

        System.out.println("texto completo:");
//      sc.nextLine(); //<--- EXEMPLO: LEIA A OBS ABAIXO
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        sc.close();
    /*OBS: Quando você usa um comando de leitura diferente de nextLine(), (nextInt() por exemplo) e dá alguma quebra de linha, essa quebra  de
    linha fica pendente na entrada padrão... SOLUÇÂO: Faça um nextLine() extra antes de fazer o nextLine() de seu interesse)
     */



    }
}
