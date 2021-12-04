package Aula22_Composite.Assicrona;

import java.util.ArrayList;
import java.util.List;

public class DepartComposite implements Departamento{

    private int id;
    private String name;

    private List<Departamento> childDepartments;

    public DepartComposite(int id, String name) {
        this.id = id;
        this.name = name;
        this.childDepartments = new ArrayList<>();
    }

    public void getName() {
      childDepartments.forEach(Departamento::getName);
    }

    public void addDepart(Departamento departamento) {
        childDepartments.add(departamento);
    }

    public void removeDepart(Departamento departamento) {
        childDepartments.remove(departamento);
    }
}


