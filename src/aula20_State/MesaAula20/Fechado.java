package aula20_State.MesaAula20;

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
        carrinho.setEstadoCarrinho(new Pagando(this.carrinho));
        System.out.println("O carrinho retornou para o estado Carregando!");
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
