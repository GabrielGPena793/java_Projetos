package aula16_exeption.mesaAula16;

import java.time.LocalDate;

public class Principal {

    public static void main(String[] args) {

        try {
            Paciente paciente = new Paciente("pepi", "barros","sei lá", LocalDate.of(2021,11,28));
            System.out.println(paciente.getDataInternacao());

            paciente.darAlta(LocalDate.of(2020,12,30));

        }
        catch (PacienteExeption pacienteExeption){
            System.err.println(pacienteExeption);
        }
    }
}
