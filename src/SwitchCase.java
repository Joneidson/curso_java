import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=============== MENU ===============");
        System.out.println("1 - Pizza  2 - Hambúrguer  3 - Salada");
        System.out.print("Escolha sua opção: ");
        int opcao = sc.nextInt();
        sc.nextLine(); // Limpa o buffer

        switch (opcao) {

            case 1: {
                String prato = "Pizza";
                System.out.print("Escolha o tamanho da pizza (P, M ou G): ");
                String tamanho = sc.nextLine().toUpperCase();
                double precoPizza = 0;

                switch (tamanho) {
                    case "P":
                        precoPizza = 20.00;
                        break;
                    case "M":
                        precoPizza = 30.00;
                        break;
                    case "G":
                        precoPizza = 40.00;
                        break;
                    default:
                        System.out.println("Tamanho de pizza inválido.");
                        sc.close();
                        return;
                }

                // Novo bloco: opção de refrigerante
                System.out.print("Deseja refrigerante? (S/N): ");
                String desejaRefri = sc.nextLine().toUpperCase();
                double precoRefri = 0;
                String tamanhoRefri = "";

                if (desejaRefri.equals("S")) {
                    System.out.print("Escolha o tamanho do refrigerante (P = 200ml, M = 450ml, G = 1L): ");
                    tamanhoRefri = sc.nextLine().toUpperCase();

                    switch (tamanhoRefri) {
                        case "P":
                            precoRefri = 5.00;
                            break;
                        case "M":
                            precoRefri = 7.00;
                            break;
                        case "G":
                            precoRefri = 10.00;
                            break;
                        default:
                            System.out.println("Tamanho de refrigerante inválido.");
                            sc.close();
                            return;
                    }
                }

                // Exibição do pedido
                System.out.printf("Você escolheu: Pizza tamanho %s%n", tamanho);
                System.out.printf("Preço da pizza: R$ %.2f%n", precoPizza);

                if (!tamanhoRefri.isEmpty()) {
                    System.out.printf("Refrigerante tamanho %s: R$ %.2f%n", tamanhoRefri, precoRefri);
                }

                double total = precoPizza + precoRefri;
                System.out.printf("Total a pagar: R$ %.2f%n", total);
                System.out.println("Bom apetite!");
                break;
            }

            case 2: {
                String prato = "Hambúrguer";
                double preco = 20.00;
                System.out.println("Você escolheu: " + prato);
                System.out.println("Preço: R$ " + preco);
                System.out.println("Aproveite sua refeição!");
                break;
            }

            case 3: {
                String prato = "Salada";
                double preco = 18.00;
                System.out.println("Você escolheu: " + prato);
                System.out.println("Preço: R$ " + preco);
                System.out.println("Comida saudável é sempre uma boa escolha!");
                break;
            }

            default: {
                System.out.println("Opção inválida. Por favor, escolha de 1 a 3.");
                break;
            }
        }

        sc.close();
    }
}
