package dio;

import java.util.Scanner;

public class VerificarEquals {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            String linha = sc.nextLine( );
            if (linha.equals( "START" ) || linha.equals( "RESTART" ) || linha.equals( "STOP" )) {
                System.out.println("Command accepted");
            }else  {
                System.out.println("Command rejected");
            }
        sc.close( );
    }
}
