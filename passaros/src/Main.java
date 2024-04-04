public class Main {

    public static void main(String[] args) {

        Pinguim pinguim = new Pinguim();
        pinguim.anda();
        pinguim.nada();

        Avestruz avestruz = new Avestruz();
        avestruz.anda();
        avestruz.corre();
        avestruz.camufla();

        BeijaFlor beijaFlor = new BeijaFlor();
        beijaFlor.anda();
        beijaFlor.voa();
        beijaFlor.canta();
        beijaFlor.voaPraTras();

        Papagaio papagaio = new Papagaio();
        papagaio.anda();
        papagaio.voa();
        papagaio.canta();
        papagaio.fala();
    }
}