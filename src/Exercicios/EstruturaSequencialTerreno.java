package Exercicios;

import java.util.Scanner;
/*
 *  ██████╗  █████╗ ██╗   ██╗ ██████╗██╗   ██╗██╗      ██████╗
 *  ██╔══██╗██╔══██╗██║   ██║██╔════╝██║   ██║██║     ██╔═══██╗
 *  ██████╔╝███████║██║   ██║██║     ██║   ██║██║     ██║   ██║
 *  ██╔═══╝ ██╔══██║╚██╗ ██╔╝██║     ██║   ██║██║     ██║   ██║
 *  ██║     ██║  ██║ ╚████╔╝ ╚██████╗╚██████╔╝███████╗╚██████╔╝
 *  ╚═╝     ╚═╝  ╚═╝  ╚═══╝   ╚═════╝ ╚═════╝ ╚══════╝ ╚═════╝
 *
 *  Projeto: Cálculo de Área de Terreno
 *  Autor: Joneidson
 *  Data: 28/07/2025
 *
 *  Descrição:
 *  Este programa solicita ao usuário a largura, comprimento
 *  e valor do metro quadrado de um terreno, e calcula:
 *    - A área total (m²)
 *    - O valor total do terreno
 *
 *  Permite repetir o processo várias vezes.
 *  Ideal para praticar lógica e estruturas básicas em Java.
 *
 *  🚧 Projeto em fase de aprendizado.
 */

public class EstruturaSequencialTerreno {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String resposta;
        System.out.println("===========================================");
        System.out.println("         CÁLCULO DE ÁREA DE TERRENO        ");
        System.out.println("===========================================");
        System.out.println("Digite os valores conforme solicitado.");
        System.out.println("Para sair, responda 'N' quando perguntado.");
        System.out.println("===========================================\n");

        do {
            System.out.println("Programa para calcular área e valor total");
            System.out.print("Digite a largura do terreno: ");
            double largura = sc.nextDouble();
            System.out.print("Digite o comprimento do terreno: ");
            double comprimento = sc.nextDouble();
            System.out.print("Digite o valor do metro quadrado: ");
            double valorMetroQuadrado = sc.nextDouble();
            sc.nextLine();

            double area = largura * comprimento;
            double preco = area * valorMetroQuadrado;

            System.out.printf("A area do terreno é %.2f%n", area);
            System.out.printf("O valor total é: %.2f%n", preco);

            System.out.println("Gostaria de calcular novamente? (S/N)");
            resposta = sc.nextLine();

        }while (resposta.equalsIgnoreCase("S"));

            sc.close();

    }
}
