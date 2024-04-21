public class Pinguim extends AveMarinha implements Cantavel {

    private Pinguim conjuge;

    @Override
    public void canta() {
        System.out.println("Pinguim cantando!");
    }

    public Pinguim getConjuge() {
        return conjuge;
    }

    public void setConjuge(Pinguim conjuge) {
        this.conjuge = conjuge;
    }
}
