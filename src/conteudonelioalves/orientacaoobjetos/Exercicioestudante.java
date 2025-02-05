package conteudonelioalves.orientacaoobjetos;

import conteudonelioalves.orientacaoobjetos.entities.Student;

import java.util.Scanner;

public class Exercicioestudante {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.println("Insira o nome do aluno: ");
        student.name = sc.nextLine();
        System.out.println("Insira a primeira nota: ");
        student.n1 = sc.nextDouble();
        System.out.println("Insira a segunda nota: ");
        student.n2 = sc.nextDouble();
        System.out.println("Insira a terceira nota: ");
        student.n3 = sc.nextDouble();

        System.out.println(student.name + " = " + student.notaFinal());

        if (student.notaFinal() >= 60.00) {
            System.out.println("Aprovado");
        } else {
            System.out.printf("Reprovado, falta %.2f pontos%n", student.aprovacao());
        }
        sc.close();
    }
}
