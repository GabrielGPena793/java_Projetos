package aula16_exeption.aulaSicrona;

public class Cliente {
    private String nome;
    private String sobrenome;
    private String rg;
    private double saldoEmConta;
    private double limite;
    private double divida;

    public Cliente(String nome, String sobrenome, String rg, double limite, double divida) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.limite= limite;
        this.divida = 0;
        saldoEmConta=0;

    }
    public void comprar(double valor) throws ClienteExeption {
        if (this.saldoEmConta < valor)
            throw new ClienteExeption("Saldo insuficiente");
        saldoEmConta-=valor;
    }

    public void pagarDivida(double valor) throws ClienteExeption {
        if (this.divida < 0)
            throw new ClienteExeption("Você não tem dividas!");
        this.divida-=valor;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                nome + ' ' +
                sobrenome + ' ' +
                ", seu saldo é=" + saldoEmConta + "R$ }";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public double getSaldoEmConta() {
        return saldoEmConta;
    }

    public void setSaldoEmConta(double saldoEmConta) {
        this.saldoEmConta = saldoEmConta;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getDivida() {
        return divida;
    }

    public void setDivida(double divida) {
        this.divida = divida;
    }
}
