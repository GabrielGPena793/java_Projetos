package Aula14_assicrona;

public class Principal {
    public static void main(String[] args) {
        Pessoa user1 = new Pessoa("Gabriel", "Gomes", 25);
        Conta conta1 = new Conta(3,12000);
        Conta conta2 = new Conta(2,5000);
        Conta conta3 = new Conta(1,10000);


        user1.addConta(conta1);
        user1.addConta(conta2);
        user1.addConta(conta3);

        if (user1.ehMaiorIdade()){
            System.out.println(user1.getNomeCompleto() + " é maior de idade");
        }else {
            System.out.println(user1.getNomeCompleto() + " é menor de idade");
        }

        user1.mostrarContas();

        System.out.println(user1.getNomeCompleto() + " o saldo total das suas contas é R$" + user1.getSaldoTotal());

    }
}
