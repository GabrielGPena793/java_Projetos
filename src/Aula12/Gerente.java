package Aula12;

public class Gerente  extends Funcionario{

    private double salario, bonus;

    public Gerente(String nome, String sobrenome, String cpf, String email, String matricula, double salario, double bonus) {
        super(nome, sobrenome, cpf, email, matricula);
        this.salario = salario;
        this.bonus = bonus;

    }

    @Override
    public void pagamento() {
        System.out.println("O seu salário será de " + (salario + bonus));
    }
}
