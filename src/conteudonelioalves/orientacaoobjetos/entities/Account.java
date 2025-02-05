package conteudonelioalves.orientacaoobjetos.entities;

public class Account {

    //EXERCICIO SEÇÃO 9 : https://www.udemy.com/course/java-curso-completo/learn/lecture/10566070#overview

    private int number;
    private String holder;
    private double balance;

    //CONSTRUTORES
    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Account(int number, String holder, double initialDeposit) { //esse construtor é caso haja um deposito inicial
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit); //deposito inicial recebendo o valor do parametro
    }
    //FIM CONSTRUTORES

    //GET AND SETTERS
    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }
    //FIM GET AND SETTERS

    //METODOS
    public void deposit(double amount) {
       this.balance += amount;
    }

    public void withdraw (double amount) {
        this.balance -= amount + 5.0; //a conta aqui é balance - (amount+5) = ...   (exemplo: Se this.balance é 10 e amount é 20, o metodo withdraw subtrai amount (20) e uma taxa adicional de 5.0 do saldo. Portanto, o cálculo será: 10 - (20 + 5) = -15.

    }

    public String toString() {
        return "Account "
                + number
                + ", Holder: "
                + holder
                + ", Balance: $"
                + String.format("%.2f", balance);
    }
    //FIM METODOS


}
