package Aula12;

public class Main {

    public static void main(String[] args) {
        Funcionario funcionario = new Gerente("Ripy", "Lorem", "1523", "ripy@hotmail.com", "00226", 2000, 100);


        Empresa dh = new Empresa("DH", "5555");
        dh.addFuncionario(funcionario);

    }



}
