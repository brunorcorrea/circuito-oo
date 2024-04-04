public class Pinguim extends AveMarinha {

    private Pinguim conjuge;

    public Pinguim() {
    }

    public Pinguim(String nome, double peso) {
        super(nome, peso);
    }

    public Pinguim getConjuge() {
        return conjuge;
    }

    public void setConjuge(Pinguim conjuge) {
        this.conjuge = conjuge;
    }
}
