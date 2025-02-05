package conteudonelioalves.orientacaoobjetos;

public class GetAndSetters {

    //ENCAPSULAMENTO / Get e Setters : LINK DA AULA: https://www.udemy.com/course/java-curso-completo/learn/lecture/10566042#overview


    //PADRÃO PARA IMPLEMENTAÇÃO DE GETTERS E SETTERS

    //vamos supor que temos a classe "Produto" e a classe tem os atributos name e price:
    private String name; //como esses atributos tem a palavra private, eles não podem ser acessados por outras classes.
    private double price;

    //caso eu precise ACESSAR um atributo:
    public String getName() {   //Aqui eu estou acessando o atributo "name", onde eu preciso escrever um metodo get + Nome do atributo (getName) (obs: o nome do atributo precisa começar com letra maisucula, ex: getPrice etc...)
        return name;
    } //OBS: É preciso colocar o type no metodo igual ao do atributo, se o atributo for String, o metodo tambem precisa ser.

    //caso eu precise  ALTERAR um atributo:
    public void setName (String name) {  //como esse metodo não retorna nada, ele será void. Como ele sera alterado, ele precisa RECEBER um novo valor pro atributo, que é o parametro a ser inserido...
        this.name = name; //aqui ele mostra que this.name (atributo) irá receber o valor de parametro String name (novo valor que sera inserido)
    }
}


