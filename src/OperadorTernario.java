import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o seu nome? ");
        String nome = sc.nextLine();

        System.out.print("Qual a sua função? ");
        String funcao = sc.nextLine();

        if (funcao.equalsIgnoreCase("ADMIN")) {
            System.out.print("Digite a senha de administrador: ");
            int senha = sc.nextInt();
            sc.nextLine();

            String mensagem = (senha == 1234)
                    ? "Acesso permitido. Bem-Vindo, administrador " + nome + "!"
                    : "Acesso negado" ;
            System.out.println(mensagem);
        }
        else {
            System.out.println("Sejá Bem-Vindo" +funcao+ " " + nome + "!");
        }
        sc.close();

    }
}