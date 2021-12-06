package aula20_State.MesaAula20;

public class Produto {
    private String decricao;
    private double preco;

    public Produto(String decricao, double preco) {
        this.decricao = decricao;
        this.preco = preco;
    }

    public String getDecricao() {
        return decricao;
    }

    public void setDecricao(String decricao) {
        this.decricao = decricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
