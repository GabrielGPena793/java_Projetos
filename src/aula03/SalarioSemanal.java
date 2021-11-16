package aula03;

//        Crie um programa que possa relatar o salário semanal da programadora Julieta. Por motivos trabalhistas,
//        ela pode trabalhar até 40 horas semanais, se trabalhar mais horas são consideradas horas extras,
//        cujo valor é 50% a mais que a jornada normal de trabalho. Ela trabalhou na última semana um número
//        "x" de horas e o valor por semana  é de 875.



public class SalarioSemanal {

    public static void main(String[] args) {
        // valores padrão do trabalho;
        double valorSemanal = 875.00;
        int horasPadraoSemanal = 40;

        //Verificando a diferença entra as horas trabalhadas de julieta das horas padrão;
        int horasTrabalhadasPorJulieta = 42;
        int diferencaDeHoras = horasTrabalhadasPorJulieta - horasPadraoSemanal;

        //Calcalando o valor de cada hora de trabalho e quanto fica as horas extras com acrescimo de 50%;
        double mediaRecebidaPorHoraNaSemana = valorSemanal / horasPadraoSemanal;
        double valorDaHoraExtra = mediaRecebidaPorHoraNaSemana * 1.5;

        //Verificando se trabalhou o horário padrão ou se fez horas extras, caso tenha feito recebe o equivalente a cada hora a mais trabalhada;
        if(horasTrabalhadasPorJulieta <= horasPadraoSemanal){
            System.out.println("Julieta recebeu essa semana " + valorSemanal);
        }else {
            System.out.println("Julieta recebeu essa semana R$ " + (valorSemanal +  (diferencaDeHoras * valorDaHoraExtra)));
        }
    }
}
