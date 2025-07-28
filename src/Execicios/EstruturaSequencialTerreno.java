package Execicios;

import java.util.Scanner;

public class EstruturaSequencialTerreno {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String resposta;

        do {
            System.out.println("Digite a largura do terreno: ");
            double largura = sc.nextDouble();
            System.out.println("Digite o comprimento do terreno: ");
            double comprimento = sc.nextDouble();
            System.out.println("Digite o valor do metro quadrado: ");
            double valorMetroQuadrado = sc.nextDouble();
            sc.nextLine();

            double area = largura * comprimento;
            double preco = area * valorMetroQuadrado;

            System.out.printf("A area do terreno é %.2f%n", area);
            System.out.printf("O valor total é: %.2f%n", preco);

            System.out.println("Gostaria de calcular novamente? (S/N)");
            resposta = sc.nextLine();

        }while (resposta.equalsIgnoreCase("S"));

            sc.close();

    }
}
