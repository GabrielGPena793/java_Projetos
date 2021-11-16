package aula06.solo;

import java.time.LocalDate;

public class Impressora {

    private String modelo;
    private String tipoConexao;
    private LocalDate dataFabricacao;
    private int folhasDisponiveis;

    public Impressora(String modelo, String tipoConexao, LocalDate dataFabricacao){
        this.modelo = modelo;
        this.tipoConexao = tipoConexao;
        this.dataFabricacao = dataFabricacao;
        this.folhasDisponiveis = 0;
    }

    public int getFolhasDisponiveis() {
        return folhasDisponiveis;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTipoConexao() {
        return tipoConexao;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTipoConexao(String tipoConexao) {
        this.tipoConexao = tipoConexao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public void setFolhasDisponiveis(int folhasDisponiveis) {
        this.folhasDisponiveis = folhasDisponiveis;
    }

    private boolean temPapel(){
        return this.folhasDisponiveis >= 1;
    }

    public void imprimir(String texto){
        if (temPapel()){
            System.out.println(texto);
            this.folhasDisponiveis--;
        }
        else
            System.out.println("Naõ tem papel");
    }

}
