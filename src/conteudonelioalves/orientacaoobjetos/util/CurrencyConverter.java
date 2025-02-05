package conteudonelioalves.orientacaoobjetos.util;

public class CurrencyConverter {

    double valorEmReal;

    public double valorEmReal(double valorDolar, double quantidadeDolar) {
        double total = quantidadeDolar * valorDolar;
        double iof = total * 0.06;
        return total + iof;
    }
}

