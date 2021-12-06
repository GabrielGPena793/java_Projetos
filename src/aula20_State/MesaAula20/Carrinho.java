package aula20_State.MesaAula20;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private EstadoCarrinho estadoCarrinho;
    private List<Produto> produtos = new ArrayList<>();

    public Carrinho() {
        this.estadoCarrinho = new Vazio(this);
    }

    public void addProduto(Produto produto){
        produtos.add(produto);
    }
    public EstadoCarrinho getEstadoCarrinho() {
        return estadoCarrinho;
    }

    public void setEstadoCarrinho(EstadoCarrinho estadoCarrinho) {
        this.estadoCarrinho = estadoCarrinho;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    //=======================================================

    public void cancelarCarrinho() {
        estadoCarrinho.cancelarCarrinho();
    }


    public void retornarAoPontoAnterior() {
        estadoCarrinho.retornarAoPontoAnterior();
    }


    public void irParaOProximoEstado() {
        estadoCarrinho.irParaOProximoEstado();
    }
}
