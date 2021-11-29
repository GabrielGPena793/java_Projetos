package aula16_exeption.PG;

public class DataExeption extends Exception {

    public DataExeption()
    {
        super();
    }
    public DataExeption(String mensagem)
    {
        super(mensagem);
    }
    public String toString()
    {
        return "A seguinte exceção ocorreu" + this.getClass().getName() +"\n" +
                " Mensagem: " + this.getMessage() + "\n" ;
    }
}
