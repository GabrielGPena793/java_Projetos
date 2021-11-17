package Aula12;

public class Vendedor extends Funcionario{

    private double salario, comissao;

    public Vendedor(String nome, String sobrenome, String cpf, String email, String matricula, double salario, double comissao) {
        super(nome, sobrenome, cpf, email, matricula);
        this.salario = salario;
        this.comissao = comissao;
    }

    @Override
    public void pagamento() {
        System.out.println("O seu salário será de " + (salario + comissao));
    }
}
