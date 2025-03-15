package resumo;

public class Exercicio6 {
    public static void main(String[] args) {
        /* Exercício 6: Arrays
            Crie um array de inteiros e preencha-o com valores.
            Imprima os elementos do array no console.
            Calcule a soma dos elementos do array.*/

        int[] arrayNumeros = new int [6];
        arrayNumeros[0] = 3;
        arrayNumeros[1] = 6;
        arrayNumeros[2] = 12;
        arrayNumeros[3] = 17;
        arrayNumeros[4] = 18;
        arrayNumeros[5] = 23;

        System.out.println(arrayNumeros[0]+"\n"+arrayNumeros[1]+"\n"+arrayNumeros[2]+"\n"+arrayNumeros[3]
                +"\n"+arrayNumeros[4]+"\n"+arrayNumeros[5]);

        int somaNumeros = 0;
        for (int i = 0; i < arrayNumeros.length; i++){
            somaNumeros += arrayNumeros[i];

        }
        System.out.println("A soma dos números é: " + somaNumeros);

        double multiplicacaoNumero = 1;
        for (int arrayNumero : arrayNumeros) {
            multiplicacaoNumero *= arrayNumero;

        }
        System.out.println("A multiplicação dos números do array é: " + multiplicacaoNumero);






    }
}
