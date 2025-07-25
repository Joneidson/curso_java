import java.util.Locale;
import java.util.Scanner;

public class ExercicioHabilitacao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("=".repeat(30));
        System.out.println("  Autorização de Retirada de Habilitação  ");
        System.out.println("=".repeat(30));

        System.out.print("Olá, qual é o seu nome? ");
        String nome = sc.nextLine();

        System.out.printf("Qual foi o ano do seu nascimento, %s? ", nome);
        int anoNascimento = sc.nextInt();
        sc.nextLine(); // Limpar o buffer do scanner para evitar bug

                         System.out.print("Foi aprovado(a) no exame médico? (sim ou não): ");
        String exameMedico = sc.nextLine();

        System.out.print("Foi aprovado(a) no exame psicológico? (sim ou não): ");
        String examePsicologico = sc.nextLine();

        boolean permissaoHabilitacao = true;
        int anoAtual = 2025;
        int idade = anoAtual - anoNascimento;

        if (idade < 18) {
            permissaoHabilitacao = false;
            System.out.println("Infelizmente você ainda não tem idade suficiente para dirigir.");
        }

        if (!exameMedico.equalsIgnoreCase("sim") || !examePsicologico.equalsIgnoreCase("sim")) {
            permissaoHabilitacao = false;
            System.out.println("Você precisa ser aprovado(a) nos dois exames para ter permissão para dirigir.");
        }

        if (permissaoHabilitacao) {
            System.out.printf("Parabéns, %s! Você concluiu todas as etapas para retirar sua habilitação.%n", nome);
        }

        sc.close();
    }
}
