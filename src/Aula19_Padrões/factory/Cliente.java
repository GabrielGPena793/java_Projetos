package Aula19_Padrões.factory;

public class Cliente {

    public static void main(String[] args) {
        Refrigerante refrigerante = RefrigeranteFactory.fazerRefrigerante("K");

        System.out.println(refrigerante.getName());
        refrigerante.abrir();
        Refrigerante refrigerante2 = RefrigeranteFactory.fazerRefrigerante("L");

        System.out.println(refrigerante2.getName());

    }
}
