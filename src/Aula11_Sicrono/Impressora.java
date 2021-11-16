package Aula11_Sicrono;

import java.time.LocalDate;

public abstract class Impressora {
    private String modelo;
    private String tipoConexao;
    private LocalDate dataFabricacao;
    private int folhasDisponiveis;
    private double porcTinta;

    public Impressora(String modelo, String tipoConexao, LocalDate dataFabricacao, int folhasDisponiveis, double porcTinta) {
        this.modelo = modelo;
        this.tipoConexao = tipoConexao;
        this.dataFabricacao = dataFabricacao;
        this.folhasDisponiveis = folhasDisponiveis;
        this.porcTinta = porcTinta;
    }

    public boolean temPapel(){
        if (this.folhasDisponiveis != 0){
            return true;
        }else {
            return false;
        }
    };

    public boolean precisaTinta(){
        if (this.porcTinta == 0){
            return true;
        }else {
            return false;
        }
    };

    public abstract String imprimir();

    public int getFolhasDisponiveis() {
        return folhasDisponiveis;
    }

    public void setFolhasDisponiveis(int folhasDisponiveis) {
        this.folhasDisponiveis = folhasDisponiveis;
    }

    public double getPorcTinta() {
        return porcTinta;
    }

    public void setPorcTinta(double porcTinta) {
        this.porcTinta = porcTinta;
    }
}
