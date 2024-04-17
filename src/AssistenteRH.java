public class AssistenteRH extends Funcionario implements Autenticavel {

    private Integer id;
    private String senha;

    public boolean autentica (String senha) {
        return this.senha.equals(senha);
    }

    @Override
    public double getBonusAnual() {
        return 0;
    }

    @Override
    public void saudacao() {

    }
}
