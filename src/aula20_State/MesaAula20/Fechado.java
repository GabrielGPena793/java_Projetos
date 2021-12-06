package aula20_State.MesaAula20;

import java.util.List;

public class Fechado implements EstadoCarrinho {

    private Carrinho carrinho;

    public Fechado(Carrinho carrinho) {
        this.carrinho = carrinho;
    }


    @Override
    public void cancelarCarrinho() {
        System.out.println("Não pode cancelar, a compra já foi fechada");
    }

    @Override
    public void retornarAoPontoAnterior() {
        System.out.println("O carrinho já fechou, não tem como há produtos para voltar de estado!");
    }

    @Override
    public void irParaOProximoEstado() {
        System.out.println("Seu produto já foi fechado, não há mais estados!");
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

}
