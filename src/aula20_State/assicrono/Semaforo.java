package aula20_State.assicrono;

public  class Semaforo {

    public EstadoSemaforo cor;

    public Semaforo() {
        setSemaforo(new Verde(this));
    }

    public  void mudarEstado(){
        this.cor.mudarEstado();
    }

    public  void mostrarAviso(){
        this.cor.mostrarAviso();
    }

    public EstadoSemaforo getSemaforo() {
        return this.cor;
    }

    public void setSemaforo(EstadoSemaforo estado) {
        this.cor = estado;
    }
}
