import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondiciconal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // Define separador decimal como ponto
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();// Aqui como não tem nenhum next na frente não precisa colocar mais uma função sc.next

        System.out.println("Digite sua idade:");
        int idade = sc.nextInt();

        System.out.println("Digite sua renda:");
        double renda = sc.nextDouble();

        // Verificação de aprovação
        if (renda <= 300.00 && idade >= 18) {
            System.out.printf("Olá, %s! Seu benefício será liberado em até 60 dias.%n", nome);
        } else {
            System.out.printf("Desculpe, %s. Você não atende aos critérios do programa:%n", nome);
            if (renda >= 300.00) {
                System.out.printf("- Sua renda é de R$%.2f (limite: R$300.00).%n", renda); // Quando for utilizar o Double use o %.2f pois assim consgueler INT e DOUBLE;
            }
            if (idade < 18) {
                System.out.printf("- Sua idade é %d anos (mínimo exigido: 18 anos).%n", idade);
            }
        }

        sc.close();
    }
}
