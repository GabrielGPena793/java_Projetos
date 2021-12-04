package Aula22_Composite;

public class Main {

    public static void main(String[] args) {
    DepartComposite departamento = new DepartComposite(1,"composicao");
    Departamento departamento1 = new DepartVendas();
    Departamento departamento2 = new DepartFinaceiro("financeiro");
    Departamento departamento3 = new DepartVendas();


    departamento.addDepart(departamento1);
    departamento.addDepart(departamento2);
    departamento.addDepart(departamento3);

    departamento.getName();


    }


}
