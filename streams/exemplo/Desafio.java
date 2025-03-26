package streams.exemplo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Desafio {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("José Roberto", 4898.89);
        Funcionario f2 = new Funcionario("Alexandre Meneses", 3967.97);
        Funcionario f3 = new Funcionario("Renan Barbosa", 1845.78);
        Funcionario f4 = new Funcionario("Marcone Pereira", 1745.89);
        Funcionario f5 = new Funcionario("Elton Cabral", 2290.56);

        List<Funcionario> funcionarios = Arrays.asList(f1, f2, f3, f4, f5);
        Predicate<Funcionario> impostoDeRenda = f -> f.salario >= 2500.0;
        Predicate<Funcionario> isentosIR = f -> f.salario < 2500.0;

        Function <Funcionario, String> pagarIr = f -> "O funcionário " + f.nome + " vai pagar imposto de renda.";
        Function <Funcionario, String> naoPagarIr = f -> f.nome + " não vai pagar o imposto de renda.";

        funcionarios.stream()
                .filter(impostoDeRenda)
                .map(pagarIr)
                .forEach(System.out::println);

        funcionarios.stream().filter(isentosIR).map(naoPagarIr).forEach(System.out::println);



    }
}
