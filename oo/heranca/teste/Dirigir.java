package oo.heranca.teste;

import oo.heranca.exercicio.Carro;
import oo.heranca.exercicio.Gol;
import oo.heranca.exercicio.Lamborghini;

public class Dirigir {
    public static void main(String[] args) {
        Carro carroL = new Lamborghini();
        Gol carroG = new Gol();

        carroG.acelerar();
        carroG.acelerar();
        carroG.acelerar();
        carroG.acelerar();
        carroL.acelerar();
        carroL.acelerar();
        carroL.acelerar();
        carroL.acelerar();
        System.out.println(carroG.velocidade);
        System.out.println(carroL.velocidade);

        carroG.frear();
        carroL.frear();
        carroL.frear();
        carroL.frear();
        carroL.frear();
        System.out.println(carroG.velocidade);
        System.out.println(carroL.velocidade);




    }
}
