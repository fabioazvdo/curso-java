package fundamentos.exercicios;

import java.util.Scanner;

public class DesaCalculadora {
    public static void main(String[] args) {
        double num1 = 1, num2 = 2;
        System.out.println("Desafio da calculadora!");
        System.out.println("Qual operador você vai usar? ");

        Scanner entrada = new Scanner(System.in);
        String digiteOperador = entrada.next();
        double resultado = "+".equals(digiteOperador) ? (num1 + num2) : 0;
        resultado = "*".equals(digiteOperador) ? (num1 * num2) : resultado;
        resultado = "/".equals(digiteOperador) ? (num1 / num2) : resultado;
        resultado = "%".equals(digiteOperador) ? (num1 % num2) : resultado;

        System.out.println(resultado);



        entrada.close();
    }
}
