package Aula19_Padrões.factoryPraticando;

public class IphoneFactory {

    public static Device novoDispositivo(String tipo){

        if (tipo.equals("X")) return new IPhoneX();

        if (tipo.equals("Y")) return new IPhoneY();

        return null;
    }

    public static Device novoDispositivo(String tipo, String dado, String pais){

        if (tipo.equals("X")) return new IPhoneX(dado, pais);
        return null;
    }

}
