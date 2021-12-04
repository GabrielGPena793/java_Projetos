package aula20_State.assicrono;

public class Vermelho implements EstadoSemaforo {

    private Semaforo semaforo;

    @Override
    public void mudarEstado() {
        semaforo.setSemaforo(new Verde(this.semaforo));
    }

    @Override
    public void mostrarAviso() {
        System.out.printf("PARE!, SINAL VERMELHO");
    }
}
