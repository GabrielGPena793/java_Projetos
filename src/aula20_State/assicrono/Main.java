package aula20_State.assicrono;

public class Main {

    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo();

        semaforo.mostrarAviso();

        semaforo.mudarEstado();

        semaforo.mostrarAviso();

        semaforo.mudarEstado();

        semaforo.mostrarAviso();


    }
}
