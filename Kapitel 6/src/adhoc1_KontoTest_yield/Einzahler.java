package adhoc1_KontoTest_yield;

public class Einzahler extends Thread {
    
    private Konto konto;
    private int betrag;

    public Einzahler(Konto konto, int betrag) {
        this.betrag = betrag;
        this.konto = konto;
    }

    @Override
    public void run() {
        konto.einzahlen(betrag);
    }

}
