package conteudo.introducao;

import java.util.Scanner;

public class FuncoesSintaxe {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
/*
                    FUNCOES:
Principais vantagens: modularização, delegação e reaproveitamento

Dados de entrada e saída:
Funções podem receber dados de entrada (parâmetros ou argumentos)
Funções podem ou não retornar uma saída

Em orientação a objetos, funções em classes recebem o nome de "métodos".

 */

//Problema Exemplo: Fazer um programa para ler 3 numeros inteiro e mostrar na tela o maior deles e coloca-los em funcoes

        //IMPORTANTE: RODAR EM MODO DEBUG PARA COMPREENDER MELHOR O PASSO A PASSO

        System.out.println("Digite 3 numeros: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        //Primeira maneira de resolver (usando logica de programacao)

        int higher = max(a,b,c);
        showResult(higher);
        sc.close();
    }

    public static int max(int x, int y, int z) { //Como essa função vai retornar um numero inteiro no final, é necessario declarar com public + static + int + nomeFuncao
        int aux;
        if (x > y && x > z) {
            aux = x;
        }
        else if (y > z) {
            aux = y;
        }
        else {
            aux = z;
        }
        return aux;
    }

    public static void showResult (int value) {
        System.out.println("Higher = " + value);
    }
}
