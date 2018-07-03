package bsp_beobachter_aktien;

public class Boerse {
    public static void main(String argv[]) {
        Aktie vw = new Aktie("VW", 354);
        Aktie bmw = new Aktie("BMW", 548);
        Beobachter silke = new Beobachter() {
            private boolean besitzt;

            @Override
            public void fallen(Aktie aktie) {
                if (aktie.getKursWert() < 300 && !besitzt) {
                    System.out.println("Silke: Kauf von " + aktie.getName());
                    besitzt = true;
                }
            }

            @Override
            public void steigen(Aktie aktie) {
                if (aktie.getKursWert() > 400 && besitzt) {
                    System.out.println("Silke: Verkauf von " + aktie.getName());
                    besitzt = false;
                }
            }
        };
        vw.anmeldenBeobachter(silke);
        Beobachter georg = new Beobachter() {
            private int maximum = 0;

            @Override
            public void steigen(Aktie a) {
                if (a.getKursWert() > maximum) {
                    maximum = a.getKursWert();
                    System.out.println("Georg: Neues Maximum " + a.getName() + ": " + maximum);
                }
            }

            @Override
            public void fallen(Aktie a) {
            }
        };
        vw.anmeldenBeobachter(georg);
        bmw.anmeldenBeobachter(georg);
        while (true) {
            System.out.print("VW: " + vw.getKursWert());
            System.out.println("\t\tBMW: " + bmw.getKursWert());
            vw.setKursWert(vw.getKursWert() + (int) Math.round(Math.random() * 10) - 5);
            bmw.setKursWert(bmw.getKursWert() + (int) Math.round(Math.random() * 10) - 5);
        }
    }
}