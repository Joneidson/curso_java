import java.util.Scanner;

public class RepeticaoFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Estrutura do for
       /* for (início (executa so uma vez no inicio); condição (exewcuta e volta se for false sai) ; incremento( Executa toda vez de voltar ) ){
               comando 1
               comando 2
          }
       */

        System.out.println("Quantas repetições você vai querer? ");
        int N = sc.nextInt();
        sc.nextLine();
        int soma = 0;

        for (int i=0; i<N; i++){
            System.out.println("Digite um número: " + (i+1) );
            int x = sc.nextInt();
            soma += x;
        }
        System.out.println("o valor total dos números é: " + soma);

        int y ;
        int soma2 = 0;
        do {
            System.out.println("Digite um número:  ( 0 sai da aplicação) !! ");
            y = sc.nextInt();
            soma2 += y;
        }while (y != 0);
        System.out.println("o valor total dos números é: " + soma2);


        sc.close();
    }
}
