package Aula19_Padrões.Mesa_Solo;

import Aula19_Padrões.aulaSicrona.EmpregadoFactory;

public class ProdutoFactory {
    //padrão singleton =======================

    private static ProdutoFactory  instance;

    public ProdutoFactory() {
    }

    public static ProdutoFactory getInstace(){

       if (instance == null){
          instance = new ProdutoFactory();
       }
       return instance;
    }

    
    //padrão factory ==========================

    public Produto criarProduto(String tipo){

        if(tipo.equals("CAIXA10X10")){
            return new Caixa(10,10,10);
        }

        if (tipo.equals("FUTEBOL")){
            return new Bola(11);
        }

        if (tipo.equals("BOLATENIS")){
            return new Bola(0.32);
        }

        return null;
    }
}
