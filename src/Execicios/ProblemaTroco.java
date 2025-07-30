package Execicios;

import java.util.Scanner;

/*
 * ================================================================
 * Arquivo: ProblemaTroco.java
 * Pacote: Execicios
 * Autor: Joneidson
 * Data de Criação: 30/07/2025
 *
 * Descrição:
 * Fazer um programa para calcular o troco no processo de pagamento de um produto de uma mercearia.
O programa deve ler o preço unitário do produto, a quantidade de unidades compradas deste produto,
e o valor em dinheiro dado pelo cliente (suponha que haja dinheiro suficiente). Seu programa deve
mostrar o valor do troco a ser devolvido ao cliente.
 *
 * Versão: 1.0
 * ================================================================
 */
public class ProblemaTroco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int opcao = -1;
        double soma = 0;
        double totalProduto = 0;
        do {

            while (opcao != 0) {
                System.out.print("Quantidade de produto: \n");
                int quantidade = sc.nextInt();
                System.out.print("Preço do produto:\n");
                double preco = sc.nextDouble();
                totalProduto = quantidade * preco;
                soma += totalProduto;
                System.out.println("Gostaria de fazer outro calculo ? (1 para add mais produto / 0 sai da aplicação )");
                opcao = sc.nextInt();



            }
            System.out.printf("Valor total é de R$: %.2f ", soma);
            System.out.println("Valor recebido em dinheiro ?");
            double dinheiro = sc.nextDouble();
            double troco = dinheiro - soma;
            System.out.printf("O troco é de:%.2f ", troco);

        } while (opcao != 0);

        System.out.println("obrigado pela compra");
        sc.close();

    }
}