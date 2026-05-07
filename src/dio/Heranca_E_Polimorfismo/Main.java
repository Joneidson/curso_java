package dio.Heranca_E_Polimorfismo;

public class Main {
    public static void main(String[] args) {
        /*Colaborador colaborador = new Colaborador(); nao pode mais ser estanciada porque virou ‘abstract’, ela agora so serve como base extends
        Gerente gerente = new Gerente();
        Colaborador gerente = new Gerente();

        gerente.setNome("Victor");
        gerente.setLogin("victor");
        gerente.setSenha("123456");

        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Login : " + gerente.getLogin());
        System.out.println("Senha : " + gerente.getSenha());
        */
        printColaborador(new Gerente());
        printColaborador(new Vendedor());

    }

    public static void printColaborador(Colaborador colaborador) { // O Polimorfismo REAL ESTÁ AQUI

        if (colaborador instanceof Gerente gerente) {
            colaborador.setNome("Victor");
            ((Gerente) colaborador).setLogin("victor"); // fazendo conversão de colaborador para gerente, exemplo de DOWNCAST
            gerente.setSenha("123456"); // forma mais usual do java moderno, pois no if ele já cria a variável fazendo a descontinuação da conversão de Colaborador para gerente -> Pattern Matching for instanceof
            gerente.setSalario(5000);

            System.out.printf("=======%s=======\n", colaborador.getClass().getCanonicalName());
            System.out.println("Nome: " + colaborador.getNome());
            System.out.println("Login : " + gerente.getLogin());
            System.out.println("senha : " + gerente.getSenha());
            System.out.println("==============");
        }
        if (colaborador instanceof Vendedor vendedor) {
            vendedor.setNome("Anne");
            vendedor.setSalario(4500);

            System.out.printf("=======%s=======\n", colaborador.getClass().getCanonicalName());
            System.out.println("Nome: " + colaborador.getNome());
            System.out.println("Salario : " + vendedor.getSalario());
            System.out.println("==============");
        }
    }


}
