package aula02Revisão;

import java.util.Scanner;

public class mesaSolo {

    public static boolean ePrimo(int n){
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void maiorValor(int num1, int num2, int num3){
        if (num1 > num2 && num1 > num3){
            System.out.println("Número: " + num1 + " é o maior");
        }else  if(num2 > num1 && num2 > num3){
            System.out.println("Número " + num2 + " é o maior");
        }else {
            System.out.println("Número " + num3 + " é o maior");
        }
    }

    public static void main(String[] args){

//        Faça uma função que, dado um número, indica se é um número primo ou não. Um número primo é aquele que só pode ser dividido
//        por 1 e ele mesmo. Por exemplo: 25 não é primo, pois 25 é divisível por 1, 5 e 25. 17 é primo porque só pode ser dividido por 1 e por 17.
//        Para usar esta função que iremos criar, podemos permitir a entrada de apenas um número do usuário para verificar se o número é primo ou não.
//        Para resolvê-lo, use a função obtida no exercício desenvolvido na aula assíncrona, Boolean eDivisível (int n, int divisor).
        int numero = 4;
        boolean resposta = ePrimo(numero);

        System.out.println("Numero " + numero + " é primo ? " + resposta);


//        Escreva uma função que receba três números e retorne o maior valor entre os três números. Em seguida, faça um programa que
//        permita a entrada de 3 valores pelo usuário, use a função e exiba o resultado.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira três valores: ");
        int valor1 = scanner.nextInt();
        int valor2 = scanner.nextInt();
        int valor3 = scanner.nextInt();

        maiorValor(valor1, valor2, valor3);

    }
}
