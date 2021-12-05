package Aula19_Padrões.Mesa_Solo;

public class Bola extends Produto {
    private double raio;

    public Bola(double raio) {
        this.raio = raio;
    }

    public Bola() {
    }

    @Override
    public double calculaEspaco() {
        // PI * raio²
        return Math.PI * Math.pow(getRaio(), 2);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

}
