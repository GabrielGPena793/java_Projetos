package aula02;

import java.util.Scanner;

public class assicrono02 {
    // Faça uma função que receba dois valores como parâmetro e que o retorno seja do tipo booleano. A função deve verificar se o primeiro número é divisível pelo segundo.
    // NOTA: O fato de ser divisível pelo outro significa que ao dividir precisa dar um resultado exato, ou seja, sem decimais.

    public static boolean divisivel(int num1, int num2){

        return num1 % num2 == 0;
    };

    public static void main(String[] args){


        //Defina dois números inteiros e atribua um valor a cada um. Verifique se o primeiro  número é divisível pelo segundo e indique o resultado obtido por meio de uma mensagem.

        int num1 = 10;
        int num2 = 5;

        if(num1 % num2 == 0){
            System.out.println("É divisivel");
        }else{
            System.out.println("Não é divisivel");
        }



//    Defina duas sequências de texto. Verifique se são iguais ou diferentes e indique por meio de mensagem.

        String text1 = "Olá a todos";
        String text2 = "Olá a todos";

        if(text1.equals(text2)){
            System.out.println("são iguais");
        }else{
            System.out.println("Não são iguais");
        }


//        Defina duas variáveis Integer e determine pelo valor delas qual é maior, qual é menor ou se são iguais. Mostre o resultado obtido.


        Integer valor1 = 20;
        Integer valor2 = 10;

        if (valor1.compareTo(valor2) == 1){
            System.out.println(valor1 + " é maior");
        }else if (valor2.compareTo(valor1) == 1){
            System.out.println(valor2 + " é maior");
        }else if (valor1.equals(valor2)){
            System.out.println("são iguais");
        }


//        Escreva um programa Java que solicite um nome e um sobrenome separadamente, e a partir dessas variáveis, você deve obter uma terceira
//        variável com as iniciais. Imprima o nome, o sobrenome e as iniciais no console do IntelliJ.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();
        System.out.println("Digite seu sobrenome:");
        String sobrenome =  scanner.nextLine();

        char[]  iniciais = {nome.charAt(0), sobrenome.charAt(0)} ;
        System.out.println(nome + " " + sobrenome + " inciais:  " + iniciais[0] + iniciais[1]);

        //================================================== chamando função
        System.out.println("Digite um número:");
        int primeiroNumero = scanner.nextInt();
        System.out.println("Digite outro número:");
        int segundoNumero = scanner.nextInt();

        boolean saoDivisiveis = divisivel(primeiroNumero, segundoNumero);
        System.out.println(primeiroNumero + " é divisivel por " + segundoNumero + " ? " + saoDivisiveis);

    }

}
