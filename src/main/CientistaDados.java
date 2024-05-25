package main;

public class CientistaDados extends Funcionario {
    private Integer crcd;

    public CientistaDados() {
    }

    public CientistaDados(String nome, String CPF, String dataNascimento, double salario, Integer crcd) {
        super(nome, CPF, dataNascimento, salario);
        this.crcd = crcd;
    }

    @Override
    public double getBonusAnual() {
        return this.getSalario() * 0.1 + 500.00;
    }

    @Override
    public void saudacao() {
        System.out.println("Oi cientista de dados, espero que esteja bem!");
    }

    public Integer getCrcd() {
        return crcd;
    }

    public void setCrcd(Integer crcd) {
        this.crcd = crcd;
    }
}
