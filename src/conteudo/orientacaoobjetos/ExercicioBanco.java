package conteudo.orientacaoobjetos;

import conteudo.orientacaoobjetos.entities.Account;

import java.util.Locale;
import java.util.Scanner;

////EXERCICIO SEÇÃO 9 : hhttps://www.udemy.com/course/java-curso-completo/learn/lecture/10566072?start=15#questions

public class ExercicioBanco {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.println("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);

        if (response == 'y') {  //se tiver deposito inicial
            System.out.println("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble(); //ele digitara o deposito inicial
            account = new Account(number, holder, initialDeposit); //E será armazenado em 3 parametros
        }
        else { //senão, será armazenado apenas em 2 parametros
            account = new Account(number, holder);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account); //OBS: esse print está puxando o toString da classe account.

        System.out.println();
        System.out.print("Enter deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Updated account data: ");
        System.out.println(account);



        sc.close();
    }
}
