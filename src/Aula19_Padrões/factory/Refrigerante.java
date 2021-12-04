package Aula19_Padrões.factory;

public  abstract class Refrigerante {
    private String nome;

    public String getName(){
        return nome;
    }

    public void abrir(){
        System.out.println("Você abriu uma lata de" + getName());
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
