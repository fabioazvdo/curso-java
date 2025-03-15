package oo.composicao.Exercicio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    List <Item> itens = new ArrayList<>();

        void adicionarItens (Item item){
            itens.add(item);
        }

        double calcularTotal(){
            double total = 0;
            for (Item item : itens){
                total += item.quantidade * item.produto.preco;
            }
            return total;
        }


}
