package fundamentos;

import java.util.Scanner;

public class SalarioMedia {
    public static void main(String[] args) {
        System.out.println("Olá, vamos caulcular sua média");

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu primeiro salário: ");
        double salario1 = Double.parseDouble(entrada.next().replace(",","."));

        System.out.println("Digite seu segundo salário: ");
        double salario2 = Double.parseDouble(entrada.next().replace(",","."));

        System.out.println("Digite seu terceiro salário: ");
        double salario3 = Double.parseDouble(entrada.next().replace(",","."));

        double media = (salario1 + salario2 + salario3)/3;
        System.out.println("A média é: "+ media);


        entrada.close();
    }
}
