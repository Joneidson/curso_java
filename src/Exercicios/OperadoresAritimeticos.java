package Exercicios;

import java.util.Scanner;
/*
%d → número inteiro
%f → número decimal
%s → texto
*/
public class OperadoresAritimeticos {
    public  static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro valor: ");
        var primeiroValor = scanner.nextInt();
        System.out.println("Informe o segundo valor: ");
        var segundoValor = scanner.nextInt();
        var value = primeiroValor - segundoValor;
        System.out.printf("%d - %d = %d%n", primeiroValor, segundoValor, value);
        System.out.printf("O resultado é: %d%n", value);

    }
}
