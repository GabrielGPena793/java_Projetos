package Aula12;

public abstract class Funcionario {

    private String nome, sobrenome, cpf, email, matricula;


    public Funcionario(String nome, String sobrenome, String cpf, String email, String matricula) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.email = email;
        this.matricula = matricula;
    }

    public abstract void pagamento();
}
