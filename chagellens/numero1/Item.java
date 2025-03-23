package chagellens.numero1;

import java.util.ArrayList;
/*Exerc&iacute;cio 1: Filtragem de Produtos
1. Crie uma classe chamada Produtocom dois atributos: nomee preco.
2. Crie um construtor para essa classe que recebe nomee precocomo par&acirc;metros.
3. crie uma lista de produtos com alguns itens .No metodo main, crie uma lista de produtos com alguns itens.
4. Utilize uma API de Streams e uma express&atilde;o lambda para filtrar os produtos com pre&ccedil;o maior que 100.
5. Imprima os produtos filtrados.
*/
public class Item {
    public static void main(String[] args) {
        ArrayList <Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Notebook", 2199.99));
        produtos.add(new Produto("Caneta", 2.89));
        produtos.add(new Produto("Caderno", 16.78));
        produtos.add(new Produto("iPhone", 13256.86));

        produtos.stream().filter(produto ->
                produto.getPreco() > 100).forEach(System.out::println); //forEach(produto -> System.out.println(produto));

    }

}
