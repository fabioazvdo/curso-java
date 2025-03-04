package fundamentos.exercicios;

import java.util.Scanner;

public class DesafioLogico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Você vai trabalhar na terça? (sim/não) ");
        boolean trabalhoTerca = entrada.nextLine().equalsIgnoreCase("sim");

        System.out.println("Você vai trabalhar na quinta? (sim/não) ");
        boolean trabalhoQuinta = entrada.nextLine().equalsIgnoreCase("sim");

        if (trabalhoTerca && trabalhoQuinta) {
            System.out.println("Você comprou a tv de 50 polegadas e a família vai tomar sorvete!");
        } else if (trabalhoTerca ^ trabalhoQuinta) {
            System.out.println("Você comprou uma tv de 32 polegadas e a família vai tomar sorvete!");
        } else {
            System.out.println("Você não comprou a tv e nem vai tomar sorvete!");
        }
        entrada.close();
    }
}