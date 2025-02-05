package conteudonelioalves.orientacaoobjetos;

import conteudonelioalves.orientacaoobjetos.entities.Rent;

import java.util.Scanner;

public class DesafioArrays3 {
    public static void main(String[] args) {

        //Exercicio: https://www.udemy.com/course/java-curso-completo/learn/lecture/32875596#questions

        Scanner sc = new Scanner(System.in);

        Rent vetor[] = new Rent[10];

        System.out.println("How many rooms will be rented? ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println();
            System.out.println("Rent #" + i + ":");
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String  email = sc.next();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();

            vetor[roomNumber] = new Rent(name, email); //aqui ele esta instanciando o objeto Rent (com os 2 parametros necessarios) na posiçao roomNumber que o usuario informou.
        }

        System.out.println();
        System.out.println("Busy Rooms");
        for (int i=0; i<10; i++) {
            if (vetor[i] != null) {
                System.out.println(i + ": " + vetor[i]);
            }
        }


        sc.close();
    }
}
