package Execicios;

import java.util.Scanner;

/*
 * ================================================================
 * Arquivo: DeducaoImposto.java
 * Pacote: Execicios
 * Autor: Joneidson
 * Data de Criação: 30/07/2025
 *
 * Descrição:
 * Calcula o imposto anual com base em salário, prestação de serviços e ganho de capital.
 * Permite dedução de até 30% do imposto com gastos médicos e educacionais.
 *
 * Versão: 1.0
 * ================================================================
 */

public class DeducaoImposto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String continuar = "S";
        while (continuar.equalsIgnoreCase("S")) {

            System.out.print("=========================\n");
            System.out.print("   DEDUÇÃO DE IMPOSTO \n");
            System.out.print("=========================\n");

            System.out.print("Qual foi a sua renda anual com salário? ");
            double rendaSalario = sc.nextDouble();
            double salarioMensal = rendaSalario / 12;

            double impostoSalario = 0;
            if (salarioMensal < 3000) {
                System.out.println("Você está isento de imposto sobre salário.");
            } else if (salarioMensal < 5000) {
                impostoSalario = rendaSalario * 0.10;
                System.out.println("Você pagará 10% sobre o salário.");
            } else {
                impostoSalario = rendaSalario * 0.20;
                System.out.println("Você pagará 20% sobre o salário.");
            }

            System.out.print("Quanto faturou de prestação de serviços no ano? ");
            double prestacaoServico = sc.nextDouble();
            double impostoPrestacao = prestacaoServico * 0.15;

            System.out.print("Quanto faturou de ganho de capital no ano? ");
            double ganhoCapital = sc.nextDouble();
            double impostoCapital = ganhoCapital * 0.20;

            // Gastos dedutíveis
            System.out.print("Gastos médicos no ano: ");
            double gastosMedicos = sc.nextDouble();

            System.out.print("Gastos educacionais no ano: ");
            double gastosEducacionais = sc.nextDouble();

            double impostoBruto = impostoSalario + impostoPrestacao + impostoCapital;
            double totalGastosDedutiveis = gastosMedicos + gastosEducacionais;
            double maximoDedutivel = impostoBruto * 0.30;

            double abatimento = Math.min(totalGastosDedutiveis, maximoDedutivel);
            double impostoFinal = impostoBruto - abatimento;

            // Relatório
            System.out.println("\n==========================");
            System.out.println("   RELATÓRIO DE IMPOSTO");
            System.out.println("==========================");
            System.out.printf("Imposto sobre salário:%f é de R$ %.2f%n",rendaSalario, impostoSalario);
            System.out.printf("Imposto sobre prestação de serviço:%f é de R$ %.2f%n",prestacaoServico, impostoPrestacao);
            System.out.printf("Imposto sobre ganho de capital:%f é de R$ %.2f%n",ganhoCapital, impostoCapital);

            System.out.println("\n==========================");
            System.out.println("          DEDUÇÃO");
            System.out.println("==========================");
            System.out.printf("Máximo dedutível: R$ %.2f%n", maximoDedutivel);
            System.out.printf("Gastos dedutíveis: R$ %.2f%n", totalGastosDedutiveis);
            System.out.printf("Abatimento aplicado: R$ %.2f%n", abatimento);

            System.out.println("\n==========================");
            System.out.println("          RESUMO");
            System.out.println("==========================");
            System.out.printf("Imposto bruto total: R$ %.2f%n", impostoBruto);
            System.out.printf("Imposto final a pagar: R$ %.2f%n", impostoFinal);

            System.out.print("\nGostaria de fazer uma nova consulta? (S/N): ");
            continuar = sc.next();
        }

        sc.close();
    }
}
