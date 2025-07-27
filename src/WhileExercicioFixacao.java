import java.util.Scanner;

public class ExercicioFixacaoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 0;
        System.out.print("Digite um numero para x até 50:");
        x = sc.nextInt();
        System.out.print("Digite um valor para y até 100:");
        y = sc.nextInt();

        while (x<50 && y<100) {
            y += 2;
            x += 1;
            System.out.println(x + " -- " + y);
        }

        sc.close();
    }

}
