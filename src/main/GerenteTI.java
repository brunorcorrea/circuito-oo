package main;

public class GerenteTI extends Funcionario implements Autenticavel {
    private Integer numFuncionarios;
    private String ramal;
    private String senha;

    public GerenteTI(String nome, String CPF, String dataNascimento, double salario, Integer numFuncionarios, String ramal, String senha) {
        super(nome, CPF, dataNascimento, salario);
        this.numFuncionarios = numFuncionarios;
        this.ramal = ramal;
        this.senha = senha;
    }

    public boolean autentica (String senha) {
        return this.senha.equals(senha);
    }

    @Override
    public double getBonusAnual() {
        return (super.getSalario()*0.1) * this.getNumFuncionarios();
    }

    @Override
    public void saudacao() {
        System.out.println("Hello IT Manager, how are you?!");
    }

    public Integer getNumFuncionarios() {
        return numFuncionarios;
    }

    public void setNumFuncionarios(Integer numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }

    public String getRamal() {
        return ramal;
    }

    public void setRamal(String ramal) {
        this.ramal = ramal;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
