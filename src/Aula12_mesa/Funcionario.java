package Aula12_mesa;

public abstract class Funcionario {

    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void pedeAumento(double valor){
        System.out.println("Aumento de " + valor);
        this.salario += valor;
        System.out.println("Seu novo salário é de R$" + this.salario);
    }

    public double ganhoAnual(){
         return  this.salario * 12;
    }

    public abstract void  exibirDados();

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}


