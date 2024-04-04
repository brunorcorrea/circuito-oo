public abstract class Passaro extends Ave {

    public Passaro() {
    }

    public Passaro(String nome, double peso) {
        super(nome, peso);
    }

    public void voa() {
        System.out.println("Eu consigo voaaaarr");
    }

    public abstract void canta();
}
