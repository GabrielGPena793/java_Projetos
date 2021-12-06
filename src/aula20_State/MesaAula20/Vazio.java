package aula20_State.MesaAula20;

public class Vazio implements EstadoCarrinho {

    private Carrinho carrinho;

    public Vazio(Carrinho carrinho) {
        this.carrinho = carrinho;
    }


    @Override
    public void cancelarCarrinho() {

        if (carrinho.getProdutos().size() > 0){
            irParaOProximoEstado();
            carrinho.cancelarCarrinho();
            carrinho.getProdutos().clear();
        }else {
            System.out.println("Não há produtos para cancelar, o carrinho está vazio");
        }
    }

    @Override
    public void retornarAoPontoAnterior() {
        System.out.println("Não da pra retornar mais o carrinho está vazio!");
    }

    @Override
    public void irParaOProximoEstado() {
        carrinho.setEstadoCarrinho( new Carregando(this.carrinho));
        System.out.println("Carrinho foi para o estado Carregando!");
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }
}
