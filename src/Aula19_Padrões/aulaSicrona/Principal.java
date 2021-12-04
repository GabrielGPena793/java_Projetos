package Aula19_Padrões.aulaSicrona;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        Empresa empresa = new Empresa("15213131");
        EmpregadoFactory empregadoFactory = EmpregadoFactory.getInstance();


        empresa.addEmpregado(empregadoFactory.criarEmpregado("EMP-INT"));
        empresa.getListaEmpregados().get(0).setNome("jõao");

        empresa.mostrarArray();



    }
}
