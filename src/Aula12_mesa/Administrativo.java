package Aula12_mesa;

import java.util.Objects;

public class Administrativo extends Assistente {
     private  String turno;

    public Administrativo(String nome, double salario, String numeroMatricula, String turno) {
        super(nome, salario, numeroMatricula);
        this.turno = turno;
    }

    @Override
    public double ganhoAnual() {
        if (turno.equals("noite")) {
            return super.ganhoAnual() * 1.2;
        }else {
            return super.ganhoAnual();
        }
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Turno : " + this.turno);
    }
}
