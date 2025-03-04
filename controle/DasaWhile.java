package controle;

import java.util.Scanner;

public class DasaWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota;
        int contador = 0;
        double soma = 0;
        System.out.println("Digite uma nota ou (-1) para sair. ");
        do {
            nota = entrada.nextDouble();
            if (nota >= 0 && nota <= 10) {
                System.out.printf("A nota é: %.2f e a quantidade de notas vai em %d%n", nota, contador + 1);
                soma += nota;
                contador++;
                System.out.println("\nDigite outra nota ou (-1) para sair. ");
            } else if (nota != -1) {
                System.out.println("Digite uma nota válida!");
            }
        }
        while (nota != -1);
        if (contador == 1) {
            double media = soma / contador;
            System.out.printf("A média da turma é %.2f e a quantidade de notas foi %d\n", media, contador);
        } else if (contador > 1){
            double media = soma / contador;
            System.out.printf("A média da turma é %.2f e a quantidade de notas foram %d\n", media, contador);
        }
        System.out.println("Até mais!\n");
        entrada.close();
    }
}
