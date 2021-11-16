package aula04;

public class Artigo {

    private String produtoNome;
    private double precoDeVenda;
    private int estoque;

        public  Artigo(String descricao, double preco, int estoque){
            this.produtoNome = descricao;
            this.precoDeVenda = preco;
            this.estoque = estoque;
        }

        public boolean temEstoque(){
            return estoque != 0;
        }

        public double consultarPreco(){
            return precoDeVenda;
        }




};

