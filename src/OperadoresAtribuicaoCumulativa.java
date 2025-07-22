import java.util.Locale;
import java.util.Scanner;

/*
Aula - Operadores de atribuição cumulativa
| 🧮 Operador | ✍️ Significado                      | 🔁 Equivalência Completa |
| ----------- | ----------------------------------- | ------------------------ |
| a += b    | Soma e atribui                      | a = a + b              |
| a -= b    | Subtrai e atribui                   | a = a - b              |
| a *= b    | Multiplica e atribui                | a = a * b              |
| a /= b    | Divide e atribui                    | a = a / b              |
| a %= b    | Módulo (resto da divisão) e atribui | a = a % b              |
*/

public class OperadoresAtribuicaoCumulativa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("=".repeat(30));
        System.out.println("Validador de Direito ao PIS");
        System.out.println("=".repeat(30));

        // Entradas
        System.out.print("Quantos anos você está cadastrado no PIS? ");
        int anosDeCadastro = sc.nextInt();

        System.out.print("Quantos dias você trabalhou com carteira assinada no ano-base? ");
        int diasTrabalhados = sc.nextInt();

        System.out.print("Qual foi sua média salarial mensal no ano-base (em R$)? ");
        double salarioMensal = sc.nextDouble();

        System.out.print("Informe o valor do salário mínimo atual (em R$): ");
        double salarioMinimo = sc.nextDouble();

        // Critérios de validação
        boolean direitoAoPIS = true;
        // Critério 1: tempo de cadastro no PIS
        if (anosDeCadastro < 5) {
            System.out.println("❌ Você precisa ter pelo menos 5 anos de cadastro no PIS.");
            direitoAoPIS = false;
        }
        // Critério 2: dias trabalhados
        if (diasTrabalhados < 30) {
            System.out.println("❌ Você precisa ter trabalhado pelo menos 30 dias com carteira assinada no ano-base.");
            direitoAoPIS = false;
        }
        // Critério 3: salário médio mensal
        double limiteSalarial = salarioMinimo * 2; // operador *= poderia ser usado em outro contexto
        if (salarioMensal > limiteSalarial) {
            System.out.printf("❌ Sua média salarial excede 2 salários mínimos (limite: R$ %.2f).%n", limiteSalarial);
            direitoAoPIS = false;
        }
        System.out.println("=".repeat(30));
        // Resultado final
        if (direitoAoPIS) {
            System.out.println("🥳Parabéns! Você tem direito ao PIS.");
        } else {
            System.out.println("Infelizmente, você NÃO tem direito ao PIS com base nas informações fornecidas.");
        }
        System.out.println("=".repeat(30));

        sc.close();
    }
}
