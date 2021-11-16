package aula05;

public class UsuarioJogo {

    private String nome;
    private String nickName;
    private  int pontuacao;
    private int nivel;

    public UsuarioJogo(String nome, String nickName){
        this.nome = nome;
        this.nickName = nickName;
        this.pontuacao = 0;
        this.nivel = 1;
    }

    public String getNome(){
        return this.nome;
    }

    public String getNickName(){
        return this.nickName;
    }

    public int getNivel(){
        return this.nivel;
    }

    public int getPontuacao(){
        return this.pontuacao;

    }

    public void aumentarPontuacao(){
         this.pontuacao++;
         this.subirNivel();
    }

    public void bonus(int valor){
        this.pontuacao += valor;
        this.subirNivel();
    }

    public void subirNivel(){
        while (this.pontuacao > 100) {
                this.nivel += 1;
                System.out.println("Level Up!");
                System.out.println(this.nivel);
                this.pontuacao -= 100;
        }
    }


}


