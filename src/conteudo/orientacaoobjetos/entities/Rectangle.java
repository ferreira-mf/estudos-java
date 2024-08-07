package conteudo.orientacaoobjetos.entities;

public class Rectangle {

    public double width, height;

    public double area () {
        return this.width * this.height;
    }

    public double perimeter() {
        return 2 * (this.width + this.height);
    }

    public double diagonal() {
        double valorDiagonal = ((this.width * this.width) + (this.height * this.height));
        return Math.sqrt(valorDiagonal);
    }
}
