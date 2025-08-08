package application;

import java.util.Locale;
import java.util.Scanner;

/*
 * ================================================================
 * Arquivo: NumerosPAres.java
 * Pacote: application
 * Autor: Joneidson
 * Data de Criação: 31/07/2025
 *
 * Descrição:
 *1) Desafio da estrutura for
 * Escreva um programa que solicita 10 números para o usuário e imprime na saída a soma
 * dos números digitados.
 * Permita que o usuário digite apenas números pares. Caso um número ímpar seja informado,
 * ignore e solicite um novo número ao usuário.
 * Versão: 1.0
 * ================================================================
 */

public class NumerosPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int contador = 10;
        double soma = 0;

        for (int i = 0; i <= contador; ) {
            System.out.println("Digite um valor par: ");
            int numero = sc.nextInt();

            if (numero % 2 == 0) {
                soma += numero;
                System.out.println("número add");
                i++;
            } else {
                System.out.println("Add um número valido");
            }


        }
        System.out.printf("A soma dos números pares é: %.2f ", soma);

        sc.close();

    }
    
}