package Aula15MesaDeTrabalho;

public class Capitao {
    private String nome, apelido, registro;

    public Capitao(String nome, String apelido, String registro) {
        this.nome = nome;
        this.apelido = apelido;
        this.registro = registro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }
}
