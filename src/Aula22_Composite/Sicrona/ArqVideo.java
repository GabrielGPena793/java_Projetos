package Aula22_Composite.Sicrona;

public class ArqVideo implements Arquivo {
    private String nome;
    private double tamanho;

    public ArqVideo(String nome, double tamanho) {
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
