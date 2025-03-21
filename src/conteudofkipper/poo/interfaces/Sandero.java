package conteudofkipper.poo.interfaces;

public class Sandero implements Carro{
    @Override //O  em Java é uma anotação usada para indicar que um método está sendo sobrescrito (ou seja, redefinido) de uma classe pai ou de uma interface.
    public void acelerar() {
        System.out.println("Acelerando a 50km"); //aqui sim implementamos o que esta definido no contrato
    }

    @Override
    public void freiar() {

    }

    @Override
    public void parar() {


 //OBS: Caso criarmos outra Classe que respeite o tipo "Carro", como por exemplo uma classe chamada "Corsa", irá implementar a interface Carro.

    }
}
