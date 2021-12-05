package aula20_State.MesaAula20;

public class Carregando implements EstadoCarrinho {

    private Carrinho carrinho;

    public Carregando(Carrinho carrinho) {
        this.carrinho = carrinho;
    }


    @Override
    public void cancelarCarrinho() {
        carrinho.setEstadoCarrinho(new Vazio(this.carrinho));
        System.out.println("Produtos cancelados, Agora o carrinho está vazio!");
    }

    @Override
    public void retornarAoPontoAnterior() {
        carrinho.setEstadoCarrinho(new Vazio(this.carrinho));
        System.out.println("O carrinho retornou para o estado vazio!");
    }

    @Override
    public void irParaOProximoEstado() {
        carrinho.setEstadoCarrinho(new Pagando(this.carrinho));
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }


}
