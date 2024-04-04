public class Ave {
    private String nome;
    private double peso;

    public Ave() {
    }

    public Ave(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public void pia() {
        System.out.println("MIAUUUUUUUUUU");
    }

    public void anda() {
        System.out.println("Toc toc toc toc");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
