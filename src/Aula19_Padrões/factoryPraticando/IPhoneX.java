package Aula19_Padrões.factoryPraticando;

public class IPhoneX extends Device{

    private String dado;
    private String pais;

    public IPhoneX() {
        setNome("IPhoneX");
    }

    public IPhoneX(String dado, String pais){
        setNome("IPhoneX");
        setDado(dado);
        setPais(pais);
    }

    public String getDado() {
        return dado;
    }

    public void setDado(String dado) {
        this.dado = dado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
