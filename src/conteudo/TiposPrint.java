package conteudo;

public class TiposPrint {
    public static void main(String[] args) {
            //DECLARACAO DE VARIAVEIS
            int y = 32;
            double x = 10.35784;

            String nome = "Maria";
            int idade = 31;
            double renda = 4000.0;


            //ESCREVER NA TELA
            System.out.print("Bom dia!"); // print não quebra a linha
            System.out.println("Olá Mundo!"); // println quebra a linha
            System.out.println(y); //println contendo variavel
            System.out.println(x); //println contendo variavel
            System.out.printf("%.2f%n", x); //prinf conta casa decimal exibida, %.2f% significa a quantidade de casa e o %n é a quebra de linha
            System.out.println("Resultado = " + x + " Metros"); // Concatenar/Concatenação
            System.out.printf("Resultado = %.2f metros%n", x); // Concatenação onde a variavel entra no %.2f (quantidade de quebra de linha)
            System.out.printf("%s tem %d anos e ganha R$ %.2f reais.%n", nome, idade, renda); //Concatenação de varios elementos onde: %f = ponto flutuante, %d = inteiro, %s = texto, %n = quebra de linha
    }
}
