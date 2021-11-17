package Aula12;

import java.util.ArrayList;

public class Empresa {

    private String nome, cnpj;
//  private Funcionario funcionario; objeto simples!
    private ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public void addFuncionario(Funcionario funcionario){
        listaFuncionarios.add(funcionario);
    }


}
