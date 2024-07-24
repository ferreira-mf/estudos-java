package conteudo;

import java.util.Scanner;

public class estruturaFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*      Estrutura repetitiva Para

        É uma estrutura de controle que repete um bloco de comandos
        para um certo intervalo de valores.

        Quando usar: quando se sabe previamente a quantidade de repeticoes, ou o intervalo de valores.



        SINTAXE:
            for ( inicio; condicao; incremento) {
                comando 1
                comando 2
            }
        OBS: inicio: executa somente na primeira vez.
             condicao: V: executa e volta, F: pula fora (similar ao while)
             incremento: Executa toda vez depois de voltar

*/

/*     EXEMPLO:

        Fazer um programa que le um valor inteiro N e depois N numeros inteiros.
        No final, mostra a soma dos N numeros lidos.
*/

        int N = sc.nextInt();
        int soma = 0;

        for (int i = 0; i < N; i = i + 1) {  //variavel i sera executada somente 1 vez... enquanto i for menor que N, bloco for sera executado... sempre que o bloco for ir ate o fim, sera executado o incremento, i recebera +1...
            int x = sc.nextInt();
            soma = soma + x;
        }

        System.out.println(soma);

    /*  IMPORTANTE:
        Perceba que na estrutura for, é otima para se fazer uma repeticao baseada em CONTAGEM
        Exemplo de CONTAGEM:


        for (int i = 0; i < 5; i = i + 1 );
            System.out.println("Valor de i: " + i);

            resultado na tela:
            valor de i: 0
            valor de i: 1
            valor de i: 2
            valor de i: 3
            valor de i: 4

        Exemplo de CONTAGEM REGRESSIVA:

                for (int i = 4; i >= 0; i = i - 1 );
            System.out.println("Valor de i: " + i);

            resultado na tela:
            valor de i: 4
            valor de i: 3
            valor de i: 2
            valor de i: 1
            valor de i: 0
    */
    }
}
