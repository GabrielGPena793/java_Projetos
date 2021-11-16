package mesaAula06;

import aula04.Caminhao;

import java.time.LocalDate;
import java.util.Calendar;

public class InstituicaoDeCachorro {


    private boolean aptoAdocao;
    private String raca;
    private int anoNascimento;
    private double peso;
    private boolean possuiChip;
    private boolean saudavel;
    private String nome;

    public InstituicaoDeCachorro( String raca, int anoNascimento, double peso, boolean possuiChip, boolean saudavel, String nome){
        this.raca = raca;
        this.anoNascimento = anoNascimento;
        this.peso = peso;
        this.possuiChip = possuiChip;
        this.saudavel = saudavel;
        this.nome = nome;
    }

    public InstituicaoDeCachorro( String raca, int anoNascimento, double peso, boolean possuiChip, boolean saudavel){
        this.raca = raca;
        this.anoNascimento = anoNascimento;
        this.peso = peso;
        this.possuiChip = possuiChip;
        this.saudavel = saudavel;
    }

    public boolean isAptoAdocao() {
        return aptoAdocao;
    }

    public void setAptoAdocao(boolean aptoAdocao) {
        this.aptoAdocao = aptoAdocao;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isPossuiChip() {
        return possuiChip;
    }

    public void setPossuiChip(boolean possuiChip) {
        this.possuiChip = possuiChip;
    }

    public boolean isSaudavel() {
        return saudavel;
    }

    public void setSaudavel(boolean saudavel) {
        this.saudavel = saudavel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void idadeCachorroChip(){
        int year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println( "O cachorro tem " + (year - anoNascimento) + " anos");
        if (this.possuiChip) System.out.println("O Cachorro possui chip de localização");
        else System.out.println("Cachorro ainda não possui chip de localização");
    }

    public boolean podeSerAdotado() {
        return this.saudavel && this.peso > 5;
    }
}
