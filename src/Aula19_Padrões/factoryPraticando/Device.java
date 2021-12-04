package Aula19_Padrões.factoryPraticando;

public abstract class Device {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void descricaoDevice(){
        System.out.println("O dispositivo " + getNome() + " é muito bom" );
    }
}
