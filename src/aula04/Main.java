package aula04;

public class Main {
    public static void main(String[] args) {
//         Artigo artigo = new Artigo("Leite",5.00,50);
//
//         if (artigo.temEstoque()){
//             System.out.println("Tem estoque diponível");
//         }else {
//             System.out.println("Não tem estoque");
//         }
//
//        System.out.println("O preço de venda é R$ " + artigo.consultarPreco());

        Caminhao meuCaminhao = new Caminhao("Ford", "AB XX YY");

        Caminhao.mudarPrecoDoCombustivel(7.0);

        System.out.println(meuCaminhao.getNomeDaMarca());
        System.out.println("Gatos R$ " + meuCaminhao.gastoDoCombustivel(40));
    }
}
