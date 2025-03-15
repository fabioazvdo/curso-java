package oo.composicao.desafio;

import java.util.ArrayList;

public class Cliente {
    String nome;
    ArrayList <Compra> compras = new ArrayList<>();

    Cliente (String nome){
        this.nome = nome;
    }

    void adicionarCompras (Compra compra){
        this.compras.add(compra);
    }

}
