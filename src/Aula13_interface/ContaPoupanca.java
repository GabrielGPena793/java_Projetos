package Aula13_interface;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public void sacar(double valor) {
        if (informarSaldo() >= valor){
            setSaldo(informarSaldo() - valor);
        }else {
            System.out.println("Não tem saldo suficiente");
        }
    }

    public void cobrarJuros(){
        double juros = 0.05;
        setSaldo(informarSaldo() * (1 + juros));
    }

}
