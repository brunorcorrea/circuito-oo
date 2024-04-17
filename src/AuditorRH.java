public class AuditorRH implements Autenticavel {

    private Integer id;
    private String senha;

    public boolean autentica (String senha) {
        return this.senha.equals(senha);
    }
}
