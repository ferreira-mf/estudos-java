package conteudo.orientacaoobjetos.entities;

public class Product { //classe

    private String name; //atributo nome
    private double price; //atributo valor
    private int quantity; //atributo quantidade

    //Aqui está criando um construtor onde ja esta declarado os valores
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

        public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    //Metodo para retornar valor total em estoque
    public double totalValueInStock() { //metodo da classe Product (valor total em estoque)
        return price * quantity;
    }

    //Metodo para adicionar produtos em estoque
    public void addProducts(int quantity) { //outro metodo da classe Product
        this.quantity += quantity; //A palavra-chave this é usada para se referir ao atributo quantity da própria instância da classe, diferenciando-o do parâmetro quantity do método.

    }

    //Metodo para remover produtos em estoque
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    //Metodo para converter o objeto para string
    public String toString() {
        return name + ", $ "
                + String.format("%.2f", price)
                + ", " + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}