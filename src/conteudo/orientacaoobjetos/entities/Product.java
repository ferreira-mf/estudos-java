package conteudo.orientacaoobjetos.entities;

public class Product { //classe

    public String name; //atributo nome
    public double price; //atributo valor
    public int quantity; //atributo quantidade

    //Aqui está criando um construtor onde ja esta declarado os valores
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalValueInStock() { //metodo da classe Product (valor total em estoque)
        return price * quantity;
    }

    public void addProducts(int quantity) { //outro metodo da classe Product
        this.quantity += quantity; //A palavra-chave this é usada para se referir ao atributo quantity da própria instância da classe, diferenciando-o do parâmetro quantity do método.

    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ " + String.format("%.2f", totalValueInStock());
    }
}