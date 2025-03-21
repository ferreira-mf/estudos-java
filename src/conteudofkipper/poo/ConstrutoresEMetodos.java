package conteudofkipper.poo;

public class ConstrutoresEMetodos {
    public static void main(String[] args) { //esse é o metodo de entrada do programa, sera a primeira coisa a ser iniciada

        Carro meuCarro1 = new Carro("Fusca"); //Aqui estou iniciando um objeto da classe Carro
        Carro meuCarro2 = new Carro("Sandero"); // Criação de objetos da classe Carro
        Carro meuCarro3 = new Carro("BMW"); // Criação de objetos da classe Carro



        meuCarro1.acelerar(); //aqui estamos acessando o metodo ACELERAR que foi criado dentro da classe Carro (abaixo)
        meuCarro2.acelerar(); //como no metodo acelerar é realizado um println referenciando o modelo do carro, cada carro sera mostrado o modelo referenciado

        meuCarro3.acelerar(); //IMPORTANTE: AQUI É UTILIZADO O METODO ACELERAR, MAS O RESULTADO DESSE METODO NAO PODE SER UTILIZADO POR NAO ESTAR GUARDADO NUMA VARIAVEL

        //IMPORTANTE: JÁ AQUI EMBAIXO, O RESULTADO DO METODO ACELERAR É GUARDADO DENTRO DE UMA VARIAVEL, SENDO ASSIM POSSIVEL UTILIZA-LO EM OUTRAS OPERAÇOES,COMO IMPRIMIR NO CONSOLE, PASSAR PARA OUTROS METODOS,  ETC.
        String result = meuCarro1.acelerar(); //aqui foi criado a variavel result para pegar o return do metodo acelerar
        System.out.println(result); // e printar o return

    }

    //CRIAÇÂO DE CLASSE

    static class Carro { //Criação da Classe Carro
        String modelo;  // Atributos da classe
        public Carro(String modelo) { //String modelo é o parametro solicitado ao iniciar a classe carro
            this.modelo = modelo;
        }
        //METODOS: é a implementação de alguma lógica ou tarefa que a classe faz
        public String acelerar() { // aqui estamos declarando o METODO acelerar (iniciamos com o modificador de acesso (public) e o tipo de valor que ele irá retornar (String, Int, void, etc)
            System.out.println("Acelerando o carro " + this.modelo);
            return "oi";

        }
    }
}
