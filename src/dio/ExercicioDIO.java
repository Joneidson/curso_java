package dio;

import java.util.Scanner;


public class ExercicioDIO{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       if (sc.hasNext()){
        String linha = sc.nextLine( );
        String[] partes = linha.split(" ");
        if (partes.length == 2) {
            String name = partes[0];
            int age = Integer.parseInt(partes[1]);

            if (!name.isEmpty() && age >= 18) {
                System.out.println("Cadastro Aprovado");
            }else {
                System.out.println("Cadastro reprovado");
            }
        }else {
            System.out.println("Cadastro reprovado");
        }

       }
        sc.close( );
    }
}