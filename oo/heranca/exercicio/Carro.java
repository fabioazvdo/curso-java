package oo.heranca.exercicio;

public abstract class Carro {

    final int VELOCIDADE_MAXIMA;
    public int velocidade;
    int delta = 5;

    protected Carro (int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void acelerar(){
        if (velocidade + delta > VELOCIDADE_MAXIMA){
           velocidade = VELOCIDADE_MAXIMA;
        }
        this.velocidade += delta;
    }
    public void frear() {
        if (velocidade >= delta) {
            this.velocidade -= delta;
        }else {
            velocidade = delta;
        }
    }
}
