package arrays;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        System.out.println("CALCULAR MÉDIA DO ALUNO");
        Scanner entrada = new Scanner(System.in);

        double[] notas = new double[3];
        System.out.println("Digite a primeira nota: ");
        notas[0] = entrada.nextDouble();
        System.out.println("Digite a segunda nota: ");
        notas[1] = entrada.nextDouble();
        System.out.println("Digite a terceira nota: ");
        notas[2] = entrada.nextDouble();

        double mediaAluno = 0;

        for (int i = 0; i < notas.length; i++) {
            mediaAluno+= notas[i];

        }
        System.out.println(mediaAluno / notas.length);


        entrada.close();
    }
}
