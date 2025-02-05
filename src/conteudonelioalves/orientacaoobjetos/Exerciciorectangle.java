package conteudonelioalves.orientacaoobjetos;

import conteudonelioalves.orientacaoobjetos.entities.Rectangle;

import java.util.Scanner;

public class Exerciciorectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();
        System.out.println("Insira a largura do retangulo: ");
        rectangle.width = sc.nextDouble();
        System.out.println("Insira a altura do retangulo: ");
        rectangle.height = sc.nextDouble();

        System.out.println("area: " + rectangle.area());
        System.out.println("perimetro: " + rectangle.perimeter());
        System.out.println("diagonal: " + rectangle.diagonal());

        sc.close();
    }
}
