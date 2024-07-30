package conteudo;

public class ExpressaoCondicional {
    public static void main(String[] args) {

        /*Expressão condicional ternaria:
        Estrutura opcional ao if-else quando se deseja incluir um VALOR com base em uma condição

        SINTAXE:
        ( condição ) ? valor_se_verdadeiro : valor_se_falso

        EXEMPLOS:

        ( 2 > 4) ? 50 : 80   (retornará 80, é falso)
        (10 != 3) ? "Maria" : "Alex"    (retornará Maria, pois é verdadeiro)
         */

    //demonstracao do mesmo codigo usando 2 metodos diferentes

        //modelo normal:
        double preco = 34.5;
        double desconto;
        if (preco < 20.0) {
            desconto = preco * 0.1;
        }
        else {
            desconto = preco * 0.05;
        }

        //modelo usando expressao condicional:

        double preco2 = 34.5;
        double desconto2 = (preco2 < 20.0) ? preco2 * 0.1 : preco2 * 0.05;


    }
}
