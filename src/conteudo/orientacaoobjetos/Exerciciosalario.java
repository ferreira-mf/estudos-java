package conteudo.orientacaoobjetos;

import conteudo.orientacaoobjetos.entities.Employee;

import java.util.Scanner;

public class Exerciciosalario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.println("Insira o nome do funcionario: ");
        employee.name = sc.nextLine(); //debugar neste ponto para entender como funciona...
        System.out.println("Insira o salario bruto: ");
        employee.grossSalary = sc.nextDouble();
        System.out.println("Insira o valor do imposto: ");
        employee.tax = sc.nextDouble();

        System.out.println(employee);

        System.out.println("Insira a porcentagem para aumentar o salario: ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);
        System.out.println("Valor atualizado com acrescimo da porcentagem: " + employee);
    }
}
