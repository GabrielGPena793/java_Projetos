package aula20_State.sicrono;

public class Triste implements Estado {

    private Tamagochi tamagochi;

    public Triste(Tamagochi tamagochi) {
        this.tamagochi = tamagochi;
    }

    @Override
    public void come() {
        System.out.println("beep beep ... vomitando");
    }

    @Override
    public void bebe() {
        System.out.println("Beep, beep, beep...");
    }

    @Override
    public void carinho() {
        System.out.println("Cut cut..");
        tamagochi.setEstado(new Feliz(tamagochi));
    }
}
