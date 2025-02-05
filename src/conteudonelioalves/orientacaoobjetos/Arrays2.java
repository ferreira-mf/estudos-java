package conteudonelioalves.orientacaoobjetos;

import conteudonelioalves.orientacaoobjetos.entities.ProductArray2;

import java.util.Locale;
import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args) {

        //AULA DE VETORES / ARRAYS   https://www.udemy.com/course/java-curso-completo/learn/lecture/10566112#questions/9609254 (aula 2)

        //CRIAR UM VETOR CUJO ELEMENTOS SAO OBJETOS DO TIPO CLASSE.
        //PROBLEMA: Fazer um programa para ler UM NUMERO INTEIRO (N) e os dados (NOME E PREÇO) de (N) produtos. Armazene os (N) produtos em um vetor e mostre o preço medio dos produtos.

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = sc.nextInt();
//      double vetor[] = new double[n]; <-- aqui é a criação de um array padrão tipo double (nao iremos usar aqui)
        ProductArray2 vetor[] = new ProductArray2[n]; // aqui a criação de um array usando a classe ProductArray2

        for (int i = 0; i<vetor.length; i++){ //ao inves de usar o n (variavel digitada pelo usuario p/ tamanho do vetor, escrever vetor.lenght, pois pega automaticamente o tamanho do vetor)
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vetor[i] = new ProductArray2(name, price);
        }

        double sum = 0;
        for (int i = 0; i< vetor.length; i++){
            sum += vetor[i].getPrice();
        }
        double avg = sum / vetor.length;

        System.out.println("Average Price: " + avg);


        sc.close();
    }
}
