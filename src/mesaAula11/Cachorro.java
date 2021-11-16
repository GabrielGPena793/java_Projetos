package mesaAula11;

import jdk.swing.interop.SwingInterOpUtils;

public class Cachorro extends Animal{

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Auau!");
    }

    @Override
    public void correr() {
        System.out.println("Corre como cachorro");
    }
}
