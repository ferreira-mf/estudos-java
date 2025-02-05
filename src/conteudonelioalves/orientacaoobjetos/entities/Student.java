package conteudonelioalves.orientacaoobjetos.entities;

public class Student {

    public String name;
    public double n1, n2, n3;


    public double notaFinal() {
        return this.n1 + this.n2 + this.n3;
    }

    public double aprovacao() {
        if (notaFinal() < 60.00) {
            return 60.0 - notaFinal();
        }
            else {
                return 0.0;
        }

    }
}