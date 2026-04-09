import java.util.Scanner;


/*
Entendendo Exceptions
try - onde o erro pode acontecer
catch -  captura o erro e mostra aonde ele esta
finally - "Executa sempre com erro ou sem erro" - mensagem final do programa
throw - serve para mostrar uma msg de exceção manual criada pelo programador
throws - é a declaração onde nao impede nada, so avisa que pode ocorrer algo de erra, e fica a obrigação do usuario usar ou nao


public class Exceptions {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        try {
            System.out.println("Digite sua idade: ");
            var idade = scanner.nextInt();
            System.out.printf("Sua idade é: %d %n", idade);
        } catch ( Exception e ) {
            System.out.println("Voce fez algo de errado :( ");
        } finally{
            System.out.println("Finalizando o programa.");
        }

    }
}

*/

public static void main(String[] args) {
    var scanner = new Scanner(System.in);

    System.out.println("Digite o primeiro nº:  ");
    var value1 = scanner.nextInt();
    System.out.println("Digite o segundo n°:  ");
    var value2 = scanner.nextInt();
    System.out.println("Digite o numero por qual sera dividido: ");
    var dividido = scanner.nextInt();


    try {
        if (dividido < 0) {
            throw new IllegalArgumentException("Número negativo");
        }
        var total = value1 + value2;
        var total2 = total / dividido;
        System.out.printf("O valor da soma é: %d%n", total);
        System.out.printf("O valor da divisão é: %d\n", total2);
    } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
    }catch(ArithmeticException e) { // como eu ja sei qual o tipo de erro é melhor ja deixar caso nao saiba deixa so o exception
        System.out.println("Nao foi possível realizar a operação, nao pode dividir por zero");
    }finally {
        System.out.println("Repetindo a operação");
    }
}