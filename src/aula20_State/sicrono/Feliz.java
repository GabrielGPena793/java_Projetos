package aula20_State.sicrono;

public class Feliz  implements Estado{


    private Tamagochi tamagochi;

    public Feliz(Tamagochi tamagochi) {
        this.tamagochi = tamagochi;
    }

    @Override
    public void come() {
        System.out.println("Nham nham!");
    }

    @Override
    public void bebe() {
        System.out.println("Beep, beep, beep, beep, beep");
    }

    @Override
    public void carinho() {
        System.out.println("Cut cut..");
    }
}
