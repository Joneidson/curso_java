package Execicios;

import java.util.Scanner;

/*
 * ================================================================
 * Arquivo: Pagamento.java
 * Pacote: Execicios
 * Autor: Joneidson
 * Data de Criação: 30/07/2025
 *
 * Descrição:
 * TODO: Descreva o propósito deste arquivo.
 *
 * Versão: 1.0
 * ================================================================
 */
public class Pagamento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String opcao = "";
        while (!opcao.equalsIgnoreCase("n")) {
            System.out.print("=========================\n");
            System.out.print("   PAGAMENTO DE SALÁRIO \n");
            System.out.print("=========================\n");

            System.out.println("Qual o nome do colaborador?");
            String nome = sc.nextLine();
            System.out.println("Qual o valor da hora de trabalho? ");
            double valorHora = sc.nextDouble();
            sc.nextLine();
            System.out.println("Quantas horas ela trabalhou?");
            double horasTrabalhadas = sc.nextDouble();
            double salario = valorHora * horasTrabalhadas;
            System.out.printf("O salário de %s é de R$: %.2f%n", nome, salario);

            System.out.println("Gostaria de fazer outro calculo de salário ?  (S/N)");
            opcao = sc.next();
            sc.nextLine();

        }
        sc.close();
    }
}
