package aula20_State.MesaAula20;

public class Main {

    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();
        Produto produto1 = new Produto("Garrafa", 2.25);
        Produto produto2 = new Produto("Baude", 5.25);

        carrinho.addProduto(produto1);
        carrinho.addProduto(produto2);

        carrinho.irParaOProximoEstado();
        carrinho.irParaOProximoEstado();
        carrinho.irParaOProximoEstado();
        carrinho.irParaOProximoEstado();
        carrinho.retornarAoPontoAnterior();

    }
}
