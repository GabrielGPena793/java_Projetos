package Aula22_Composite.Sicrona;

public class Main {

    public static void main(String[] args) {
        ArquivoPastas arquivoPastas = new ArquivoPastas("Pasta Geral", 0);

        Arquivo musica = new ArqMusica("MC leozinho.mp4", 210);
        Arquivo musica2 = new ArqMusica("LowFi.ms", 500);

        Arquivo video = new ArqVideo("Dexter.hd", 2000);
        Arquivo video2 = new ArqVideo("Parkour.mkv", 20000);

        Arquivo texto = new ArqText("Livro.txt", 100);
        Arquivo texto2 = new ArqText("Anotações.txt", 20);

        arquivoPastas.addArquivo(musica);
        arquivoPastas.addArquivo(musica2);

        arquivoPastas.addArquivo(video);
        arquivoPastas.addArquivo(video2);

        arquivoPastas.addArquivo(texto);
        arquivoPastas.addArquivo(texto2);

        arquivoPastas.getNome();
        arquivoPastas.tamanhoTotal();

    }
}
