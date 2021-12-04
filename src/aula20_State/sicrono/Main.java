package aula20_State.sicrono;

public class Main {

    public static void main(String[] args) {

        Tamagochi tamagochi = new Tamagochi();

        tamagochi.carinho();
        System.out.println(tamagochi.getEstado().getClass());

    }
}
