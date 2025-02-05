package conteudonelioalves.orientacaoobjetos;


import java.util.Scanner;

public class TriangleWithoutPoo {
    public static void main(String[] args) {

        //ORIENTACAO A OBJETOS

        //Resolvendo um problema SEM orientacao a objetos:

        /*
        Problema exemplo:
        Fazer um programa para ler as medidas dos lados de dois triangulos X e Y (suponha medidas validas).
        Em seguida, mostrar o valor das areas dos dois triangulos e dizer qual dos dois triangulos possui a maior area.

        A formula para calcular a area de um triangulo a partir das medidas de seus lados a, b, c, é a seguinte(formula Heron):

         */

        Scanner sc = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC; //variaveis dos lados do triangulo x e triangulo y.

        System.out.println("Enter the measures of triangle X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        //formula para calcular area do triangulo X
        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        //formula para calcular area do triangulo y
        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

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
