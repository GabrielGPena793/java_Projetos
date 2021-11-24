package Aula15MesaDeTrabalho;

public class Principal {

    public static void main(String[] args) {
        Capitao luffy = new Capitao("Luffy", "Chapéu de Palha", "1");
        Veleiro thousandSunny = new Veleiro(1000, 100, 10, 2019, 5);
        int luffyQuantidadeMastros = thousandSunny.getQuantidadeMastros();

        System.out.println("A quantidade de mastros do veleiro do capitão " + luffy.getNome() + " tem " + luffyQuantidadeMastros + " Mastros" );
        if (thousandSunny.isGrande()){
            System.out.println("É considerado uma velerio grande!");
        }else{
            System.out.println("É considerado uma velerio pequeno!");
        }
        System.out.println(" O valor do aluguel do velerio é R$ " + thousandSunny.calcularValorAluguel());

        Capitao kaido = new Capitao("Kaido", "Das 100 Feras", "2");
        Veleiro navioBestial = new Veleiro(1500, 150, 20, 2021,2);

        Capitao shanks = new Capitao("Shanks", "Ruivo", "3");
        Iate pipos = new Iate(1000, 100, 10, 2019,6);

        Capitao teach = new Capitao("Teach", "Barba Negra", "4");
        Iate lilys = new Iate(1500, 150, 20, 2021,6);



       if(pipos.compareTo(lilys) == 0){
           System.out.println("O iate do pipos e da lilys são igualmente luxuosos");
       }else if (pipos.compareTo(lilys) > 0){
           System.out.println("O iate do pipos é mais luxuoso  que a da lilys");
       }else if(pipos.compareTo(lilys) < 0){
           System.out.println("O iate do lilys é mais luxuoso  que a da pipo ");
       }
    }

}
