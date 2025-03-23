package chagellens.numero1;

public class Produto {

    public final String nome;
    private double preco;

    Produto (String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String toString(){
        return "R$ " + preco;
    }
}
