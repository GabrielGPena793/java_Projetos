package Aula11.Assicrono;

import java.util.Scanner;

public class ContaCorrente extends Conta {

    private double valorSaqueAlt;
    Scanner scanner = new Scanner(System.in);

    public ContaCorrente(double saldo, double valorSaqueAlt) {
        super(saldo);
        this.valorSaqueAlt = valorSaqueAlt;
    }

    @Override
    public void sacar(double quantidade) {
        if (this.saldo >= quantidade){
            System.out.println("Saque realizado com sucesso");
            this.saldo -= quantidade;
        }else {
            System.out.println("Saque insuficiente, deseja usar saque especial ?");
            String resposta = scanner.nextLine();

            if (resposta.equals("Sim") ){
                double diferenca = quantidade - this.saldo;

                if (valorSaqueAlt >= diferenca ){
                    System.out.println("Saque realizado com sucesso");
                    this.saldo -= quantidade;
                }else {
                    System.out.println("Saque especial insuficiente!");
                }

            }
            if (resposta.equals("Não")){
                System.out.println("Encerrando operação...");
            }

        }
    }

    public void depositarCheque(double valorCheque){
        this.saldo += valorCheque;
    }
}
