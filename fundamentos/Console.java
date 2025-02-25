package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.print("Bom");
        System.out.print(" Dia\n\n");

        System.out.println("Bom");
        System.out.println("dia!");

        System.out.printf("Mega Sena: %d, %d, %d, %d, %d, %d %n",1, 2, 3, 4, 5, 6);

        System.out.printf("Salário: %2f%n", 1234.4567);
        System.out.printf("Nome: %s%n", "João");

        Scanner entrada = new Scanner(System.in); //Fazer entrada no console.

        System.out.println("Digite o seu Nome: ");
        String nome = entrada.nextLine();
        System.out.println("Bem vindo " + nome);

        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();
        System.out.println("Sua idade é: " + idade);
        entrada.close();
        



    }
}
