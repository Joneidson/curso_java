import java.util.Locale;
import java.util.Scanner;
/*
Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito a 100 minutos de telefone.
Cada minuto que exceder a franquia de 100 minutos custa R$ 2.00.
Fazer um programa para ler a quantidade de minutos que uma pessoa consumiu, daí mostrar o valor a ser pago.
*/
public class ExecicioCondicionais {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // alter de , para .
        Scanner sc = new Scanner(System.in);
        // Título
        System.out.println("=".repeat(20));
        System.out.println("Cálculo de Fatura");
        System.out.println("=".repeat(20));
        // Variáveis
        double PlanoBasicoMinuto = 100;
        double PlanoBasicoValor = 50.00;
        double MinutoExtraValor = 2.00;
        double MinutosConsumidos;
        double ValorExtra = 0;
        double FaturaTotal = PlanoBasicoValor;
        double MinutoExtra = 0;
        String nome;
        // Entrada de dados
        System.out.print("Olá, digite seu nome para prosseguirmos: ");
        nome = sc.nextLine();

        System.out.print("Olá " + nome + ", quantos minutos você consumiu? ");
        MinutosConsumidos = sc.nextDouble();
        // Lógica condicional
        if (MinutosConsumidos <= PlanoBasicoMinuto) {
            System.out.println("Você está dentro do plano de 100 minutos.");
            System.out.printf("Valor total da fatura: R$ %.2f%n", PlanoBasicoValor);
        } else {
            MinutoExtra = MinutosConsumidos - PlanoBasicoMinuto;
            ValorExtra = MinutoExtra * MinutoExtraValor;
            FaturaTotal = PlanoBasicoValor + ValorExtra;

            System.out.println("Você consumiu " + (int)MinutoExtra + " minutos extras.");
            System.out.printf("Valor dos minutos extras: R$ %.2f%n", ValorExtra);
            System.out.printf("Valor total da fatura: R$ %.2f%n", FaturaTotal);
        }

        sc.close();
    }
}
