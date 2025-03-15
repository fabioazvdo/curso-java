package resumo;

import java.util.Scanner;

public class Exercicio3e4 {
    public static void main(String[] args) {
        /*Exercício 3: Operadores Aritméticos e Lógicos
        Crie um programa que realiza operações aritméticas (adição, subtração, multiplicação, divisão) com variáveis.
        Utilize operadores lógicos (&&, ||, !) para criar expressões booleanas.*/

        int num1, num2;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número.");
        num1 = entrada.nextInt();
        System.out.println("Digite outro número.");
        num2 = entrada.nextInt();

        System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1*num2);
        System.out.println(num1/num2);

        boolean ambosPositivos = num1 > 0 && num2 > 0;
        boolean ambosNegativos = num1 < 0 && num2 < 0;
        boolean umPositivo = num1 > 0 && num2 < 0 || num1 < 0 && num2 > 0;
        boolean umNegativo = num1 < 0 && num2 > 0 || num1 > 0 && num2 < 0;
        boolean umDiferenteDoOutro = num1 != num2;

        System.out.println(ambosPositivos);
        System.out.println(ambosNegativos);
        System.out.println(umPositivo);
        System.out.println(umNegativo);
        System.out.println(umDiferenteDoOutro);

        int parOuImpar1 = num1 % 2;
        int parOuImpar2 = num2 % 2;

        if (parOuImpar1 != 0 && parOuImpar2 != 0){
            System.out.printf("O %s é impar e %s também é impar. \n", num1, num2);

        } else if (parOuImpar1 == 0 && parOuImpar2 != 0 ) {
            System.out.printf("O %s é par e %s é impar. \n", num1, num2);

        } else if (parOuImpar1 != 0) {
            System.out.printf("O %s é impar e %s é par. \n", num1, num2);
        } else {
            System.out.printf("O %s é par e %s é par. \n", num1, num2);
        }
        entrada.close();
    }
}
