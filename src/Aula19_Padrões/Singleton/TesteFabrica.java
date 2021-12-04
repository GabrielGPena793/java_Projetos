package Aula19_Padrões.Singleton;

public class TesteFabrica {

    public static void main(String[] args) {
        FabricaDeCarro fabricaDeCarro = FabricaDeCarro.getInstance();

        fabricaDeCarro.setTotalCarrosVolks(10);
        String resultado = fabricaDeCarro.criarCarroVolks();

        System.out.println(resultado);



    }
}
