package Aula22_Composite.Assicrona;

public class DepartFinaceiro implements  Departamento{

    private String name;
    private int id;

    public DepartFinaceiro(String name) {
        this.name = name;
    }

    @Override
    public void getName() {
        System.out.println(this.name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
