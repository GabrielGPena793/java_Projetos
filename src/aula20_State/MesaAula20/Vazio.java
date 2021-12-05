package aula20_State.MesaAula20;

public class Vazio implements EstadoCarrinho {

    private Carrinho carrinho;

    public Vazio(Carrinho carrinho) {
        this.carrinho = carrinho;
    }


    @Override
    public void cancelarCarrinho() {
        System.out.println("Não há produtos para cancelar, o carrinho está vazio");
    }

    @Override
    public void retornarAoPontoAnterior() {
        System.out.println("Não da pra retornar mais o carrinho está vazio!");
    }

    @Override
    public void irParaOProximoEstado() {
        carrinho.setEstadoCarrinho( new Carregando(this.carrinho));
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }
}
