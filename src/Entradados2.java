import java.util.Locale;
import java.util.Scanner;

public class Entradados2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int x;
        String S1,S2,S3;


        System.out.println("Digite um número inteiro: ");
        x = sc.nextInt();
        sc.nextLine(); //PULO DO GATO!! TODA VEZ QUE VC FIZER UM NEXTlINE COM OUTRO COMANDO TEM QUE FAZER UM NEXT EXTRA, POIS NA QUEBRA DE LINHA FAZ O CONSUMO!!
        System.out.println("Digite a primeira frase: ");
        S1 = sc.nextLine();
        System.out.println("Digite a segunda frase: ");
        S2 = sc.nextLine();
        System.out.println("Digite a terceira frase");
        S3 = sc.nextLine();
        System.out.println("Você digitou na primeira frase : " + S1 + " Segunda frase : " + S2 + " Terceira Frase: " + S3 + "!!");
        System.out.println("\n");
        System.out.println("Dados digitados");
        System.out.println("Numero inteiro :" + x);
        System.out.println("Frase 1: " + S1);
        System.out.println("Frase 2: " + S2);
        System.out.println("Frase 3: " + S3);
    sc.close(); // Boa pratica muito importante !!
    }
}
