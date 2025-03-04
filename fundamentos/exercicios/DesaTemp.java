package fundamentos.exercicios;

import java.util.Scanner;

public class DesaTemp {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("CONVERSOR DE TEMPERATURA\n");
        System.out.println("Digite a temperatura em Fahrenheite");
        double temperaturaF = entrada.nextDouble();
        double formulaF = (temperaturaF - 32) * 5 / 9;
        System.out.printf("A conversão de Fahrenheite para Celsius é: %.2f °C\n", formulaF);

        System.out.println("Digite a temperatura em Celsius");
        double temperaturaC = entrada.nextDouble();
        double formulaC = (temperaturaC * 9 / 5) + 32;
        System.out.printf("A conversão de Celsius para Fahrenheite é: %.2f °C\n", formulaC);

        entrada.close();
    }
}
