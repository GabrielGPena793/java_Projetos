package Aula11.Assicrono;

import java.time.LocalDate;

public class Cheque {

    private double valor;
    private String bancoEmissor;
    private LocalDate dataPagamento;

    public Cheque(double valor, String bancoEmissor, LocalDate dataPagamento){
        this.valor = valor;
        this.bancoEmissor = bancoEmissor;
        this.dataPagamento = dataPagamento;
    };

    public double getValor(){
        return this.valor;
    }

    public String getBancoEmissor() {
        return bancoEmissor;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setBancoEmissor(String bancoEmissor) {
        this.bancoEmissor = bancoEmissor;
    }

    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }


}

