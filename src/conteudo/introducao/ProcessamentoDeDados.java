package conteudo.introducao;


public class ProcessamentoDeDados {
    public static void main(String[] args) {

    //PROCESSAMENTO DE DADOS

        //Variavel onde há operaçoes
        int q = 5;
        int w = 2 * q;

        System.out.println("variavel de q é igual a: " + q);
        System.out.println("variavel de w é igual a: " + w);

        //Calcula da área de um trapézio
        double b, B, h, areaTrapezio;
        b = 6.0;
        B = 8.0;
        h = 5.0;
        areaTrapezio = (b + B) / 2 * h;
        System.out.println("a area do trapézio é igual a: " + areaTrapezio);

        //DIVISAO DE NUMEROS INTEIROS, QUANDO O VALOR DA NUMERO QUEBRADO
        int o, p;
        double resultado;

        o = 5;
        p = 2;
        resultado = (double) o / p;
        System.out.println("5 dividido por 2 é igual a: " + resultado);

    }
}
