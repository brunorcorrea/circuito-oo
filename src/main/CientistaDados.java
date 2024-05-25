package main;

public class CientistaDados extends Funcionario {
    private static final double BONUS_ANUAL_FIXO = 500.00;
    private static final double PORCENTAGEM_SALARIO_BONUS_ANUAL = 0.1;

    private Integer registroConselhoRegionalCienciaDados;

    public CientistaDados() {
    }

    public CientistaDados(String nome, String cadastroPessoaFisica, String dataNascimento, double salario, Integer registroConselhoRegionalCienciaDados) {
        super(nome, cadastroPessoaFisica, dataNascimento, salario);
        this.registroConselhoRegionalCienciaDados = registroConselhoRegionalCienciaDados;
    }

    @Override
    public double getBonusAnual() {
        return this.getSalario() * PORCENTAGEM_SALARIO_BONUS_ANUAL + BONUS_ANUAL_FIXO;
    }

    @Override
    public void saudacao() {
        System.out.println("Oi cientista de dados, espero que esteja bem!");
    }

    public Integer getRegistroConselhoRegionalCienciaDados() {
        return registroConselhoRegionalCienciaDados;
    }

    public void setRegistroConselhoRegionalCienciaDados(Integer registroConselhoRegionalCienciaDados) {
        this.registroConselhoRegionalCienciaDados = registroConselhoRegionalCienciaDados;
    }
}
