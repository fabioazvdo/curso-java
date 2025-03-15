package resumo;

public class Exercicio5 {
    public static void main(String[] args) {
       /* Exercício 5: Estruturas de Controle - Loops
        Crie um programa que imprime os números de 1 a 10 usando um loop for.
        Crie um programa que calcula a soma dos números de 1 a 100 usando um loop while. */

         for (int numero = 1; numero <= 10; numero++ ){
             System.out.println(numero);
         }
         for (int numero = 10; numero >= 1; numero--){
             System.out.println(numero);
         }
         for (int numero = 2; numero <= 4096; numero *= 2){
             System.out.println(numero);
         }
        System.out.println();
         int soma = 0;
         int numero = 1;
         while (numero <= 100){
             soma += numero;
             numero++;
        }
        System.out.println("A soma dos números de 1 até 100 é: " + soma);
    }
}
