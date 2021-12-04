package Aula19_Padrões.aulaSicrona;

public class EmpregadoFactory {

    //padrão singleton =======================
    private static EmpregadoFactory instance;

    private EmpregadoFactory() {}

    public static EmpregadoFactory getInstance(){

        if (instance == null){
            instance = new EmpregadoFactory();
        }
        return instance;
    }

    //padrão factory ==========================

    public Empregado criarEmpregado(String tipo){

        if (tipo.equals("EMP-INT")){
            return new EmpregadoRelacaoDep();
        }else if (tipo.equals("EMP-EXT")){
            return new EmpregadoContratado();
        }
        return null;
    }

}
