package conteudo.orientacaoobjetos;

import conteudo.orientacaoobjetos.util.CurrencyConverter;

import java.util.Scanner;

public class exercicioDolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CurrencyConverter currencyConv = new CurrencyConverter();

        double valorDolar, quantidadeDolar;

        System.out.println("What is the dollar price? ");
        valorDolar = sc.nextDouble();
        System.out.println("How many dollars will be bought? ");
        quantidadeDolar = sc.nextDouble();
        System.out.println("Amount to be paid in reais: ");
        currencyConv.valorEmReal(valorDolar, quantidadeDolar);
        System.out.println(currencyConv.valorEmReal(valorDolar, quantidadeDolar));
    }
}
