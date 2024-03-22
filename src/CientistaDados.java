public class CientistaDados extends Funcionario {
    private Integer crcd;

    public CientistaDados(String nome, String CPF, String dataNascimento, Double salario, Integer crcd) {
        super(nome, CPF, dataNascimento, salario);
        this.crcd = crcd;
    }

    @Override
    public Double getBonusAnual() {
        return super.getBonusAnual() + 500.00;
    }

    public Integer getCrcd() {
        return crcd;
    }

    public void setCrcd(Integer crcd) {
        this.crcd = crcd;
    }
}
