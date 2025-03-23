package chagellens.numero2;

public class Pessoa {

    final String nome;
    int idade;

    Pessoa (String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString(){
        return nome + " - " + idade;
    }
}
