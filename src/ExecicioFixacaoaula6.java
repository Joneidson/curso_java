import java.util.Locale;

public class ExecicioFixacaoaula6 {
    // Aula 6 - Tipos de saida de dados em Java
    // Relembrar que todo inicio tem que ter o public satatic void main(String[] args) !!
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        String produto1 = "Computador";
        String produto2 = "office desk";
        int age = 28;
        int code = 5290;
        char gender = 'F';
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        // não esquecer que a formatção é = %.5f ou %.5f%n com quebra de linha
        System.out.println("Products:");
        System.out.printf("Computador esta no preço de %.2f%n", price1);
        System.out.printf("Mesa de escritotio esta com o preço de %.2f%n",price2);
        System.out.println();
        System.out.printf("Recorde: %d anos com o cod %d e o genero %s%n", age, code,gender);
        System.out.println();
        System.out.printf("Medida com oito casas decimais %.8f%n", measure);
        System.out.printf("Medida com três casas decimais %.3f%n", measure);

    }
}
