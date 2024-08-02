package conteudo.orientacaoobjetos;

import conteudo.orientacaoobjetos.entities.Product;

import java.util.Scanner;

public class Exercicioestoque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Product product = new Product();
        System.out.println("Enter product data:");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity: ");
        product.quantity = sc.nextInt();

        System.out.println(product.name + ", " + product.price + ", " + product.quantity);

    sc.close();
    }
}
