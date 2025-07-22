import java.util.Locale;
import java.util.Scanner;

public class Entradados1 {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US); //faz que os separadores sejam alterados de , para . !!
        Scanner sc = new Scanner(System.in); // importa o Scanner para poder fazer os imputs

        String x;// faz uma variavel para entrar o dados!
        System.out.println("Digite algo :");
        x = sc.next(); // responsavel por receber apenas uma estada de espaço, // x = sc.nextLine(); // seria o comando para ler toda a linha com espaços
        System.out.println("Voce digitou: " + x);

        int y;
        System.out.println("Digite um número inteiro; ");
        y = sc.nextInt(); // Diferente do sc.next para string no int fica sc.nextInt();  se apegar as difernças
        System.out.println("Voce digitou: " + y);

        double z;
        System.out.println("Digite um numero decimal ");
        z = sc.nextDouble();

        System.out.println("Voce digitou " + x + " o número : " + y + " e o decimal: " + z + "!!" );

    }
}

