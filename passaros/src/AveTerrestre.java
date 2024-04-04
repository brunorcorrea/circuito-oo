public abstract class AveTerrestre extends Ave {

    public AveTerrestre() {
    }

    public AveTerrestre(String nome, double peso) {
        super(nome, peso);
    }

    public void corre() {
        System.out.println("RUNNNNNNNNNN");
    }
}
