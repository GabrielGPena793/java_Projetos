package aula02;

import java.util.Scanner;

public class encontro {

    public static void main(String[] args){
//    Faça um programa Java que solicite do usuário seu nome e sobrenome separadamente, e a sua data de nascimento.  Para a data solicite que o usuário
//    digite 3 valores que representam o dia, mês e ano. Além disso, a partir das variáveis do nome e sobrenome obtenha em uma terceira com as iniciais do usuário.
//    Em seguida, exiba uma mensagem, com seu nomes, as iniciais do seu nome e sobrenome e sua data de nascimento no formato "dd / mm / aaaa"

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();
        System.out.println("Digite seu sobrenome:");
        String sobrenome = scanner.nextLine();
        System.out.println("Digite sua data de nascimento, dia:");
        int dia = scanner.nextInt();
        System.out.println("mês:");
        int mes = scanner.nextInt();
        System.out.println("ano:");
        int ano = scanner.nextInt();

        char[] iniciais = {nome.charAt(0), sobrenome.charAt(0)};

        System.out.println("Olá " + nome + "\nIniciais do seu nome: " + iniciais[0] + iniciais[1] +
                "\nsua data de nascimento é: "  + dia + " / " + mes + " / " + ano);

    }
}
