package conteudonelioalves.introducao.exercicios;

import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        double renda = sc.nextDouble();
        double imposto;

        if (renda <= 2000.00) {
            System.out.println("Isento de Imposto");
        }
            else if (renda > 2000.00 && renda <= 3000.00) {
                imposto = ((renda - 2000.00) * 8 / 100); //OBS: para descobrir a % também poderia ser feito:  imposto = (renda - 2000.0) * 0.08;
                System.out.println("Imposto: " + imposto);
            }
            else if (renda > 3000.00 && renda <= 4500.00) {
                imposto = ((renda - 3000.00) * 18 / 100 + (1000.00 * 8 / 100));
                System.out.println("Imposto: " + imposto);
            }
            else if (renda > 4500.00) {
                imposto = ((renda - 4500.00) * 28 / 100 + ((1500.00 * 18 / 100) + (1000.00 * 8 / 100)));
                System.out.println("Imposto: " + imposto);
            }
    }
}
