package MesaAula10;

public class Main {

    public static void main(String[] args) {
        Asteroide asteroide = new Asteroide(20, 30, 'S', 2);
        Nave nave = new Nave(20,30, 'S', 1.2);

        System.out.println(asteroide.toString());
        System.out.println(nave.toString());

        asteroide.setDanos(4);
        // verifica se a nave está na mesma posição do asteroide e aplica o dano
        if(asteroide.toString().equals(nave.toString())){
            System.out.println("A nave levou " + nave.restaVida(asteroide.getDanos()) + " dano");
        }else {
            System.out.println("A nave está longe do asteroide");
        }

        //MUDANDO A DIREÇÃO
        asteroide.irA(5,10,'S');
        nave.irA(20, 80, 'N');

        if(asteroide.toString().equals(nave.toString())){
            System.out.println("A nave levou " + nave.restaVida(asteroide.getDanos()) + " dano");
        }else {
            System.out.println("A nave está longe do asteroide");
        }
    }


}
