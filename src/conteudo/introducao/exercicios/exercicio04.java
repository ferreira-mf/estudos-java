package conteudo.introducao.exercicios;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {

        /*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
        hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
        decimais.*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero do funcionario:");
        int numeroFuncionario = sc.nextInt();
        System.out.println("Digite o numero de horas trabalhadas:");
        int horasTrabalhadas = sc.nextInt();
        System.out.println("Digite o valor que ele recebe por hora:");
        float salarioHora = sc.nextFloat();
        float salarioTotal = salarioHora * horasTrabalhadas;

        System.out.printf("O funcionário de número %d recebe R$ %.2f%n",numeroFuncionario, salarioTotal);




        sc.close();
    }
}
