package conteudofkipper.poo.interfaces;

public class Main {
    public static void main(String[] args) {

        Carro meuCarro = new Sandero();
        Carro meuCarro2 = new Mobi();

        meuCarro2.acelerar();
        meuCarro.acelerar();


    }
}
