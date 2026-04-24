package dio.ExercicioBanco;

public class Conta {
    // variáveis

    private double saldoConta; // mostrar valor que tem real na conta
    private double chequeEspecial; // variável de controle para fazer as funções do cheque especial
    private double valorUsadoChequeEspecial = 0; // variável para mostrar o saldo utilizado ou não do cheque especial

    public Conta(double depositoInicial) { // ja cria uma varialvel para fazer o controle
        this.saldoConta = depositoInicial;
        if (depositoInicial <= 500) {
            this.chequeEspecial = 50;
        } else {
            this.chequeEspecial = depositoInicial * 0.50;
        }
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public double getValorUsadoChequeEspecial() {
        return valorUsadoChequeEspecial;
    }

    public void setValorUsadoChequeEspecial(double valorUsadoChequeEspecial) {
        this.valorUsadoChequeEspecial = valorUsadoChequeEspecial;
    }


}
