package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int opcao;

        // matriz começa vazia
        double[][] matriz = null;

        do {

            System.out.println("""
                    
                    MENU
                    1 - Criação de matriz
                    2 - Listar matriz
                    3 - Buscar valor da matriz
                    4 - Alterar valor da matriz
                    0 - Sair
                    """);
            System.out.print("Escolha uma opcao: ");
            opcao = sc.nextInt();

            switch (opcao) {

                // =========================
                // CRIAR MATRIZ
                // =========================
                case 1 -> {
                    do {

                        System.out.print("Quantas linhas terá a matriz? ");
                        int linhas = sc.nextInt();

                        System.out.print("Quantas colunas terá a matriz? ");
                        int colunas = sc.nextInt();

                        // criação da matriz
                        matriz = new double[linhas][colunas];

                        // preencher matriz
                        for (int linha = 0; linha < matriz.length; linha++) {

                            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {

                                System.out.printf(
                                        "Digite valor para [%d][%d]: ",
                                        linha,
                                        coluna
                                );

                                while (!sc.hasNextDouble()) {

                                    System.out.println("Digite apenas números!");

                                    sc.next();

                                    System.out.printf(
                                            "Digite valor para [%d][%d]: ",
                                            linha,
                                            coluna
                                    );
                                }

                                matriz[linha][coluna] = sc.nextDouble();
                            }
                        }

                        System.out.println("Matriz criada com sucesso!");

                        System.out.println("Gostaria de criar outra matiz? (s|n)");
                        

                    } while ("s".equalsIgnoreCase(sc.next()));

                }
                // =========================
                // LISTAR MATRIZ
                // =========================
                case 2 -> {
                    do {

                        if (matriz != null) {

                            System.out.println("\nMATRIZ:");

                            for (int linha = 0; linha < matriz.length; linha++) {

                                for (int coluna = 0; coluna < matriz[linha].length; coluna++) {

                                    System.out.printf(
                                            "[%d][%d] = %-8.2f",
                                            linha,
                                            coluna,
                                            matriz[linha][coluna]
                                    );
                                }

                                System.out.println();
                            }

                        } else {

                            System.out.println("Nenhuma matriz criada!");
                        }

                        System.out.println("Gostaria de fazer listagem de matriz? (s|n)  ");
                    } while ("s".equalsIgnoreCase(sc.next()));
                }

                // =========================
                // BUSCAR VALOR
                // =========================
                case 3 -> {
                    do {
                        if (matriz != null) {

                            System.out.print("Digite a linha: ");
                            int linha = sc.nextInt();

                            System.out.print("Digite a coluna: ");
                            int coluna = sc.nextInt();

                            // verifica se posição existe
                            if (linha >= 0 &&
                                    linha < matriz.length &&
                                    coluna >= 0 &&
                                    coluna < matriz[linha].length) {

                                System.out.printf(
                                        "Valor em [%d][%d] = %.2f%n",
                                        linha,
                                        coluna,
                                        matriz[linha][coluna]
                                );

                            } else {

                                System.out.println("Posição inválida!");
                            }

                        } else {

                            System.out.println("Nenhuma matriz criada!");
                        }
                        System.out.println("Gostaria de fazer outra busca? s|n  ");
                    } while ("s".equalsIgnoreCase(sc.next()));
                }

                // =========================
                // ALTERAR VALOR
                // =========================
                case 4 -> {

                    if (matriz != null) {
                        do {
                            System.out.print("Digite a linha: ");
                            int linha = sc.nextInt();

                            System.out.print("Digite a coluna: ");
                            int coluna = sc.nextInt();

                            // verifica se posição existe
                            if (linha >= 0 &&
                                    linha < matriz.length &&
                                    coluna >= 0 &&
                                    coluna < matriz[linha].length) {

                                System.out.printf(
                                        "Valor atual = %.2f%n",
                                        matriz[linha][coluna]
                                );

                                System.out.print("Novo valor: ");

                                while (!sc.hasNextDouble()) {

                                    System.out.println("Digite apenas números!");
                                    sc.next();
                                }

                                matriz[linha][coluna] = sc.nextDouble();

                                System.out.println("Valor alterado com sucesso!");

                            } else {

                                System.out.println("Posição inválida!");
                            }
                            System.out.print("Gostaria de fazer outra alteração? s|n  ");
                        } while ("s".equalsIgnoreCase(sc.next()));
                    } else {

                        System.out.println("Nenhuma matriz criada!");
                    }
                }

                // =========================
                // SAIR
                // =========================
                case 0 -> {
                    System.out.println("Saindo...");
                }

                // =========================
                // OPÇÃO INVÁLIDA
                // =========================
                default -> {
                    System.out.println("Opção inválida!");
                }
            }

        } while (opcao != 0);

        sc.close();
    }
}