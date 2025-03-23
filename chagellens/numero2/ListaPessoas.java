package chagellens.numero2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class ListaPessoas {
    public static void main(String[] args) {

        ArrayList <Pessoa> lista = new ArrayList<>();
        lista.add(new Pessoa("Maria Clara", 8));
        lista.add(new Pessoa("Artur", 8));
        lista.add(new Pessoa("Andreza", 25));
        lista.add(new Pessoa("Fábio", 30));

        //ordenando lista por idade.
        lista.sort(Comparator.comparingInt(o -> o.idade));
        lista.forEach(System.out::println);

        //ordenando por alfabeto.
        Collections.sort(lista, new Comparator<Pessoa>() { //lista.sort(Comparator.comparing(o -> o.nome));
            @Override
            public int compare(Pessoa o1, Pessoa o2) {
                return o1.nome.compareTo(o2.nome);
            }
        });
        lista.forEach(System.out::println);

    }
}
