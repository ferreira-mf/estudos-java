package conteudofkipper.poo.interfaces;

public class Mobi implements Carro{

    @Override
    public void acelerar() {
        System.out.println("Acelerar a 30km"); //apesar de implementar o mesmo metodo da interface Carro, a função é diferente da classe Sandero
    }

    @Override
    public void freiar() {

    }

    @Override
    public void parar() {

    }
}
