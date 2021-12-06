package aula20_State.MesaAula20;

import java.util.List;

public interface EstadoCarrinho {

    void cancelarCarrinho();
    void retornarAoPontoAnterior();
    void irParaOProximoEstado();
}
