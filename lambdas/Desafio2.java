package lambdas;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Desafio2 {
    public static void main(String[] args) {

        Produto p = new Produto("iPad", 3235.89, 0.13);

        //Aplicando desconto
        BinaryOperator<Double> calcP1 = (x, y) -> x * (1 - y);
        double precoDesconto = calcP1.apply(p.preco, p.desconto);
        System.out.printf("O preço do %s com desconto é: R$ %.2f.\n",p.nome, precoDesconto);

        //Aplicando imposto municipal e imformando.
        Function <Double, Double> valorImposto = setPreco ->
                setPreco >= 2500.0 ? (setPreco * (1 + 0.085)) : setPreco ;

        Function <Double, String> imformativoImposto = setPreco ->
                setPreco >= 2500.0 ? "tem imposto" : "está isento";
        double precoComImposto = valorImposto.apply(precoDesconto);
        System.out.printf("O produto %s e o preço é: R$ %.2f\n",
                imformativoImposto.apply(precoDesconto), precoComImposto);

        //Aplicando frete.
        Function <Double, Double> valorFrete = setPreco ->
                setPreco >= 3000.0 ? setPreco + 100 : setPreco + 50;
        System.out.printf("O valor com frete do %s é: R$ %.2f\n", p.nome, valorFrete.apply(precoComImposto));







    }

}
