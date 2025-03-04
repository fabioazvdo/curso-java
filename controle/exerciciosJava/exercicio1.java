package controle.exerciciosJava;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 10? ");
        int numero = entrada.nextInt();

        switch (numero){
            case 0:{
                System.out.printf("O número é %d e ele é neutro.", numero);
                break;
            }
            case 1: case 3: case 5: case 7: case 9:{
                System.out.printf("O número é %d e ele é ímpar.", numero);
                break;
            }
            case 2: case 4: case 6: case 8: case 10: {
                System.out.printf("O número é %d e ele é par.", numero);
                break;
            }
            default: {
                System.out.println("Número inválido!");
                break;
            }
        }
        System.out.println("\nFim de código!");
        entrada.close();

    }
}
