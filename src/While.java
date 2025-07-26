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