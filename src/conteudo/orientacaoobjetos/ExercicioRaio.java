package conteudo.orientacaoobjetos;

import conteudo.orientacaoobjetos.util.Calculator;

import java.util.Scanner;

public class ExercicioRaio {

    public static void main(String[] args) {

        //Inserir valor do raio e calcular, circunferencia e volume.
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = calc.circumference(radius);

        double v = calc.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", calc.PI);


    }

    //OBS: AS FUNCOES ABAIXO FORAM COLOCADAS EM util/calculator.java
    //funcao da circunferencia tendo o raio como argumento
//    public static double circumference (double radius) {
//        return 2.0 * PI * radius;
//    }
//
//    //funcao do volume tendo raio como argumento
//    public static double volume (double radius) {
//        return 4.0 * PI * radius * radius * radius / 3.0;
//    }

}