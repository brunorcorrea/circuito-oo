public class GerenteTI extends Funcionario {
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

    public boolean autentica (String CPF, String senha) {
        boolean isPasswordValid = this.senha.equals(senha);
        boolean isCPFValid = CPF.trim().length() == 11;
        return isPasswordValid && isCPFValid;
    }

    @Override
    public double getBonusAnual() {
        return (super.getSalario()*0.1) * this.getNumFuncionarios();
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
