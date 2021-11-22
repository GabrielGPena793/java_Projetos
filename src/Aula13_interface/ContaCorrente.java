package Aula13_interface;

public class ContaCorrente extends Conta implements GravarImposto {
    public ContaCorrente(double saldo) {
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

    @Override
    public double imposto(double porc) {
        return 0;
    }
}
