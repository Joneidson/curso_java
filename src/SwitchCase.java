import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String continuar = "";

        while (!continuar.equals("N")) {
            System.out.println("\n=============== MENU ===============");
            System.out.println("1 - Pizza  2 - Hambúrguer  3 - Salada");
            System.out.print("Escolha sua opção: ");
            int opcao = sc.nextInt();
            sc.nextLine(); // limpa o buffer

            switch (opcao) {
                case 1: {
                    System.out.print("Escolha o tamanho da pizza (P, M ou G): ");
                    String tamanho = sc.nextLine().toUpperCase();
                    double precoPizza = switch (tamanho) {
                        case "P" -> 20.00;
                        case "M" -> 30.00;
                        case "G" -> 40.00;
                        default -> {
                            System.out.println("Tamanho inválido.");
                            yield 0.0;
                        }
                    };

                    if (precoPizza == 0.0) break;

                    System.out.print("Deseja refrigerante? (S/N): ");
                    String desejaRefri = sc.nextLine().toUpperCase();
                    double precoRefri = 0;
                    String tamanhoRefri = "";

                    if (desejaRefri.equals("S")) {
                        System.out.print("Escolha o tamanho do refrigerante (P, M, G): ");
                        tamanhoRefri = sc.nextLine().toUpperCase();

                        precoRefri = switch (tamanhoRefri) {
                            case "P" -> 5.00;
                            case "M" -> 7.00;
                            case "G" -> 10.00;
                            default -> {
                                System.out.println("Tamanho de refrigerante inválido.");
                                yield 0.0;
                            }
                        };

                        if (precoRefri == 0.0) break;
                    }

                    double total = precoPizza + precoRefri;
                    System.out.printf("Você escolheu: Pizza tamanho %s%n", tamanho);
                    if (!tamanhoRefri.isEmpty()) {
                        System.out.printf("Refrigerante tamanho %s: R$ %.2f%n", tamanhoRefri, precoRefri);
                    }
                    System.out.printf("Total a pagar: R$ %.2f%n", total);
                    System.out.println("Bom apetite!");
                    break;
                }

                case 2: {
                    System.out.println("Você escolheu: Hambúrguer");
                    System.out.println("Preço: R$ 20.00");
                    System.out.println("Aproveite sua refeição!");
                    break;
                }

                case 3: {
                    System.out.println("Você escolheu: Salada");
                    System.out.println("Preço: R$ 18.00");
                    System.out.println("Comida saudável é sempre uma boa escolha!");
                    break;
                }

                default:
                    System.out.println("Opção inválida.");
            }


            System.out.print("\nDeseja fazer um novo pedido? (S/N): ");
            continuar = sc.nextLine().toUpperCase();

        }

        System.out.println("Obrigado, até a próxima!");
        sc.close();
    }
}
