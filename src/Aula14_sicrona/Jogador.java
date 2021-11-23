package Aula14_sicrona;

public class Jogador implements Comparable<Jogador> {

    private int numCamisa;
    private String nome;
    private boolean lesionado;
    private boolean titular;

    public Jogador(int numCamisa, String nome, boolean lesionado, boolean titular) {
        this.numCamisa = numCamisa;
        this.nome = nome;
        this.lesionado = lesionado;
        this.titular = titular;
    }

    public boolean isLesionado() {
        return lesionado;
    }

    public boolean isTitular() {
        return titular;
    }

    public int getNumCamisa() {
        return numCamisa;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(Jogador o) {

        if (o.numCamisa == this.numCamisa){
            return 0;
        }
        if (o.numCamisa < this.numCamisa){
            return 1;
        }else {
            return -1;
        }


    }

}
