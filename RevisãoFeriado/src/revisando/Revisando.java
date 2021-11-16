package revisando;

import java.util.Scanner;

public class Revisando {
    public static void main(String[] args) {
//        Defina duas sequências de texto. Verifique se são iguais ou diferentes e indique por meio de mensagem.
//        Exercício 2
//        Defina duas variáveis Integer e determine pelo valor delas qual é maior, qual é menor ou se são iguais. Mostre o resultado obtido.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = scanner.nextLine();
        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.nextLine();
        String inciais =  nome.charAt(0) + "" + sobrenome.charAt(0);

        System.out.println(nome);
        System.out.println(sobrenome);
        System.out.println(inciais);

    }
}
