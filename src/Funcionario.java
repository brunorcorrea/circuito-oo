public class Funcionario {
    private String nome;
    private String CPF;
    private String dataNascimento;
    private Double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String CPF, String dataNascimento) {
        this.nome = nome;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
    }

    public Funcionario(String nome, String CPF, String dataNascimento, Double salario) {
        this.nome = nome;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }

    public Double getBonusAnual() {
        return 0.1 * salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public java.lang.Double getSalario() {
        return salario;
    }

    public void setSalario(java.lang.Double salario) {
        this.salario = salario;
    }
}
