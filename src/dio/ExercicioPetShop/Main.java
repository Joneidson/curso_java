package dio.ExercicioPetShop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var sc = new Scanner(System.in);
        var maquina = new PetMachine();

        int opcao;

        do {
            System.out.println("\n" + "===".repeat(6));
            System.out.println("MÁQUINA DE BANHO");
            System.out.println("===".repeat(6));

            System.out.println("""
                1 - Dar banho no pet
                2 - Abastecer água
                3 - Abastecer shampoo
                4 - Ver nível de água
                5 - Ver nível de shampoo
                6 - Ver se tem pet
                7 - Colocar pet
                8 - Remover pet
                9 - Limpar máquina
                10 - Status
                0 - Sair
            \n Escolha uma opcao: """);

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    maquina.darBanho();
                    break;

                case 2:
                    maquina.addAgua();
                    break;

                case 3:
                    maquina.addShampoo();
                    break;

                case 4:
                    System.out.println("Água: " + maquina.getAgua());
                    break;

                case 5:
                    System.out.println("Shampoo: " + maquina.getShampoo());
                    break;

                case 6:
                    System.out.println(maquina.temPet() ? "Tem pet" : "Não tem pet");
                    break;

                case 7:
                    System.out.print("Digite o nome do pet: ");
                    String nome = sc.next();
                    maquina.setPet(new Pet(nome));
                    break;

                case 8:
                    maquina.removerPet();
                    break;

                case 9:
                    maquina.limparMaquina();
                    break;

                case 10:
                    maquina.status();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 0);

        sc.close();
    }
}
