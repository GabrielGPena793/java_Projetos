package Aula19_Padrões.aulaSicrona;

public class EmpregadoContratado extends Empregado{

    private double valorPorHora, imposto;

    public EmpregadoContratado(String nome, String sobrenome, String arquivo, double valorPorHora, double imposto) {
        super(nome, sobrenome, arquivo);
        this.valorPorHora = valorPorHora;
        this.imposto = imposto;
    }

    public EmpregadoContratado(){
        super();
    }

    @Override
    public double calcularSalario(int dias) {
        return ((this.valorPorHora * 8) * dias) * (1 - this.imposto);
    }
}
