package Execicios;

import java.util.Scanner;

/*
 * ================================================================
 * Arquivo: idade.java
 * Pacote: Execicios
 * Autor: Joneidson
 * Data de Criação: 28/07/2025
 *
 * Descrição:
 * Saber a medida de idades de pessoas.
 *
 * Versão: 1.0
 * ================================================================
 */
public class Idade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=======================");
        System.out.println("    MEDIA DE IDADES");
        System.out.println("=======================");


        int x = sc.nextInt();


        while (x != 0) {
            System.out.println("Digite um valor");
            x = sc.nextInt();
        }
        sc.close();

        /*String saida;
        do {
            System.out.print("Quantas pessoas fara o calculo de idade: ");
            int quantidadePessoas = sc.nextInt();
            sc.nextLine();
            int idadetotal = 0;
            int media;
            System.out.println("=======================");
            for (int i = 1; i <= quantidadePessoas; i++) {
                System.out.println("Qual a idade da pessoa: ");
                int idade = sc.nextInt();
                idadetotal += idade;
                media = idadetotal / quantidadePessoas;
            }
            media = idadetotal / quantidadePessoas;
            System.out.println("A media da idade é :" + media + " anos");
            System.out.println("=======================");
            System.out.println("Gostaria de sair? (S/N)");
            saida = sc.next();
        }while (!saida.equalsIgnoreCase("S"));*/

    }
}
