package Exercicios;

import java.util.Scanner;

public class Repeticao {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        // WHILE -- PRECISAR ATENDER CONDI��O PRA EXECUTAR
        /*
        var contador = 1;
        // while simples, conta at� a execucao da condi��o
        while (contador <= 10) {
            System.out.println(contador);
            contador++;
        }

        //while com escolha de parada
        System.out.println("Op��o 1 menu 1\n" +
                "Op��o 2 menu 2\n" +
                "Op��o 3 menu 3\n" +
                "Op��o 0 para sair");


        System.out.println("Digite a op�ao numero: "); // criar menu com while primeiro printa
        int contador = sc.nextInt(); // depois faz o get do valor com sc

        while (contador != 0) {
            if (contador == 1) {
                System.out.println("op�ao 1 do menu");
                System.out.println("Opera��o concluida\n");
            } else if (contador == 2) {
                System.out.println("opcao 2 do menu");
                System.out.println("Opera��o concluida\n");
            } else if (contador == 3) {
                System.out.println("opcao 3 do menu");
                System.out.println("Opera��o concluida\n");
            }else {
                System.out.printf("opcao %d invalida \n", contador);
                System.out.println("Escolha novamente: \n");
            }
            System.out.println("Op��o 1 menu 1\n" + // se quiser colocar para aparecer o menu novamente coloca ele no final
                    "Op��o 2 menu 2\n" +
                    "Op��o 3 menu 3\n" +
                    "Op��o 0 para sair");
            contador = sc.nextInt(); // atualizador de controle de loop
        }
        System.out.println("opcao 0 saindo do menu");
        sc.close(); // toda vez que abrir o scanner, fecha logo ele como boas praticas



        // FOR -- EXECUTA SO OQ TEM DENTRO DA CONDI��O
        for (contador = 1; contador <= 10; contador++ ) {

            System.out.printf(" A contagem � : %d\n", contador);

        }

        System.out.println("At� quanto vc quer que conte?");
         int contador2 = new Scanner(System.in).nextInt();

        for (contador = 1 ; contador <= contador2; contador++ ) {
            System.out.printf(" A contagem � : %d  \n", contador);
        }


        // DO WHILE - PRIMEIRO EXECUTA PRA TER CONDI��O

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
            System.out.println("Escolha uma op��o: ");
            contador = sc.nextInt();


            if (contador == 1) {
                System.out.println("op��o 1\n");
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
                System.out.printf("Op��o %d invalida!\n\n", contador);
            }

        } while (contador != 0);
        */

        int opcao;
        do {
            System.out.println("""
                    ====================
                          MENU CASE
                    ====================
                    1 - Opção 1
                    2 - Opção 2
                    3 - Opção 3
                    0 - Sair
                    
                    Escolha uma op��o:
                    """);
            opcao = sc.nextInt();
            switch (opcao) {
                case 1 -> {
                    String permissao;

                    do {
                        System.out.println("Qual o seu nome: ");
                        String nome = sc.next();

                        if ("admin".equalsIgnoreCase(nome)) {
                            System.out.println("Acesso Especial!");
                        } else {
                            System.out.println("Acesso comum !!");
                        }
                        System.out.println("Trocar acesso ? s/n");
                        permissao = sc.next();
                    } while ("s".equalsIgnoreCase(permissao)); // escrita sempre vem na esquerda para evitar bugs
                }

                case 2 -> System.out.println("Op��o 2\n");

                case 3 -> System.out.println("Op��o 3\n");

                case 0 -> System.out.println("Saindo . . .\n");

                default -> System.out.println("Op��o Invalido\n");
            }

        } while (opcao != 0);


        sc.close();
    }
}
