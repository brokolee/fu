package bsp_GameOfLife;

import java.awt.GridLayout;
import java.awt.Panel;

public class Oberflaeche extends BaseFrame {
    Welt dieWelt;
    Panel p;
    
    public Oberflaeche(Welt dieWelt) {
        this.dieWelt = dieWelt;
        p = new Panel();
        p.setLayout(new GridLayout(dieWelt.MXG, dieWelt.MXG));
        for (int lPos = 0; lPos < dieWelt.MXG; lPos++) {
            for (int bPos = 0; bPos < dieWelt.MXG; bPos++) {
                p.add(new WesenButton(dieWelt, lPos, bPos));
            }
        }
        add(p);
        setVisible(true);
    }
    
    


    public void aktualisieren(int lPos, int bPos) {
       System.out.println("lPos * dieWelt.MXG + bPos = " + lPos * dieWelt.MXG + bPos);
        WesenButton wesenButton = (WesenButton) p.getComponent(lPos * dieWelt.MXG + bPos);
       
       wesenButton.aktualisieren();
       repaint();
        
    }

}
