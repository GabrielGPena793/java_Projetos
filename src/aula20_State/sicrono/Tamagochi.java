package aula20_State.sicrono;

public class Tamagochi {

    private Estado estado;


    public Tamagochi(){
        setEstado(new Triste(this)); // criar em tempo de execução!
    }

    public void come() {
        getEstado().come();
    }

    public void bebe() {
        getEstado().bebe();
    }

    public void carinho() {
        getEstado().carinho();
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
