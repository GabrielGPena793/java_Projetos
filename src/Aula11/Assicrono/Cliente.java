package Aula11.Assicrono;

public class Cliente {

    private int numeroCliente;
    private String nome;
    private int rg;
    private int cpf;

    public Cliente(int numeroCliente, String nome, int rg, int cpf) {
        this.numeroCliente = numeroCliente;
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

}
