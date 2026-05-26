package Exercicios;

public class ContaBancariaImutavel {

    // classe imutável - com attributes final e sem 'setters'
    private final long numeroConta;
    private final long saldo;
    private final String titular;


    // construtor iniciado tudo da forma certa, (Important =  quando for fazer um constructor e um método ambos devem seguir a mesma dinâmica de envios de dados se não crash)
    public ContaBancariaImutavel(String titular, long saldo, long numeroConta) {
        this.titular = titular;
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }


    public long getNumeroConta() {
        return numeroConta;
    }

    public long getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    // método abertura de conta - foi criado uma variável valor dentro da condição
    public ContaBancariaImutavel aberturaConta() {
        return new ContaBancariaImutavel( // imutabilidade gerar NOVO estado e não altera os dados
                this.titular,
                this.saldo,
                this.numeroConta);
    }

    // método depositar
    public ContaBancariaImutavel depositar(long valor) {
        if (valor > 0) {
            return new ContaBancariaImutavel(this.titular, this.saldo + valor, this.numeroConta);

        } else {
            return this;
        }
    }

    public ContaBancariaImutavel sacar(long valor) {
        /*
           Regra de negócio:
           - valor precisa ser maior que 0
           - saldo precisa ser suficiente
         */

        if (valor <= 0 || this.saldo < valor) {
            System.out.println("Valor invalido");
            return this;
        } else {
            return new ContaBancariaImutavel(
                    this.titular,
                    this.saldo - valor,
                    this.numeroConta);
        }
    }

}
