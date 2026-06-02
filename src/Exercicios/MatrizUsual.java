package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class MatrizUsual {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        int opcao;
        double[][] matriz = null;

        do {
            System.out.println(
                    """
                                    MENU
                                    1 - criação de matriz
                                    0 - sair
                            """
            );
            System.out.print("Digite a opção:");
            switch (opcao = sc.nextInt()) {
                case 1 -> {
                    do {


                        System.out.print("Quantas linhas terá a matriz? ");

                        int linhasMatriz = sc.nextInt();

                        System.out.print("Quantas colunas terá a matriz? ");
                        int colunasMatriz = sc.nextInt();

                        matriz = new double[linhasMatriz][colunasMatriz];

                        for (int linha = 0; linha < matriz.length; linha++) { // linhas do indice

                            for (int coluna = 0; coluna < matriz[linha].length; coluna++) { // colunas do indice

                                System.out.printf(
                                        "Digite valor para [%d , %d]: ",
                                        linha,
                                        coluna
                                );
                                while (!sc.hasNextDouble()) {
                                    System.out.println("""
                                            Digite apenas números!!
                                            """);
                                    System.out.printf(
                                            "Digite valor para [%d , %d]: ",
                                            linha,
                                            coluna
                                    );
                                    sc.next();
                                }

                                matriz[linha][coluna] = sc.nextDouble();
                            }

                        }

                        System.out.println("\nMATRIZ:");

                        for (int linha = 0; linha < matriz.length; linha++) {

                            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {

                                System.out.printf(
                                        "[%d,%d] = %-8.2f",
                                        linha,
                                        coluna,
                                        matriz[linha][coluna]
                                );
                            }

                            System.out.println();
                        }

                        System.out.print("Gostaria de criar outra matriz? s|n  ");
                    } while ("s".equalsIgnoreCase(sc.next()));
                }


                case 0 -> {
                    System.out.println("Saindo . . .");
                }

                default -> System.out.println("Opção invalida!!");
            }


        } while (opcao != 0);

        sc.close();
    }
}
