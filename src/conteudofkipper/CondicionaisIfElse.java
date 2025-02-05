package conteudofkipper;

public class CondicionaisIfElse {
    public static void main(String[] args) {

        byte b = 100;
        short s = 10000;
        int i = 100000;
        long l = 100000L; //precisa ter o L no final
        float f = 10.5f; //precisa ter o f no final
        double d = 20.5;
        char c = 'A';
        boolean bool = true;
        String str = "dkdkdkd"

        //se bool for verdadeiro, printe verdadeiro, senao falso.
        if (bool) {
            System.out.println("Verdadeiro");
        }
        else {
            System.out.println("Falso");
        }

        //se b for maior que 99 printe Verdadeiro, senao falso.
        if (b > 99) {
            System.out.println("Verdadeiro");
        }
        else {
            System.out.println("Falso");
        }

        //se str for vazio, printa Verdadeiro; Se for Fernanda printa Fernanda; qualquer outra coisa printa Falso
        if (str.isBlank()) {
            System.out.println("Verdadeiro");
        } else if (str == "Fernanda") {
            System.out.println("Fernanda");
        }
        else {
            System.out.println("Falso");
        }


    }
}
