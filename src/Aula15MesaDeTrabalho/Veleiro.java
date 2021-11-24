package Aula15MesaDeTrabalho;

public class Veleiro extends Embarcacao {
    private int quantidadeMastros;

    public Veleiro(double precoBase, double valorAdicional, double comprimento, int anoFabricacao, int quantidadeMastros) {
        super(precoBase, valorAdicional, comprimento, anoFabricacao);
        this.quantidadeMastros = quantidadeMastros;
    }

    public int getQuantidadeMastros() {
        return quantidadeMastros;
    }

    public void setQuantidadeMastros(int quantidadeMastros) {
        this.quantidadeMastros = quantidadeMastros;
    }

    public boolean isGrande(){
        return quantidadeMastros > 4;
    }
}
