package Aula19_Padrões.Mesa_Solo;

public abstract class Produto {

    private double peso;

    public Produto(double peso) {
        this.peso = peso;
    }

    public Produto() {
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public abstract double calculaEspaco();
}
