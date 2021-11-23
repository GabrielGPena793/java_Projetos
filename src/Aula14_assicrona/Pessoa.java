package Aula14_assicrona;

import java.util.ArrayList;
import java.util.Collections;

public class Pessoa {

    private String nome;
    private  String sobrenome;
    private int idade;
    ArrayList<Conta> listContas = new ArrayList<>();

    public Pessoa(String nome, String sobrenome, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }

    public void addConta(Conta novaConta){
        listContas.add(novaConta);
    }

    public String  getNomeCompleto(){
        return nome + " " + sobrenome;
    }

    public boolean ehMaiorIdade(){
        if (this.idade >= 18){
            return true;
        }else {
            return false;
        }
    }

    public double getSaldoTotal(){
        double valorTotal = 0;
        for(Conta conta: listContas){
            valorTotal += conta.getSaldo();
        }
        return valorTotal;
    }

    public void mostrarContas(){
        Collections.sort(listContas);
        for (Conta conta: listContas){
            System.out.println("Conta número: " + conta.getNumConta() +
                    " tem R$ " + conta.getSaldo());
        }
    }
}
