package Aula12_mesa;

public class Tecnico extends Assistente {

    private double bonusSalarial;

    public Tecnico(String nome, double salario, String numeroMatricula, double bonusSalarial) {
        super(nome, salario, numeroMatricula);
        this.bonusSalarial = bonusSalarial;
    }

    @Override
    public double ganhoAnual() {
        return super.ganhoAnual() + bonusSalarial;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Bonus salarial: R$" + this.bonusSalarial);
    }
}
