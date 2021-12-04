package Aula22_Composite.Sicrona;

import java.util.ArrayList;
import java.util.List;

public class ArquivoPastas implements Arquivo{

    private List<Arquivo> arquivos;
    private String nome;
    private double tamanho;

    public ArquivoPastas( String nome, double tamanho) {
        this.arquivos = new ArrayList<>();
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public void addArquivo(Arquivo arquivo){
        arquivos.add(arquivo);
    }

    @Override
    public void getNome() {
        System.out.println(this.nome);
        arquivos.forEach(Arquivo::getNome);
    }

    @Override
    public double tamanhoArquivo() {

        double tamanhoTotal = 0;
        for(Arquivo arquivo : arquivos){
            tamanhoTotal += arquivo.tamanhoArquivo();
        }
        return tamanhoTotal;
    }

    public void tamanhoTotal(){
        setTamanho(tamanhoArquivo());
        System.out.println("O tamanho da pasta é: " + this.tamanho + "Kbts");
    }

    public List<Arquivo> getArquivos() {
        return arquivos;
    }

    public void setArquivos(List<Arquivo> arquivos) {
        this.arquivos = arquivos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
}
