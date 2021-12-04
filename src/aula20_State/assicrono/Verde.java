package aula20_State.assicrono;

public class Verde implements EstadoSemaforo {
    private Semaforo semaforo;

    public Verde(Semaforo semaforo) {
        this.semaforo = semaforo;
    }

    @Override
    public void mudarEstado() {
          semaforo.setSemaforo(new Amarelo(this.semaforo));
    }

    @Override
    public void mostrarAviso() {
        System.out.println("PROSSIGA, SINAL VERDE!");
    }

}
