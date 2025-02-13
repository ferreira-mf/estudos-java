package conteudofkipper;

import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {

        //ARRAY E ARRAYLIST

        //Variavel de array/vetor (ja inicializada com valores dentro das posiçoes)
        int colecaoDeInteiros[] = {1, 2, 3, 4, 5};

        System.out.println(colecaoDeInteiros[0]); //isso ira printar a primeira posição do array

        System.out.println(colecaoDeInteiros.length); //isso ira mostrar a quantidade de posicoes do array (tamanho do array) OBS: ARRAYLIST é .GET e ARRAY é .LENGHT

        //Variavel de array/vetor (inicializando o array com a quantidade de posicoes, mas sem valores dentro das posicoes)
        int meusNumeros[] = new int[5]; //o numero 5 representa a quantidade/lenght de casas dentro do array

        //Criando array sem valores nas posiçoes e acrescentando depois
        String nomesArray[] = new String[5]; //aqui foi iniciado o array com 5 posiçoes, mas sem valores nessas posiçoes.
        nomesArray[1] = "Maria"; //aqui foi atribuido o valor Maria dentro da posiçao 1 do array


        //ARRAY LIST (ARRAY DINAMICO ONDE NAO DEFINIMOS A QUANTIDADE EXATA DE CASAS DO ARRAY)

        ArrayList<String> nomes = new ArrayList<>(); //Criado um array list de strings com a variavel nomes
        nomes.add("Fernanda"); //Aqui foi ADICIONADO Fernanda dentro do Array List
        nomes.add("Joao"); //aqui é para adicionar outro (e por ai vai, sem limites)
        System.out.println(nomes.get(0)); //aqui é para printar o que contem dentro do arraylist, sendo "0" do exemplo a posição que vc quer acessar/printar. OBS:ARRAYLIST é .GET e ARRAY é .LENGHT
        nomes.remove(0); //aqui é para REMOVER o que contem no array posicao 1, no caso é a Fernanda... Sendo assim, João passa a ocupar a posição 0.
    }
}
