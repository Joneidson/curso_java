package dio.ExercicioBanco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var operacao = new Operacoes();

        int opcao;
        do {
            System.out.println("""
                    
                    ===== BANCO =====
                    1 - Consultar saldo
                    2 - Consultar cheque especial
                    3 - Depositar
                    4 - Sacar
                    5 - Pagar boleto
                    0 - Sair
                    Qual a opcao você deseja:
                    """);


            opcao = sc.nextInt();

            switch (opcao) {
                    case 1:
                        operacao.consultarSaldo();
                    break;

                    case 2:
                        operacao.consultarChequeEspecial();
                    break;

                    case 3:
                        operacao.depositarDinheiro();
                    break;

                    case 4:
                        operacao.sacarDinheiro();
                    break;

                    case 5:
                        operacao.pagarBoleto();
                    break;

                default:
                    System.out.println("Opcao invalida");
            }

        } while (opcao != 0);

        sc.close();
    }
}
