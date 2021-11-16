package aula05;

public class Cliente {

        private int numeroCLiente;
        private String nome;
        private double divida;

        public Cliente(int numero, String nome){
            this.numeroCLiente = numero;
            this.nome =  nome;
            this.divida = 0;
        }

        public  void aumentarDivida( double valor){
            this.divida += valor;
            System.out.println("Sua divida agora é de: " + this.divida);
        }

        public void pagarDivida(double valor){
            if(this.divida == 0)
                System.out.println("Você não tem divida!");
            else
                this.divida -= valor;
        }

        public String getNome(){
            return nome;
        }

        public double getDivida() {
            return divida;
        }

        public int getNumeroCLiente(){
            return numeroCLiente;
        }
}

