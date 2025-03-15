package oo.composicao.desafio;

public class Sistema {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Fernando Silva");
        Compra compra1 = new Compra();

        Produto produto1 = new Produto("Celular", 878.99);
        Produto produto2 = new Produto("Notebook", 1987.90);

        compra1.adicionarItem(new Item(produto1, 3));
        compra1.adicionarItem(new Item(produto2, 1));
        c1.adicionarCompras(compra1);

        System.out.println(compra1.obterValorTotal());


    }

}
