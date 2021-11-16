package aula03;
//        Faça um programa que permita jogar o jogo Pedra-Papel-Tesoura. Primeiro, o
//        aplicativo solicita o nome de cada jogador e, em seguida, qual a opção esse jogador
//        escolhe para jogar: pedra, papel ou tesoura. O jogo consiste em perguntar qual
//        opção cada um escolhe e somar pontos ao vencedor —se houver—. Defina e use
//        uma função chamada whichWin com dois parâmetros com as jogadas de cada um
//        dos jogadores, que retorna 0 em caso de empate, 1 se o primeiro vencer, 2 se o
//        2 segundo vencer. O jogo termina quando o primeiro escolhe * como indicador de
//        fim.

//        Modifique a função que você escreveu no Desafio 2 do "Pedra-Papel-Tesoura" para jogar a variável
//        Spock: Há mais uma possibilidade, o Sr. Spock - formado pela mão Vulcan de Jornada nas Estrelas -
//        tem outros poderes de acordo com:
//        - Papel desaprova Spock
//        - Spock quebra uma tesoura
//        - Spock vaporiza pedra

import java.util.Scanner;

public class PedraPapelTesoura {

    public static void whichWin(String jogador1, String jogador2){

        switch (jogador1){
            case "Pedra":
                switch (jogador2) {
                    case "Pedra" -> System.out.println("Impate " + jogador1 + " e " + jogador2);
                    case "Papel" -> System.out.println("A maquina venceu!!" + jogador2 + " ganha de " + jogador1);
                    case "Tesoura" -> System.out.println("Você venceu!!" + jogador1 + " ganha de " + jogador2);
                    case "Spock" -> System.out.println("Você perdeu," + jogador2 + " vaporiza " + jogador1);
                }
                break;

            case "Papel":
                switch (jogador2) {
                    case "Pedra" -> System.out.println("Você venceu!!" + jogador1 + " ganha de " + jogador2);
                    case "Papel" -> System.out.println("Impate " + jogador1 + " e " + jogador2);
                    case "Tesoura" -> System.out.println("A maquina venceu!!" + jogador2 + " ganha de " + jogador1);
                    case "Spock" -> System.out.println("Você venceu," + jogador1 + " desaprova" + jogador2);
                }
                break;

            case "Tesoura":
                switch (jogador2) {
                    case "Pedra" -> System.out.println("A maquina venceu!!" + jogador2 + " ganha de " + jogador1);
                    case "Papel" -> System.out.println("Você venceu!!" + jogador1 + " ganha de " + jogador2);
                    case "Tesoura" -> System.out.println("Impate " + jogador1 + " e " + jogador2);
                    case "Spock" -> System.out.println("Você perdeu," + jogador2 + " quebra uma " + jogador1);
                }
                break;

            case "Spock":
                switch (jogador2){
                    case "Pedra" -> System.out.println("Você ganhou," + jogador1 + " vaporiza " + jogador2);
                    case "Papel" -> System.out.println("Você perdeu," + jogador2 + " desaprova " + jogador1);
                    case "Tesoura" -> System.out.println("Você ganhou," + jogador1 + " quebra uma " + jogador2);
                    case "Spock" -> System.out.println("Empate " + jogador1 + " respeita " + jogador2);
                }
                break;
            default:
                System.out.println("Saindo do jogo...");
        }
    }

    public static String  Respostas(int resposta){

        return switch (resposta) {
            case 1 -> "Pedra";
            case 2 -> "Papel";
            case 3 -> "Tesoura";
            case 4 -> "Spock";
            case 0 -> "Sair";
            default -> "";
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Entrada do usuario.
        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();
        System.out.println("Escola um: 1 - Pedra, 2 - Papel, 3 - Tesoura, 4 - Spock, 0 - Sair");
        int respostaUsuario = scanner.nextInt();

        // Calculando resposta da máquina.
        Double maquina =  Math.random() * 4 + 1;
        int respotaMaquina = maquina.intValue();

        // Convertendo os números das respostas para os respectivos nomes.
        String escolhaUsuario = Respostas(respostaUsuario);
        String escolhaMaquina = Respostas(respotaMaquina);

        //Chamando a função para ver quem ganhou,e passando como parâmentro as repostas já convertidas.
        whichWin(escolhaUsuario, escolhaMaquina);

    }
}
