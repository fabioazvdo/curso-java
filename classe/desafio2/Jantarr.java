package classe.desafio2;

import java.util.Scanner;

public class Jantarr {
    public static void main(String[] args) {
        System.out.println("DESAFIO COMIDA.");
        Scanner entrada = new Scanner(System.in);

        Pessoaa p1 = new Pessoaa();
        System.out.println("Qual o seu nome?");
        p1.nome = entrada.nextLine();
        System.out.println("Qual seu peso?");
        p1.pesoPessoa = entrada.nextDouble();
        entrada.nextLine();

        Comidaa c1 = new Comidaa();
        Comidaa c2 = null;

        while (c2 == null) {
            System.out.println("Qual Janta você vai querer? (Macaxeira/Cuscuz)");
            c1.refeicao = entrada.nextLine();
            switch (c1.refeicao) {
                case "Macaxeira":
                    c2 = new Comidaa(0.300);
                    System.out.println("Boa escolha!");
                    break;
                case "Cuscuz":
                    c2 = new Comidaa(0.200);
                    System.out.println("Boa escolha!");
                    break;
                default:
                    System.out.println("Você não digitou uma refeição válida. Tente novamente.");
            }
        }

        double pesoFinal = p1.pesoPessoa + c2.pesoRefeicao;

        System.out.printf("Nome: %s \nPeso: %.2f\nJantar: %s\n" +
                        "Peso após jantar: %.2f Kg.\n",
                p1.nome, p1.pesoPessoa, c1.refeicao, pesoFinal);
    }
}