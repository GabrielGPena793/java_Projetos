package Aula19_Padrões.factory;

public class RefrigeranteFactory {

    public static Refrigerante fazerRefrigerante(String tipo){

        if(tipo.equals("K")){
            return new RefrigeranteCola();
        }else if(tipo.equals("L")){
            return new RefrigeranteLaranja();
        }else return null;
    }

}
