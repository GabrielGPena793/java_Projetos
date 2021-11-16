package aula03;

//        Implemente um programa que nos permita exibir os primeiros n  números primos
//        pelo console, onde n é um valor numérico inserido pelo usuário. Por exemplo:
//        Com n = 7, o que o programa deve retornar é "Os primeiros 7 números primos são:
//        2, 3, 5, 7, 11, 13, 17."

import java.util.Scanner;

public class NumerosPrimos {

    public static void primos(int n){
        int divisores = 0;
        int contador = 1;
        int totalPrimos = 0;

        while (totalPrimos < n ){

            for(int i = 1; i <= contador; i++){
                if(contador % i == 0){
                    divisores++;
                }
            }

            if (divisores == 2){
                System.out.println(contador + " é primo");
                totalPrimos++;
            }
            divisores = 0;
            contador++;
        }
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos números primos você quer ver ?");
        int n = scanner.nextInt();
        primos(n);

    }
}
