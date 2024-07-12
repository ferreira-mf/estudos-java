package exercicios;

import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
//        que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
//        qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
//        Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
//        mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
//
//                0 a 2500 = Isento
//                2000.01 a 3000.00 = 8%
//                3000.01 a 4500.00 = 18%
//                acima de 4500.00 = 28%
//
//                Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
//        salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
//        de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
//        duas casas decimais.

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
