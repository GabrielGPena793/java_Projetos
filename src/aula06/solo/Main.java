package aula06.solo;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Impressora impressora = new Impressora("AOC", "Cabo",
                LocalDate.of(2021,5,12));

        System.out.println(impressora.getDataFabricacao());
        impressora.setFolhasDisponiveis(100);
        impressora.imprimir("Imprimindo o texto em uma folha A4");
        System.out.println(impressora.getFolhasDisponiveis());
    }

}
