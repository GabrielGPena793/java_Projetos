package Aula12_mesa;

public class Teste {

    public static void main(String[] args) {
        Administrativo administrativo = new Administrativo("Roberto", 2500, "001", "dia");
        Tecnico tecnico = new Tecnico("Bob", 3000, "002", 250);

        administrativo.exibirDados();
        administrativo.pedeAumento(250);
        double ganhoAnualAdm = administrativo.ganhoAnual();
        String nomeAdm = administrativo.getNome();
        System.out.println("O ganho anual de " + nomeAdm + " é de R$" + ganhoAnualAdm);
        System.out.println("-----------------------");
        tecnico.exibirDados();
        double ganhoAnualTec = tecnico.ganhoAnual();
        String nomeTec = tecnico.getNome();
        System.out.println("O ganho anual de " + nomeTec + " é de R$" + ganhoAnualTec);


    }
}
