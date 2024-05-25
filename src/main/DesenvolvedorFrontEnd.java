package main;

public class DesenvolvedorFrontEnd extends Funcionario {
    private static final double PORCENTAGEM_SALARIO_BONUS_ANUAL = 0.15;
    
    private Integer registroConselhoRegionalProgramacaoWeb;

    public DesenvolvedorFrontEnd(String nome, String cadastroPessoaFisica, String dataNascimento, double salario, Integer registroConselhoRegionalProgramacaoWeb) {
        super(nome, cadastroPessoaFisica, dataNascimento, salario);
        this.registroConselhoRegionalProgramacaoWeb = registroConselhoRegionalProgramacaoWeb;
    }

    public Integer getRegistroConselhoRegionalProgramacaoWeb() {
        return registroConselhoRegionalProgramacaoWeb;
    }

    public void setRegistroConselhoRegionalProgramacaoWeb(Integer registroConselhoRegionalProgramacaoWeb) {
        this.registroConselhoRegionalProgramacaoWeb = registroConselhoRegionalProgramacaoWeb;
    }

    @Override
    public double getBonusAnual() {
        return this.getSalario() * PORCENTAGEM_SALARIO_BONUS_ANUAL;
    }

    @Override
    public void saudacao() {
        System.out.println("Bem vindo Dev Front End!");
    }
}
