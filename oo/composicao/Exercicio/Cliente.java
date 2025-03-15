package oo.composicao.Exercicio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    String nome;
    List <Compra> compras = new ArrayList<>();

    Cliente (String nome){
        this.nome = nome;
    }

    void adicionarCompra (Compra compra){
        compras.add(compra);
    }

    double calcularTotalDeCompras(){
        double total = 0;
        for (Compra compra : compras){
            total += compra.calcularTotal();
        }
        return total;
    }
}
