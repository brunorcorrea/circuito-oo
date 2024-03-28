public class PessoaProgramadora extends Funcionario {
    private Integer crp;

    public PessoaProgramadora(String nome, String CPF, String dataNascimento, double salario, Integer crp) {
        super(nome, CPF, dataNascimento, salario);
        this.crp = crp;
    }

    public Integer getCrp() {
        return crp;
    }

    public void setCrp(Integer crp) {
        this.crp = crp;
    }
}
