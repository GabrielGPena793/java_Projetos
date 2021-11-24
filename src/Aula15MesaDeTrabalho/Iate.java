package Aula15MesaDeTrabalho;

public class Iate extends Embarcacao implements Comparable<Iate>{
    private int quantidadeCabines;

    public Iate(double precoBase, double valorAdicional, double comprimento, int anoFabricacao, int quantidadeCabines) {
        super(precoBase, valorAdicional, comprimento, anoFabricacao);
        this.quantidadeCabines = quantidadeCabines;
    }

    public int getQuantidadeCabines() {
        return quantidadeCabines;
    }

    public void setQuantidadeCabines(int quantidadeCabines) {
        this.quantidadeCabines = quantidadeCabines;
    }

    @Override
    public int compareTo(Iate o) {
        if (this.quantidadeCabines == o.quantidadeCabines) return 0;
        else if (this.quantidadeCabines > o.quantidadeCabines) return 1;
        else return -1;
    }
}
