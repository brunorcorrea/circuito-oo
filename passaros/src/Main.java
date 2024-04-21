import java.util.List;

public class Main {

    public static void main(String[] args) {

        Avestruz avestruz = new Avestruz();
        BeijaFlor beijaFlor = new BeijaFlor();
        Grilo grilo = new Grilo();
        Papagaio papagaio = new Papagaio();
        Pinguim pinguim = new Pinguim();
        List<Animal> animais = List.of(avestruz, beijaFlor, grilo, papagaio, pinguim);

        for (Animal animal : animais) {
            System.out.println("\n== " + animal.getClass().getSimpleName() + " ==");

            if(animal instanceof Ave ave) {
                ave.anda();
                ave.pia();
            }

            if(animal instanceof AveMarinha aveMarinha) {
                aveMarinha.nada();
            }

            if(animal instanceof AveTerrestre aveTerrestre) {
                aveTerrestre.corre();
            }

            if(animal instanceof Passaro passaro) {
                passaro.voa();
            }

            if(animal instanceof Avestruz avestruz1) {
                avestruz1.camufla();
            }

            if(animal instanceof BeijaFlor beijaFlor1) {
                beijaFlor1.voaPraTras();
            }

            if(animal instanceof Papagaio papagaio1) {
                papagaio1.fala();
            }

            if (animal instanceof Cantavel cantavel) {
                cantavel.canta();
            }
        }
    }
}