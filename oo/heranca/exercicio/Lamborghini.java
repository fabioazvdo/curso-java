package oo.heranca.exercicio;

public class Lamborghini extends Carro {

    public Lamborghini(){
        super(15);
        delta = 15;
    }

    @Override
    public void frear() {
        super.frear();
        delta = 15;
    }
}
