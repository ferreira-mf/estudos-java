package conteudofkipper;

import java.util.ArrayList;

public class ForWhile {
    public static void main(String[] args) {

        //FOR E WHILE (LOOP)

        //Criando um Arraylist para ser utilizado como exemplo no for
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Maria");
        nomes.add("Joao");
        nomes.add("Pedro");
        nomes.add("Leticia");

        //PRIMEIRA MANEIRA DE FAZER O FOR
        for (int i = 0; i < nomes.size(); i++) {
            //int i = 0: Inicializa a variável i como 0. Esta variável será usada para contar o número de iterações e também como índice para acessar os elementos da lista nomes
            //i < nomes.size(): Esta é a condição do loop. O loop continuará a ser executado enquanto i for menor que o tamanho da lista nomes. nomes.size() retorna o número de elementos na lista
            //i++: Este é o incremento do loop. Após cada iteração, o valor de i será aumentado em 1.
            System.out.println(i); //Aqui ele ira printar as posicoes do arraylist, até que chegue ao fim
        }
        //SEGUNDA MANEIRA DE FAZER O FOR (FOR-EACH)
        for (String nome : nomes) { //O loop começa e a variável "nome" é declarada como do tipo String. E ele percorre cada posiçao do ArrayList "nomes"
            System.out.println(); //aqui ele printa todas o que contem em cada posiçao percorrida
        }


        //WHILE (loop que é executado ATÉ QUE ele chegue em uma condição)

        int contador = 0;
        while (contador < 10) { //enquanto a variavel contador for menor que 10, o while continua.
            System.out.println("Ainda estou no WHILE");
            contador++; // aqui ele soma "1" no contador (obs: se tirar o contador, ele entra em um loop infinito)
            //resultado: ele ira printar "Ainda estou no WHILE" 10 vezes.
        }




    }
}
