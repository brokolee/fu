package bsp_GameOfLife;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WesenButton extends Button implements ActionListener {
    private Welt welt;
    private int lPos;
    private int bPos;
    
    
    public WesenButton(Welt dieWelt, int lPos, int bPos) {
        this.welt = welt;
        this.lPos = lPos;
        this.bPos = bPos;
        setBackground(Color.BLUE);
        addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        welt.getWesen(lPos, bPos).interrupt();

    }


    public void aktualisieren() {
        Wesen wesen = welt.getWesen(lPos, bPos);
        if (wesen instanceof Lebewesen) {
        setBackground(Color.yellow);
        } else {
        setBackground(Color.blue);
        }
        }

}
