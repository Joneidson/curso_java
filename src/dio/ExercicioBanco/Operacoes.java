package dio.ExercicioBanco;

public class Operacoes {
    private Conta conta;


    public void consultarSaldo() {
        if (this.conta == null) {
            System.out.println("Conta nao inicializada");
            return;
        }
        System.out.printf("O saldo da conta é de :R$ %.2f%n", this.conta.getSaldoConta());
        System.out.printf("O limite do Cheque Especial é de:R$ %.2f%n", this.conta.getChequeEspecial());
    }

    public void consultarChequeEspecial() {
        if (this.conta == null) {
            System.out.println("Conta nao inicializada");
            return;
        }
        double taxa = conta.getValorUsadoChequeEspecial() * 0.20;
        double totalDivida = conta.getValorUsadoChequeEspecial() + taxa;
        double chequeDisponivel = conta.getChequeEspecial() - conta.getValorUsadoChequeEspecial();
        System.out.println("===".repeat(5));
        System.out.println("Limite total: R$" + conta.getChequeEspecial());
        System.out.println("Limite usado: R$" + conta.getValorUsadoChequeEspecial());
        System.out.println("limite disponível: R$" + chequeDisponivel);
        System.out.println("Taxa: R$" + taxa);
        System.out.println("Total: R$" + totalDivida);
        System.out.println("===".repeat(5));
    }

    public void depositarDinheiro() {
        if (this.conta == null) {
            System.out.println("Conta nao inicializada");
            return;
        }


    }

    public void sacarDinheiro() {

    }

    public void pagarBoleto() {

    }


}
