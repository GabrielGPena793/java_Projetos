package aula10;

public class AssociadoHabilitado extends Associado {
   private double custoPiscina;
   private boolean habilitado;

    public AssociadoHabilitado(String numero, String nome, String atividade, double valorMensal, double custoPiscina, boolean habilitado) {
        super(numero, nome, atividade, valorMensal);
        this.custoPiscina = custoPiscina;
        this.habilitado = habilitado;
    }
//
//    @Override
//    public double custoMensal(){
//        if(this.habilitado) {
//            return super.custoMensal() + this.custoPiscina;
//        }
//    }


}
