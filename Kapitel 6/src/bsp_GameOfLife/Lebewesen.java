package bsp_GameOfLife;

public class Lebewesen extends Wesen {
    Lebewesen(Welt dieWelt, int lPos, int bPos) {
        super(dieWelt, lPos, bPos);
    }

    @Override
    protected boolean istHandelnNoetig() {
        int i = dieWelt.anzahlNachbarn(lPos, bPos);
        return (i < 2) || (3 < i);
    }

    @Override
    protected void handeln() {
        Wesen w = new Leerwesen(dieWelt, lPos, bPos);
        dieWelt.setWesen(lPos, bPos, w);
        w.start();
    }
}
