package dio.Heranca_E_Polimorfismo;

public abstract sealed class Colaborador permits Gerente, Vendedor { //as classes que fores extends tem que ser non-sealed , sealed ou final
    private String code;

    private String nome;

    private String endereco;

    private int idade;

    private double salario;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
