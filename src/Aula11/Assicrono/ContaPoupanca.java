package Aula11.Assicrono;

public class  ContaPoupanca extends Conta {

    private double taxaJuros;

    public ContaPoupanca(double saldo, double taxaJuros) {
        super(saldo);
        this.taxaJuros = taxaJuros;
    }

    @Override
    public void sacar(double quantidade) {
        if (this.saldo >= quantidade){
            System.out.println("Saque realizado com sucesso!");
            this.saldo -= quantidade;
        }else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void cobrarJuros(){
        System.out.println(this.saldo + this.taxaJuros);
    }


}
