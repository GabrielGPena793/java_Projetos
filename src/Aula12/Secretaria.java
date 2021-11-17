package Aula12;

public class Secretaria extends Funcionario {
    private double salario;

    public Secretaria(String nome, String sobrenome, String cpf, String email, String matricula, double salario) {
        super(nome, sobrenome, cpf, email, matricula);
        this.salario = salario;
    }

    @Override
    public void pagamento() {
        System.out.println("O seu salário é " + salario);
    }

}
