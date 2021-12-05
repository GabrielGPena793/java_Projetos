package Aula19_Padrões.aulaSicrona;


public class Principal {

    public static void main(String[] args) {
        Empresa empresa = new Empresa("15213131");
        EmpregadoFactory empregadoFactory = EmpregadoFactory.getInstance();


        empresa.addEmpregado(empregadoFactory.criarEmpregado("EMP-INT"));
        empresa.getListaEmpregados().get(0).setNome("jõao");
        empresa.getListaEmpregados().get(0).setValorSalario(3000);


        empresa.mostrarArray();
        System.out.println( empresa.getListaEmpregados().get(0).calcularSalario(8));



    }
}
