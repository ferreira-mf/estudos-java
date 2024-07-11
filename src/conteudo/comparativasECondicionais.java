package conteudo;

import java.util.Scanner;

public class comparativasECondicionais {
    public static void main (String[] args) {


    /*OPERADORES COMPARATIVOS

    > Maior que
    < Menor que
    >= Maior ou igual
    <= Menor ou igual
    == igual
    != diferente


    OPERADORES LÓGICOS

    && = E
    || = OU
    ! = NÃO

    ESTRUTURA CONDICIONAL

    Simples:
    if ( <condicaoo> ) {
        <comando 1>
        <comando 2>
    }

    Composta:

    if ( <condicao> ) {
        <comando 1>
        <comando 2>
    }
    else {
        <comando1>
        <comando2>
    }

    ENCADEAMENTO DE ESTRUTURAS CONDICIONAIS (QUANDO HÁ MAIS DE 2 CONDIÇOES)

    if ( <condicaoo> ) {
        <comando 1>
        <comando 2>
    }
    else {
        if ( condicao2 ) {
            <comando3>
            <comando4>
        }
        else {
            <comando5>
            <comando6>
        }
    }

     */

    //Exemplo de Estrutura Condicional SIMPLES:

        int x = 5;

        System.out.println("Bom dia");

        if (x > 0) {
            System.out.println("Boa tarde");  //Como x é maior que 0 ele retorna a mensagem (true)
        }

        if (x < 0) {
            System.out.println("Boa noite"); //Como não é menor que 0 ele não retorna a mensagem (false)
        }


    //Exemplo de Estrutura Condicional COMPOSTA: (APENAS 2 CONDIÇOES)
        Scanner sc = new Scanner(System.in);
        int hora;
        System.out.println("Digite que horas são:");
        hora = sc.nextInt();

        if (hora <= 12) {                        // se hora for menor ou igual a 12 é bom dia, senão é boa noite
            System.out.println("Bom dia");
        }
        else {
            System.out.println("Boa noite");
        }

    // Exemplo de Condicional Composta caso haja mais de 2 possibilidades: (MAIS DE 2 CONDIÇOES)

        int hora2;
        System.out.println("Digite que horas são:");
        hora2 = sc.nextInt();

        if (hora2 <= 12) {
            System.out.println("Bom dia");
        }
        else if (hora2 < 18)
                System.out.println("Boa tarde");
            else {
                System.out.println("Boa noite");
        }

        sc.close();
    }
}
