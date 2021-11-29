package aula16_exeption.aulaSicrona;

public class Praticando {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Gabriel", "Gomes", "2251523", 100,0);

        try{
            cliente.comprar(1);
        }catch(ClienteExeption e){
            System.err.println(e);// ele já chama o default to string
        }

        cliente.setSaldoEmConta(200);

        try{
            cliente.comprar(1);
        }catch(ClienteExeption e){
            System.err.println(e);// ele já chama o default to string
        }
    }


}
