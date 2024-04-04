public class Papagaio extends Passaro {

    public Papagaio() {
    }

    public Papagaio(String nome, double peso) {
        super(nome, peso);
    }

    public void fala() {
        System.out.println("piu piu piu piu");
    }

    public void canta() {
        System.out.println("Porque você me deixou ó magrelinhuuu");
    }
}
