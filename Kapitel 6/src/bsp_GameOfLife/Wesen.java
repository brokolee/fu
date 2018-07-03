package bsp_GameOfLife;

import java.util.Random;

public abstract class Wesen extends Thread {

    private static Random random = new Random();

    protected Welt dieWelt;
    protected int lPos;
    protected int bPos;

    public Wesen(Welt dieWelt, int lPos, int bPos) {
        this.dieWelt = dieWelt;
        this.lPos = lPos;
        this.bPos = bPos;

    }

    @Override
    public void run() {
        do {
            try {
                sleep(random.nextInt(5000));
            } catch (InterruptedException ie) {
                interrupt();
            }
        } while (!istHandelnNoetig() && !interrupted()); // (+)
        handeln();
    }

    protected abstract void handeln();

    protected abstract boolean istHandelnNoetig();

}
