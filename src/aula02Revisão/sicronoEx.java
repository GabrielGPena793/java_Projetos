package aula02Revisão;

import java.util.Scanner;

public class sicronoEx {

    public static void quantosPacotes(float quantidade){
        Scanner entrada = new Scanner(System.in);
        float kilo = 0.0f;
        int pacote = 0;

        while(kilo < quantidade){
            System.out.println("Digite o peso do pacote: ");
            String entradaAuxiliar = entrada.nextLine();
            float aux = Float.parseFloat(entradaAuxiliar);

            kilo += aux;
            pacote++;
        }

        System.out.println("você vai precisar de " + pacote + "  pacote(s)");
    }

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digit o nome do cachorrinho");
        String nome = entrada.nextLine();

        System.out.println("Digite a quantidade de ração");
        String quantiAuxiliar = entrada.nextLine();
        float quatidade = Float.parseFloat(quantiAuxiliar);

        quantosPacotes(quatidade);


    }
}
