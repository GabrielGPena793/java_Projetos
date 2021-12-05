package Aula19_Padrões.Mesa_Solo;

public class Caixa  extends Produto{
    private double comprimento, largura, altura;

    public Caixa(double comprimento, double largura, double altura) {
        this.comprimento = comprimento;
        this.largura = largura;
        this.altura = altura;
    }

    public Caixa() {
    }

    @Override
    public double calculaEspaco() {
        return getComprimento() * getLargura() * getAltura();
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
