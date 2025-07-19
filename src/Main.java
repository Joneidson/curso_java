import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // faz que os separadores saim de , para . !!
        String nome = "victor";
        int idade = 28;
        String cidade = "Salvador-Ba";
        double x = 13.35784;
        double renda = 4500.00;
        // Aula 1
        System.out.printf("Olá, seja bem-vindo!!%n");
        System.out.println("Inicio de uma nova jornada, aprendendo Java!!");
        System.out.printf("Eu sou %s e tenho %d anos de idade sou de %s", nome, idade, cidade);
        System.out.println("\n\n");


        // Aula 6 - Tipos de saida de dados em Java
        System.out.println("O valor de x é:" + x + " metros");
        System.out.printf("O valor de x: %.2f metros%n",x);//para usar o format estilo concanetação a string que vem depois do valor tem que ficar dentro do format!!
        System.out.printf("%.2f%n", x); //formatação de ponto flutuante com duas casas decimais e o uso de %n para pular linha tem que ser dentro da formatação!
        System.out.printf("Eu sou %s tenho %d anos e ganho %.2f reais%n", nome, idade,renda);


    }
}