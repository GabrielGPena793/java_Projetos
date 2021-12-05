package Aula19_Padrões.Mesa_Solo;

import java.util.ArrayList;

public class Armazem {
    private ArrayList<Produto> produtos;

    public Armazem() {
        this.produtos = new ArrayList<>();
    }

    public double espacoNescessario(){
        double espaco = 0;
        for (Produto produto : produtos){
            espaco += produto.calculaEspaco();
        }
        return espaco;
    }

    public void addProduto(Produto produto){
        produtos.add(produto);
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
}
