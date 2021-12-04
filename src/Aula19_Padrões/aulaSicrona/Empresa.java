package Aula19_Padrões.aulaSicrona;

import java.util.ArrayList;

public class Empresa {

    private String cnpj;
    private ArrayList<Empregado> listaEmpregados = new ArrayList<>();

    public Empresa(String cnpj) {
        this.cnpj = cnpj;
    }

    public void addEmpregado(Empregado empregado){
        listaEmpregados.add(empregado);
    }

    public double calcularSalrioTotal(int dias){
        double total = 0;
        for (Empregado empregado: listaEmpregados){
            total += empregado.calcularSalario(dias);
        }

        return total;
    }

    public void mostrarArray(){
        for (int i = 0; i < listaEmpregados.size(); i++){
            System.out.println(listaEmpregados.get(i).getNome());
        }
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public ArrayList<Empregado> getListaEmpregados() {
        return listaEmpregados;
    }

    public void setListaEmpregados(ArrayList<Empregado> listaEmpregados) {
        this.listaEmpregados = listaEmpregados;
    }
}
