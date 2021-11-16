package MesaAula10;

public class Objeto {
    private int posx, posy;
    private char direcao;

    public Objeto(int posx, int posy, char direcao) {
        this.posx = posx;
        this.posy = posy;
        this.direcao = direcao;
    }

    @Override
    public String toString() {
        return " + Objeto {" +
                "posx=" + posx +
                ", posy=" + posy +
                ", direcao=" + direcao +
                '}';
    }

    public int getPosx() {
        return posx;
    }

    public int getPosy() {
        return posy;
    }

    public char getDirecao() {
        return direcao;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public void setDirecao(char direcao) {
        this.direcao = direcao;
    }

    public void irA(int x, int y, char direcao){
        setPosx(x);
        setPosy(y);
        setPosy(direcao);
    }
}
