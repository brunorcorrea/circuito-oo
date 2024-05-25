package main;

public abstract class Funcionario {
    private String nome;
    private String cadastroPessoaFisica;
    private String dataNascimento;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String cadastroPessoaFisica, String dataNascimento) {
        this.nome = nome;
        this.cadastroPessoaFisica = cadastroPessoaFisica;
        this.dataNascimento = dataNascimento;
    }

    public Funcionario(String nome, String cadastroPessoaFisica, String dataNascimento, double salario) {
        this.nome = nome;
        this.cadastroPessoaFisica = cadastroPessoaFisica;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }

    public abstract double getBonusAnual();

    public abstract void saudacao();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCadastroPessoaFisica() {
        return cadastroPessoaFisica;
    }

    public void setCadastroPessoaFisica(String cadastroPessoaFisica) {
        this.cadastroPessoaFisica = cadastroPessoaFisica;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
