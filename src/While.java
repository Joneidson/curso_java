import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        int x;

        System.out.print("Digite um número (0 para sair): ");
        x = sc.nextInt();

        while (x != 0) {
            soma += x;
            System.out.print("Digite um número (0 para sair): ");
            x = sc.nextInt();
        }

        System.out.println("Soma total: " + soma);
        sc.close();
    }
}

/*
char resp = 's';

while (resp != 'n') {
        System.out.print("Digite a temperatura em Celsius: ");
double C = sc.nextDouble();
double F = 9.0 * C / 5.0 + 32.0;
    System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
    System.out.print("Deseja repetir (s/n)? ");
resp = sc.next().charAt(0);
}
*/