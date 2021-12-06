package aula20_State.MesaAula20;

import java.util.List;

public class Pagando implements EstadoCarrinho {

    private Carrinho carrinho;

    public Pagando(Carrinho carrinho) {
        this.carrinho = carrinho;
    }


    @Override
    public void cancelarCarrinho() {
        carrinho.setEstadoCarrinho(new Vazio(this.carrinho));
        System.out.println("Produtos cancelados, Agora o carrinho está vazio!");
    }

    @Override
    public void retornarAoPontoAnterior() {
        carrinho.setEstadoCarrinho(new Carregando(this.carrinho));
        System.out.println("O carrinho retornou para o estado Carregando!");
    }

    @Override
    public void irParaOProximoEstado() {
        carrinho.setEstadoCarrinho(new Fechado(this.carrinho));
        System.out.println("Carrinho foi para o estado de fechado!");
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

}
