package mesaAula11;

public class Cavalo extends Animal {

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Relinchar");
    }

    @Override
    public void correr() {
        System.out.println("Corre como cavalo");
    }
}
