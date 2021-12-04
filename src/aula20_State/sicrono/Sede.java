package aula20_State.sicrono;

public class Sede implements Estado{

    private Tamagochi tamagochi;

    public Sede(Tamagochi tamagochi) {
        this.tamagochi = tamagochi;
    }

    @Override
    public void come() {
        System.out.println("Nham nham!");
    }

    @Override
    public void bebe() {
        System.out.println("Beep, beep, beep, beep, beep");
        tamagochi.setEstado(new Feliz(tamagochi));
    }

    @Override
    public void carinho() {
        System.out.println("Cut cut..");
    }

}
