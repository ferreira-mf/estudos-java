package conteudo.orientacaoobjetos;

import conteudo.orientacaoobjetos.entities.Product;

import java.util.Scanner;

public class Exercicioestoque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        /*
        Explicação do código abaixo: Product product = new Product();
        Criação de uma Instância: new Product(): cria uma nova instância da classe Product. Em Java, new é uma palavra-chave usada para alocar
        memória para um novo objeto e chamar o construtor da classe para inicializá-lo.
        Portanto, essa parte do código cria um novo objeto do tipo Product.
        Atribuição à Variável: Product product declara uma variável chamada product do tipo Product.
        O operador = atribui a nova instância criada ao nome da variável product.
         */
        Product product = new Product();
        System.out.println("Enter product data:");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity: ");
        product.quantity = sc.nextInt();
//        product.toString(); //tostring

        System.out.println();
        System.out.println("Product data: " + product);
// O código acima foi basicamente a mesma coisa disso: System.out.println(product.name + ", " + product.price + ", " + product.quantity);
        System.out.println();
    //Aqui foi criado a parte de adicionar o produto ao estoque
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println();
        System.out.println("Updated data: " + product);
    //Aqui foi criado a parte de remover o produto do estoque

        System.out.println("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println();
        System.out.println("Updated data: " + product);
    sc.close();
    }
}
