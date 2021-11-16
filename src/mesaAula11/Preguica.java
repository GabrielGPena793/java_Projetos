package mesaAula11;

public class Preguica extends Animal {

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de preguiça");
    }

    public void subirArvore(){
        System.out.println("Subindo na arvore!");
    }

}
