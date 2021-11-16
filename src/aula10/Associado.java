package aula10;

public class Associado {
    private String numAssociado, nome, atividade;
    private double valorMensal;

    public Associado(String numero, String nome, String atividade, double valorMensal){
        this.numAssociado = numero;
        this.nome = nome;
        this.atividade = atividade;
        this.valorMensal = valorMensal;
    };

    public double custoMensal(){
        return this.valorMensal;
    }

    @Override
    public String toString() {
        return "Associado{" +
                "numAssociado='" + numAssociado + '\'' +
                ", nome='" + nome + '\'' +
                ", atividade='" + atividade + '\'' +
                ", valorMensal=" + valorMensal +
                '}';
    }
}
