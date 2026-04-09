package Exercicios;

import java.time.OffsetDateTime;
import java.util.Scanner;

public class ExercicioFundamentosJava1 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var baseYear = OffsetDateTime.now().getYear(); // pega o ano do sistema
        System.out.println("Olá, qual o seu nome?");
        var nome = scanner.nextLine();
        System.out.println("Qual ano voce nasceu?");
        var idade = scanner.nextInt();
        System.out.printf("Olá, %s, você tem %s anos de idade!! %n", nome, idade);

        System.out.printf("%s , me informe o valor do lado A: %n", nome);
        var valorA = scanner.nextDouble();
        System.out.printf("Agora me informe o valor do lado B: %n");
        var valorB = scanner.nextDouble();
        var area = valorA * valorB;
        System.out.printf("O valor da Area é de: %s %n", area);

        scanner.nextLine();

        System.out.println("Informe outro nome: ");
        var nome2 = scanner.nextLine();
        System.out.printf("Qual a idade de %s: %n", nome2);
        var idade2 = scanner.nextInt();
        var idade3 = idade - idade2;
        System.out.printf("A diferença de idade é de: %s %n", idade3);


    }
}
