package Aula14_assicrona;

public class Conta implements Comparable<Conta> {

    private int numConta;
    private double saldo;

    public Conta(int numConta, double saldo) {
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public int compareTo(Conta outraConta) {
        int resposta = 0;
        if (this.getNumConta() > outraConta.getNumConta()){
            resposta = 1;
        }
        if (this.getNumConta() < outraConta.getNumConta()){
            resposta = -1;
        }
        return resposta;
    }
}
