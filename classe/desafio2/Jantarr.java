package classe.desafio2;

import java.util.Scanner;

public class Jantarr {
    public static void main(String[] args) {
        System.out.println("DESAFIO COMIDA.");
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o seu nome? e peso?");
        Pessoaa p1 = new Pessoaa(entrada.nextLine(), entrada.nextDouble());
        Comidaa c1 = new Comidaa("macaxeira", 0.300);
        Comidaa c2 = new Comidaa("carne", 0.200);

        double pesoFinal = p1.pesoPessoa + c1.pesoRefeicao + c2.pesoRefeicao;

        System.out.printf("Nome: %s \nPeso: %.2f\nJantar: %s com %s\n" +
                        "Peso após jantar: %.2f Kg.\n",
                p1.nome, p1.pesoPessoa, c1.refeicao, c2.refeicao, pesoFinal);
    }
}