package fundamentos.exercicios;

public class DesafioAritimeticos {
    public static void main(String[] args) {
        int a = 2 + 3 * 4;
        int b  = (int) Math.pow(a, 3);
        double c  = Math.pow(a, 3);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println("Desafio Aritimeticos");

        int exp1 = (int) Math.pow((6 * (3 + 2)), 2) / (3*2);
        int exp2 = (1 - 5) * (2 - 7) / 2;
        int exp3 = (int) Math.pow(exp2, 2);
        int resul1 = (int) Math.pow((double)(exp1 - exp3) / 10, 3);

        System.out.println("O resultado é: " + resul1);




    }
}
