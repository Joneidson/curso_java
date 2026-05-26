package Exercicios;

import java.util.Scanner;

public class Repeticao {
    static void main() {
        Scanner sc = new Scanner(System.in);
        // WHILE -- PRECISAR ATENDER CONDIÇÃO PRA EXECUTAR
        /*
        var contador = 1;
        // while simples, conta até a execucao da condição
        while (contador <= 10) {
            System.out.println(contador);
            contador++;
        }

        //while com escolha de parada
        System.out.println("Opção 1 menu 1\n" +
                "Opção 2 menu 2\n" +
                "Opção 3 menu 3\n" +
                "Opção 0 para sair");


        System.out.println("Digite a opçao numero: "); // criar menu com while primeiro printa
        int contador = sc.nextInt(); // depois faz o get do valor com sc

        while (contador != 0) {
            if (contador == 1) {
                System.out.println("opçao 1 do menu");
                System.out.println("Operação concluida\n");
            } else if (contador == 2) {
                System.out.println("opcao 2 do menu");
                System.out.println("Operação concluida\n");
            } else if (contador == 3) {
                System.out.println("opcao 3 do menu");
                System.out.println("Operação concluida\n");
            }else {
                System.out.printf("opcao %d invalida \n", contador);
                System.out.println("Escolha novamente: \n");
            }
            System.out.println("Opção 1 menu 1\n" + // se quiser colocar para aparecer o menu novamente coloca ele no final
                    "Opção 2 menu 2\n" +
                    "Opção 3 menu 3\n" +
                    "Opção 0 para sair");
            contador = sc.nextInt(); // atualizador de controle de loop
        }
        System.out.println("opcao 0 saindo do menu");
        sc.close(); // toda vez que abrir o scanner, fecha logo ele como boas praticas



        // FOR -- EXECUTA SO OQ TEM DENTRO DA CONDIÇÃO
        for (contador = 1; contador <= 10; contador++ ) {

            System.out.printf(" A contagem é : %d\n", contador);

        }

        System.out.println("Até quanto vc quer que conte?");
         int contador2 = new Scanner(System.in).nextInt();

        for (contador = 1 ; contador <= contador2; contador++ ) {
            System.out.printf(" A contagem é : %d  \n", contador);
        }
        */

        // DO WHILE - PRIMEIRO EXECUTA PRA TER CONDIÇÃO

        int contador;
        do {
            System.out.println("""
                    menu 1
                    \nmenu 2
                    \nmenu 3
                    \nmenu 4
                    \nmenu 5
                    \n0 para sair"""

            );
            System.out.println("Escolha uma opção: ");
            contador = sc.nextInt();


            if (contador == 1) {
                System.out.println("opção 1\n");
            } else if (contador == 2) {
                System.out.println("opcao 2\n");
            } else if (contador == 3) {
                System.out.println("opcao 3\n");
            } else if (contador == 4) {
                System.out.println("opcao 4\n");
            } else if (contador == 5) {
                System.out.println("opcao 5\n");
            } else if (contador == 0) {
                System.out.println("Saindo . . .");
                break;
            } else {
                System.out.printf("Opção %d invalida!\n\n", contador);
            }

        } while (contador != 0);
        sc.close();
    }
}
