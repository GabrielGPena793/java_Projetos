package aula02;

import java.util.Scanner; // import da class Scanner

public class Aula2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String nome = entrada.nextLine(); // nextLine para string, nextInt para inteiros, nextFloat para floats
        String sobrenome = entrada.nextLine();

        String dia = entrada.nextLine();
        String mes = entrada.nextLine();
        String ano = entrada.nextLine();

        char inicialN = nome.charAt(0);
        char inicialS = sobrenome.charAt(0);

        System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome
                            + "\nIniciais " + inicialN + " " + inicialS +
                            "\nData de Nascimento " +  dia + "/" + mes + "/" + ano);
    }

}
