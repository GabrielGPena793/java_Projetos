package mesaAula11;

public class Main {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("pepinho", 5);
        Cavalo cavalo = new Cavalo("algoz", 10);
        Preguica preguica = new Preguica("dorminhoco", 50);

        cachorro.emitirSom();
        cavalo.emitirSom();

        preguica.subirArvore();
        preguica.setNome("pipo");
        String novoNome = preguica.getNome();
        System.out.println(novoNome);


    }
}
