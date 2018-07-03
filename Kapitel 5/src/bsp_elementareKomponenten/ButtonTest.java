package bsp_elementareKomponenten;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import adhoc5_BaseFrame.BaseFrame;

public class ButtonTest {
    public static void main(String args[]) {

        Frame f = new BaseFrame();

        f.setLayout(new FlowLayout());
        
        Button exitButton = new Button("Programm beenden");
        
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        f.add(exitButton);
        f.setVisible(true);
    }
}
