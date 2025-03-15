package resumo.Desafio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        System.out.println("SISTEMA PARA ADICIONAR E REMOVER ITENS");
        ArrayList<Item> novoItem = new ArrayList<>();

        System.out.println("Digite (1) para add, (2) para remover, (0) para sair.");
        Scanner entrada = new Scanner(System.in);
        int escolha = entrada.nextInt();
        entrada.nextLine(); // Consumir a nova linha

        switch (escolha) {
            case 1: {
                System.out.println("Digite o nome, quantidade e preço do item.");
                String nome = entrada.nextLine();
                int quantidade = entrada.nextInt();
                double preco = entrada.nextDouble();
                entrada.nextLine(); // Consumir a nova linha

                Item item = new Item(nome, quantidade, preco);
                novoItem.add(item);

                String escolha2;
                do {
                    System.out.println("Quer add mais? (sim/não) ");
                    escolha2 = entrada.nextLine();
                    if (escolha2.equalsIgnoreCase("sim")) {
                        System.out.println("Digite o nome, quantidade e preço do item.");
                        nome = entrada.nextLine();
                        quantidade = entrada.nextInt();
                        preco = entrada.nextDouble();
                        entrada.nextLine(); // Consumir a nova linha

                        item = new Item(nome, quantidade, preco);
                        novoItem.add(item);
                    }
                } while (escolha2.equalsIgnoreCase("sim"));
                break;
            }
            case 2: {
                // Lógica para remover itens
                break;
            }
            case 3: {
                // Lógica adicional
                break;
            }
            default: {
                System.out.println("Opção inválida!");
                break;
            }
        }

        if (novoItem.size() > 1) {
            System.out.println(novoItem.get(1));
        } else {
            System.out.println("Não há itens suficientes na lista.");
        }

        entrada.close();
    }
}

        /*Cliente c1 = new Cliente(i1.novoItem, i1.novaQuantidade, i1.novoPreco);
        Cliente c2 = new Cliente(i2.novoItem, i2.novaQuantidade, i2.novoPreco);

        System.out.printf("O cliente comprou %s, a quantidade foi %d e o preço é %.2f. \n", c1.nome, c1.quantidade, c1.preco);
        System.out.printf("O cliente comprou %s, a quantidade foi %d e o preço é %.2f. \n", c2.nome, c2.quantidade, c2.preco);
        */
