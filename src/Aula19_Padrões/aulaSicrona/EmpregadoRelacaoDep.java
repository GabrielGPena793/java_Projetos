package Aula19_Padrões.aulaSicrona;

public class EmpregadoRelacaoDep  extends Empregado{

    private double salarioMensal;

    public EmpregadoRelacaoDep(String nome, String sobrenome, String arquivo, double salarioMensal) {
        super(nome, sobrenome, arquivo);
        this.salarioMensal = salarioMensal;
    }

    public EmpregadoRelacaoDep() {
        super();
    }

    @Override
    public double calcularSalario(int dias) {
        return (this.salarioMensal / 30 ) * dias;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
}
