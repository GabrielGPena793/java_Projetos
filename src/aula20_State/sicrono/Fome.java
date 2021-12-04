package aula20_State.sicrono;

public class Fome implements Estado{

    private Tamagochi tamagochi;

    public Fome(Tamagochi tamagochi) {
        this.tamagochi = tamagochi;
    }

    @Override
    public void come() {
        System.out.println("Nham nham, agora está feliz");
        tamagochi.setEstado(new Feliz(tamagochi));
    }

    @Override
    public void bebe() {
        System.out.println("glup nham, agora está feliz");
        tamagochi.setEstado(new Feliz(tamagochi));
    }

    @Override
    public void carinho() {
        System.out.println("Não toque em mim!");
    }
}
