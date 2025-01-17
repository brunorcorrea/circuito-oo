public class DevFrontEnd extends Funcionario {
    private Integer crpw;

    public DevFrontEnd(String nome, String CPF, String dataNascimento, double salario, Integer crpw) {
        super(nome, CPF, dataNascimento, salario);
        this.crpw = crpw;
    }

    public Integer getCrpw() {
        return crpw;
    }

    public void setCrpw(Integer crpw) {
        this.crpw = crpw;
    }

    @Override
    public double getBonusAnual() {
        return this.getSalario() * 0.15;
    }

    @Override
    public void saudacao() {
        System.out.println("Bem vindo Dev Front End!");
    }
}
