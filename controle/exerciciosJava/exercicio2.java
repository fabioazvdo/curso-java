package controle.exerciciosJava;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class exercicio2 {
    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = dataAtual.format(formatter);
        System.out.println("Olá, a data atual é: " + dataFormatada);
        int anoAtual = LocalDate.now().getYear();
        if ((anoAtual % 400 == 0) || (anoAtual % 4 == 0) && (anoAtual % 100 != 0)){
            System.out.println("Ano Bissexto!");
        } else {
            System.out.println("Ano não é bissexto");
        }

    }
}
