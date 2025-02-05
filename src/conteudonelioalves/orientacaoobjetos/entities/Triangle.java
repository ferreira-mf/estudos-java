package conteudonelioalves.orientacaoobjetos.entities;


//Criando uma classe para representar um triangulo

public class Triangle { //essa é a classe, o nome dela é Triangle

    //a classe possui os 3 atributos abaixo, a, b e c.
    public double a; //isso é um atributo
    public double b;
    public double c;

    public double area () {
        double p = (a + b + c) / 2.0;
        double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return result;
    }
}
