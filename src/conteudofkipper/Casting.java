package conteudofkipper;

public class Casting {
    public static void main(String[] args) {

        // CASTING:  CONVERSAO DE UM TIPO DE DADO PARA OUTRO

        //EXEMPLOS:

        //DOUBLE PARA INTEIRO
        double resultado = 0.0;
        int resultadoInt = ((int) resultado);

        //INTEIRO PARA DOUBLE
        int meuInt = 10;
        double meuDouble = meuInt;

        //STRING EM INTEIRO
        String meuString = "10";
        int meuInt2 = Integer.parseInt(meuString);

        //INTEIRO EM STRING
        String minhaString = String.valueOf(meuInt2);
    }
}
