package Aula22_Composite;

public class DepartVendas implements Departamento {

    private String name;
    private int id;

    @Override
    public void getName() {
        System.out.println(getClass().getSimpleName());
    }

}
