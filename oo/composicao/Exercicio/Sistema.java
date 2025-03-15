package oo.composicao.Exercicio;

public class Sistema {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Maria Julia");
        Compra compra1 = new Compra();

        Produto produto1 = new Produto("Caneta", 1.99);
        Produto produto2 = new Produto("Caderno", 16.87);
        compra1.adicionarItens(new Item(6, produto1));
        compra1.adicionarItens(new Item(2, produto2));
        cliente1.adicionarCompra(compra1);

        System.out.println(cliente1.calcularTotalDeCompras());




    }
}
