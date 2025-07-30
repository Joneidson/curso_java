package Execicios;

/*
 * ================================================================
 * Arquivo: While.java
 * Pacote: Execicios
 * Autor: Joneidson
 * Data de Criação: 29/07/2025
 *
 * Descrição:
 * TODO: Descreva o propósito deste arquivo.
 *
 * Versão: 1.0
 * ================================================================
 */

import java.util.Scanner;

public class While {
    public static void main(String[] args) { // atalho PSVM
        Scanner sc = new Scanner(System.in); // cria o leitor
        String senha = ""; // variável senha começa vazia

        // enquanto a senha digitada for diferente de "exit", continua pedindo
        while (!senha.equals("exit")) {
            System.out.print("Digite a senha (digite 'exit' para sair): ");
            senha = sc.nextLine(); // lê a próxima linha digitada
            System.out.println("Você digitou: " + senha); // mostra o que foi digitado
        }

        do {
            System.out.print("Digite a senha (digite 'exit' para sair): ");
            senha = sc.nextLine();
        }while (!senha.equals("exit"));
        System.out.println("Programa encerrado.");


    }
}
