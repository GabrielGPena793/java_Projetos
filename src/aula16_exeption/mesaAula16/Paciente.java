package aula16_exeption.mesaAula16;

import java.time.LocalDate;
import java.util.Date;


public class Paciente {

    String nome;
    String sobrenome;
    String historiaClinica;
    LocalDate dataInternacao;
    LocalDate dataAlta;


    Paciente(String nome, String sobrenome, String historiaClinica, LocalDate dataInternacao) throws PacienteExeption {
        LocalDate hoje= LocalDate.now();
        this.nome=nome;
        this.sobrenome=sobrenome;
        dataAlta=null;
        if (dataInternacao.isBefore(hoje)) {
            this.dataInternacao = dataInternacao;
        }else {
            throw new PacienteExeption("A data é posterior a data atual");
        }
    }

    public LocalDate getDataInternacao() {
        return dataInternacao;
    }

    public LocalDate getDataAlta() {
        return dataAlta;
    }

    public void darAlta(LocalDate dataAlta) throws PacienteExeption {
        if (dataAlta.isAfter(dataInternacao))
            throw new PacienteExeption("Não pode!");
        else
            System.out.println("Ok");
    }
}
