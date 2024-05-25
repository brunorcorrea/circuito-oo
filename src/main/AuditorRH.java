package main;

public class AuditorRH implements Autenticavel {

    private Integer id;
    private String senha;

    public boolean autentica (String senha) {
        return this.senha.equals(senha);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
