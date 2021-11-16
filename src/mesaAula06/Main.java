package mesaAula06;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {

        InstituicaoDeCachorro cachorro = new InstituicaoDeCachorro("Vira-lata", 2012, 4, true , true);
        InstituicaoDeCachorro cachorroComNome = new InstituicaoDeCachorro("Pintcher", 2000, 6, false , true, "Pepinho");

        cachorro.idadeCachorroChip();
        if (cachorro.podeSerAdotado()) System.out.println("O cachorro pode ser adotado");
        else System.out.println("O cahorro ainda não pode ser adotado");

        // ================================================== cachorro com nome
        cachorroComNome.idadeCachorroChip();
        if (cachorroComNome.podeSerAdotado()) System.out.println("O cachorro " + cachorroComNome.getNome() + " pode ser adotado");
        else System.out.println("O cahorro " + cachorroComNome.getNome() + " ainda não pode ser adotado");


    }
}
