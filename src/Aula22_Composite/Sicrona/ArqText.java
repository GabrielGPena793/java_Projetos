package Aula22_Composite.Sicrona;

public class ArqText implements Arquivo {
    private String nome;
    private double tamanho;

    public ArqText(String nome, double tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    @Override
    public void getNome() {
        System.out.println(this.nome);
    }

    @Override
    public double tamanhoArquivo() {
        return  this.tamanho;

    }


}
