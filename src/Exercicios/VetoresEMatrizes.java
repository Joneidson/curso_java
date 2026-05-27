package Exercicios;

import java.util.Scanner;


public class VetoresEMatrizes {

    public static void main(String[] args) {
        int[] notas = new int[4];
        Scanner sc = new Scanner(System.in);
        String opcao;
        do {

            notas[0] = 10;
            notas[1] = 20;
            notas[2] = 30;
            notas[3] = 40;


            for (int i = 0; i < notas.length; i++) {
                System.out.println(i + " : " + notas[i]);
            }

            int[][] m = {

                    {2, 4},

                    {6, 8}

            };

            for (int linha = 0; linha < m.length; linha++) { // for de fora é linha

                for (int coluna = 0; coluna < m[linha].length; coluna++) { // for de dentro é coluna

                    System.out.print(m[linha][coluna] + " ");

                }

                System.out.println();

            }


            System.out.println("""
                    Digite a quantidade de linhas:
                    """);

            int qtdLinhas = sc.nextInt();

            System.out.println("""
                    Digite a quantidade de colunas:
                    """);

            int qtdColunas = sc.nextInt();

            int[][] matriz = new int[qtdLinhas][qtdColunas];

            int valor = 1;

            for (int linha = 0; linha < matriz.length; linha++) {

                for (int coluna = 0; coluna < matriz[linha].length; coluna++) {

                    matriz[linha][coluna] = valor;

                    System.out.print(matriz[linha][coluna] + " ");

                    valor++;
                }

                System.out.println();
            }

            System.out.println("Gostaria de fazer outra? s/n");
            opcao = sc.next();
        } while ("s".equalsIgnoreCase(opcao));
        sc.close();
    }

}

