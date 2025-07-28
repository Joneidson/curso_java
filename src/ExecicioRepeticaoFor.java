import java.util.Scanner;

public class ExecicioRepeticaoFor {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas repetições você gostaria ?");
        int N = sc.nextInt();
        sc.nextLine();
        int soma = 0;
        int x =0;
        for (int i=0; i<N; i++){
            System.out.print(i+ ",");
            x += 5;
            System.out.println(x);
        }
        sc.close();
    }
}
