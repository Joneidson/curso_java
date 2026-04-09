import java.util.Scanner;


/*
Entendendo Exceptions
try - onde o erro pode acontecer
catch -  captura o erro e mostra aonde ele esta
finally - "Executa sempre com erro ou sem erro" - mensagem final do programa
throw - serve para mostrar uma msg manual criada pelo programador
throws - é a declaração onde nao impede nada, so avisa que pode ocorrer algo de erra, e fica a obrigação do usuario usar ou nao
*/

public class Exceptions {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        try {
            System.out.println("Digite sua idade: ");
            var idade = scanner.nextInt();
            System.out.printf("Sua idade é: %d ", idade);
        } catch ( Exception e ) {
            System.out.println("Voce fez algo de errado :( ");
        }

    }
}
