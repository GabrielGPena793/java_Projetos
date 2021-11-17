package Aula12_mesa;

public class Assistente extends Funcionario{

    private String numeroMatricula;

    public Assistente(String nome, double salario, String numeroMatricula) {
        super(nome, salario);
        this.numeroMatricula = numeroMatricula;
    }


    @Override
    public void exibirDados() {
        System.out.println("nome: " + this.nome + "\n" +
                "Salário: " + this.salario + "\n" +
                "Numero da matricula: " + this.numeroMatricula);
    }
}
