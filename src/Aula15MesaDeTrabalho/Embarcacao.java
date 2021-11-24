package Aula15MesaDeTrabalho;

public abstract class Embarcacao {
    private double precoBase, valorAdicional, comprimento;
    private int anoFabricacao;

    public Embarcacao(double precoBase, double valorAdicional, double comprimento, int anoFabricacao) {
        this.precoBase = precoBase;
        this.valorAdicional = valorAdicional;
        this.comprimento = comprimento;
        this.anoFabricacao = anoFabricacao;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public double calcularValorAluguel() {
        if (this.anoFabricacao > 2020) {
            return this.precoBase + this.valorAdicional;
        }
        return this.precoBase;
    }
}
