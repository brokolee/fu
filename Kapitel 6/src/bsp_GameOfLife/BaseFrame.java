package bsp_GameOfLife;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BaseFrame extends Frame {
    
    public BaseFrame() {

        // closingBeobachter als anonyme Klasse da nur innerhalb des Konstruktors von BaseFrame verwendet
        addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setSize(300, 400);
        setLocationRelativeTo(null);
    }

}
