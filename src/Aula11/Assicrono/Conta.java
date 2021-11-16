package Aula11.Assicrono;

public abstract class Conta {
    protected double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double quantidade){
        this.saldo += quantidade;
        System.out.println("Valor depositado com sucesso, seu novo saldo é: " + this.saldo);
    }

    public abstract void sacar(double quantidade);


    public void relatarSaldo(){
        System.out.println("Seu saldo atual é: " + this.saldo);
    }

}
