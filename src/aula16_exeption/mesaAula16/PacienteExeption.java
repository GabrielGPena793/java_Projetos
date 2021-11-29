package aula16_exeption.mesaAula16;

public class PacienteExeption  extends Exception{

    public  PacienteExeption(){}

    public PacienteExeption(String mensagem){
        super(mensagem);
    }

    @Override
    public String toString() {
        return getMessage();
    }
}
