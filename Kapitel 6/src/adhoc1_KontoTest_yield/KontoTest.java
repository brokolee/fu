package adhoc1_KontoTest_yield;

public class KontoTest {
    public static void main(String[] args) throws InterruptedException {
        Konto konto = new Konto(1000);
        Thread A = new Einzahler(konto, 2000);
        Thread B = new Einzahler(konto, 4000);
        A.start();
        B.start();
        A.join(); // Main-Thread wartet auf Beendigung von A
        B.join(); // Main-Thread wartet auf Beendigung von B
        konto.printSaldo(); // Main-Thread gibt Kontostand aus
    }

}
