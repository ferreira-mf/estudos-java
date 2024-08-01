package conteudo.introducao;

public class FuncoesString {
    public static void main(String[] args) {

        //Converter String para minusculo
        String original = "abcde FGHIJ ABC abc DEFG     "; //texto normal
        String s01 = original.toLowerCase(); //convertendo para minusculo
        System.out.println(s01);

        //Converter para maiusculo
        String s02 = original.toUpperCase();
        System.out.println(s02);

        //Elimina os espaços em branco dos cantos da string
        String s03 = original.trim();
        System.out.println(s03);

        //Recorta a String para mostrar de um caractere em diante
        String s04 = original.substring(2); //Mostra a string do caractere 2 em diante (lembrando que 0 é 1)
        System.out.println(s04);

        //Recorta a string para mostrar de um caractere até outro (informando o inicio e limite)
        String s05 = original.substring(2, 9); // Mostra do caractere 2 ao 9
        System.out.println(s05);

        //Trocar um caractere por outro
        String s06 = original.replace('a', 'x');
        System.out.println(s06);

        //Trocar uma sequencia de caracteres (palavra por exemplo) por outra.
        String s07 = original.replace("abc", "xy");
        System.out.println(s07);

        //Mostrar qual a posição de uma string (numerando quando ela é encontrada)
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");
        System.out.println("index of 'bc': " + i);
        System.out.println("last index of 'bc': " + j);

        //Operação Split (tem a função para recortar String)
        String s = "potato apple lemon";

        String[] vect = s.split(" "); //Está pegando a variavel s e o argumento " " serve para separar sempre que tiver espaço
        System.out.println(vect[0]); //potato
        System.out.println(vect[1]); //apple
        System.out.println(vect[2]); //lemon
    }
}
