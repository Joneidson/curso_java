import java.util.Scanner;

public class OperadoresBitwise {
    public  static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Digite um numero que vc queira saber o valor binario: ");
        var valueBinario = sc.nextInt();
        var binary3 = Integer.toBinaryString(valueBinario);
        System.out.printf("O valor Binariso de %s, é %s %n", valueBinario, binary3);
        var value1 = 6;
        var binary1 = Integer.toBinaryString(value1);
        System.out.printf("Primeiro n° da operação %s (representação binária %s)%n", value1, binary1);
        var value2 = 5;
        var binary2 = Integer.toBinaryString(value2);
        System.out.printf("Segundo n° da operação %s (representação binaria %s)%n", value2, binary2);
        System.out.printf("%s | %s = %s%n", value1, value2, value1 | value2);
    }
}
