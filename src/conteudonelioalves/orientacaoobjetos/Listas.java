package conteudonelioalves.orientacaoobjetos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
    public static void main(String[] args) {

        //Aula sobre listas: https://www.udemy.com/course/java-curso-completo/learn/lecture/10566124#questions/9215860

        List<String> list = new ArrayList<>(); //Para instanciar não pode ser somente List<Integer> list = new List (); ...

         //ao escrever list. irá aparecer varias operaçoes que é possivel fazer na lista
        list.add("Maria"); //por ser uma lista <String>, adicionamos uma String Maria na minha lista.
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");

        //Como adicionar alguem em alguma posição especifica da lista:
        list.add(2, "Marco"); //aqui foi adicionado na posição 2, o Marco... (por ser posição 2, ele deve entrar na frente do Alex, sem prejudicar o resto da lista)

        //ver tamanho da lista
        System.out.println(list.size()); //ver tamanho da lista OBS: list foi pq dei o nome de list quando isntanciei o List.

        //remover elemento da lista (deixar as linhas descomentadas caso queira testar um por um)
//        list.remove("Anna"); //aqui ele removera a Anna
//        list.remove(1); //aqui ele removera quem esta na posiçao 1 da lista
//        list.removeIf(x -> x.charAt(0) == 'M'); //remocao por predicado, sera removido da lista todos que comecam com a letra M.



        for (String x : list) { //forEach,le-se: Para cada String x pertencente a minha list vou mandar imprimir na tela, valor x
            System.out.println(x);
        }

        //Encontrar posição de um elemento:  OBS: CASO O ELEMENTO NAO SEJA ENCONTRADO, A POSICAO DELE SERA -1
        System.out.println("Posicao do Bob:" + list.indexOf("Bob")); //Mostra a posicao do bob na lista

        //Filtrar a lista para que tenha somente os nomes começados com a letra A (ver video caso haja duvida)
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);
        }

        //Encontrar primeiro elemento que comece com a letra A (caso nao encontre, retornara null)
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
    }
}
