package Aula19_Padrões.Mesa_Solo;

public class Main {

    public static void main(String[] args) {
        Armazem armazem = new Armazem();
        ProdutoFactory produtoFactory = ProdutoFactory.getInstace();

        armazem.addProduto(produtoFactory.criarProduto("CAIXA10X10"));
        armazem.addProduto(produtoFactory.criarProduto("FUTEBOL"));
        armazem.addProduto(produtoFactory.criarProduto("BOLATENIS"));

        armazem.getProdutos().get(0).setPeso(80);

        System.out.println( armazem.getProdutos().get(0).getPeso());

        System.out.println(armazem.espacoNescessario());
    }
}
