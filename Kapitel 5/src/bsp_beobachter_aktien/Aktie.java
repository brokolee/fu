package bsp_beobachter_aktien;

import java.util.ArrayList;

public class Aktie {
    private String name;
    private int kursWert;
    private ArrayList<Beobachter> beobachterListe = new ArrayList<Beobachter>();

    Aktie(String name, int kursWert) {
        this.name = name;
        this.kursWert = kursWert;
    }

    public void anmeldenBeobachter(Beobachter beobachter) {
        beobachterListe.add(beobachter);
    }

    public String getName() {
        return name;
    }

    public int getKursWert() {
        return kursWert;
    }

    void setKursWert(int neuerWert) {
        int alterWert = kursWert;
        kursWert = neuerWert > 0 ? neuerWert : 1;
        if (kursWert > alterWert) {
            for (Beobachter beobachter : beobachterListe) {
                beobachter.steigen(this);
            }
        } else if (kursWert < alterWert) {
            for (Beobachter beobachter : beobachterListe) {
                beobachter.fallen(this);
            }
        }
    }
}