package aula20_State.MesaAula20;

public interface EstadoCarrinho {

    void cancelarCarrinho();
    void retornarAoPontoAnterior();
    void irParaOProximoEstado();
}
