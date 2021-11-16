package MesaAula10;

public class Asteroide extends Objeto {
    private int danos;

    public Asteroide(int posx, int posy, char direcao, int danos) {
        super(posx, posy, direcao);
        this.danos = danos;
    }


    @Override
    public void irA(int x, int y, char direcao){
        super.irA(x, y , direcao);
        System.out.println("nova direção do asteroide: " + (x + y) + " - " + direcao);
    }

    public void setDanos(int danos) {
        this.danos = danos;
    }

    public int getDanos() {
        return this.danos;
    }
}
