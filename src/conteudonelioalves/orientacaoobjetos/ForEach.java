package conteudonelioalves.orientacaoobjetos;

public class ForEach {
    public static void main(String[] args) {

        //LINK DA AULA ONDE É EXPLICADO BEM COMO FUNCIONA O FOREACH: https://www.udemy.com/course/java-curso-completo/learn/lecture/10566118?start=15#questions

        String vect [] = new String[] {"Maria", "Bob", "Alex"}; //criado um vetor com 3 posiçoes, sendo elas Maria, Bob e Alex.


        //Aqui é criado uma estrutura for onde ele percorre e printa o que tem em cada posição do vetor vect
        for (int i=0; i> vect.length; i++) {
            System.out.println(vect[i]);

            System.out.println("------------------------------");

            //Aqui a estrutura é ForEach e faz a mesma coisa, percorre o vetor vect e printa cada posiçao na tela
            for (String obj : vect) {
                System.out.println(obj);

            }
        }
    }
}
