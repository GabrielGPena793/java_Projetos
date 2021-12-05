package aula20_State.MesaAula20;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private EstadoCarrinho estadoCarrinho;
    private List<Produto> produtos = new ArrayList<>();

    public Carrinho(EstadoCarrinho estadoCarrinho) {
        this.estadoCarrinho = new Vazio(this);
    }

    public EstadoCarrinho getEstadoCarrinho() {
        return estadoCarrinho;
    }

    public void setEstadoCarrinho(EstadoCarrinho estadoCarrinho) {
        this.estadoCarrinho = estadoCarrinho;
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
