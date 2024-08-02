package conteudo.orientacaoobjetos.entities;

public class Product { //classe

    public String name; //atributo nome
    public double price; //atributo valor
    public int quantity; //atributo quantidade

    public double totalValueInStock() { //metodo da classe Product (valor total em estoque)
        return price * quantity;
    }

    public void addProducts(int quantity) { //outro metodo da classe Product
        this.quantity = quantity + this.quantity; //A palavra-chave this é usada para se referir ao atributo quantity da própria instância da classe, diferenciando-o do parâmetro quantity do método.

    }

    public void removeProducts(int quantity) {
        this.quantity = quantity - this.quantity;
    }
}
