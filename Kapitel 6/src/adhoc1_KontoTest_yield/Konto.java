package adhoc1_KontoTest_yield;

public class Konto {

    private int saldo;
    
    public Konto(int saldo) {
        this.saldo = saldo;
        
    }

    public void einzahlen(int betrag) {
        int temp = saldo + betrag;
        Thread.yield();
        saldo = temp;
    }
    
    
    public void printSaldo(){
        System.out.println("Saldo" + String.valueOf(saldo));
    }
    
}
