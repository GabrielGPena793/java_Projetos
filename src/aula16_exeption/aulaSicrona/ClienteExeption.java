package aula16_exeption.aulaSicrona;

public class ClienteExeption extends Exception{

    public ClienteExeption(){ }

    public ClienteExeption(String mensagem){
        super(mensagem);
    }

    @Override
    public String toString() {
        return getMessage();
    }

}
