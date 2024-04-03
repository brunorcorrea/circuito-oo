public class DevFrontEnd extends PessoaProgramadora {
    private Integer crpw;

    public DevFrontEnd(String nome, String CPF, String dataNascimento, double salario, Integer crp, Integer crpw) {
        super(nome, CPF, dataNascimento, salario, crp);
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
