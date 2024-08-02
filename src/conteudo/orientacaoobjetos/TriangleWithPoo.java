package conteudo.orientacaoobjetos;

import conteudo.orientacaoobjetos.entities.Triangle; //aqui estou importando a classe Triangle

import java.util.Scanner;

public class TriangleWithPoo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangle x, y; // aqui estou criando a variavel x e y, do tipo Triangle.
        x = new Triangle(); // essa linha representa um objeto (um triangle x)
        y = new Triangle(); // essa linha representa outro objeto (triangle y)

        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble(); //esta linha ira guardar o valor do atributo 'a' (do triangulo) dentro do objeto 'x'.
        x.b = sc.nextDouble(); //esta linha ira guardar o valor do atributo 'b' dentro do objeto 'x'.
        x.c = sc.nextDouble(); //esta linha ira guardar o valor do atributo 'c' dentro do objeto 'x'.

        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble(); //esta linha ira guardar o valor do atributo 'a' dentro do objeto 'y'.
        y.b = sc.nextDouble(); //esta linha ira guardar o valor do atributo 'b' dentro do objeto 'y'.
        y.c = sc.nextDouble(); //esta linha ira guardar o valor do atributo 'c' dentro do objeto 'y'.

        //Aqui fazendo a chamda do método que vai calcular a area do trinagulo x e y.
        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaY > areaX) {
            System.out.println("Larger area: Y");
        }
        else {
            System.out.println("Larger area: X");
        }
    }
}
