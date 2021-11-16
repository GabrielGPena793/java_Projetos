package MesaAula10;

import java.lang.reflect.AnnotatedType;

public class Nave extends Objeto {
    private double velocidade;
    private int vida;

    public Nave(int posx, int posy, char direcao, double velocidade) {
        super(posx, posy, direcao);
        this.velocidade = velocidade;
        this.vida = 5;
    }

    @Override
    public void irA(int x, int y, char direcao){
        super.irA(x, y , direcao);
        System.out.println("nova direção da nave: " + (x + y) + " - "  + direcao);

    }

    public void girar(char direcao){
        System.out.println(direcao);
    }

    public double getVelocidade() {
        return velocidade;
    }

    public int getVida() {
        return vida;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int restaVida(int valor){
        return this.vida - valor;

    }
}
