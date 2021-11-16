package aula04;

public class Caminhao {
    private String marca;
    private String patente;
    static private double valorDoCombustivel;

    public Caminhao(String marca, String patente){
        this.marca = marca;
        this.patente = patente;
    }

    public String getNomeDaMarca(){
        return marca;
    }

    public double gastoDoCombustivel(int litros){
        return litros * valorDoCombustivel;
    }

    static public void mudarPrecoDoCombustivel(double preco){
        Caminhao.valorDoCombustivel = preco;
    }
}
