package aula05;

public class Main {

    public static void main(String[] args) {


        UsuarioJogo usuario1 = new UsuarioJogo("Troy", "Ty71");
        UsuarioJogo usuario2 = new UsuarioJogo("Lia", "Lily");

        // =================== usuario 1
        String nomeJogador = usuario1.getNome();
        System.out.println(nomeJogador);
        usuario1.aumentarPontuacao();
        usuario1.bonus(301);
        usuario1.subirNivel();


        // =================== usuario 2
        String nickName = usuario2.getNickName();
        System.out.println( nickName + " Você mantou o boss Asa Negra e recebeu 120 pontos de xp");
        usuario2.bonus(210);

    }
}
