package aula20_State.assicrono;

public class Amarelo implements   EstadoSemaforo {
    private Semaforo semaforo;

    public Amarelo(Semaforo semaforo) {
        this.semaforo = semaforo;
    }

    @Override
    public void mudarEstado() {
        semaforo.setSemaforo(new Vermelho());
    }

    @Override
    public void mostrarAviso() {
        System.out.println("ATENÇÃO, SINAL AMARELO");
    }

}
