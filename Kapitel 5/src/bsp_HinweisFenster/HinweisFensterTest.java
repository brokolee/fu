package bsp_HinweisFenster;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import adhoc5_BaseFrame.BaseFrame;

public class HinweisFensterTest {
    public static void main(String[] args) {
        Frame f = new BaseFrame();
        String[] tips = { "Alles praktisch erproben!", "Nicht verzagen!", "Nachdenken macht schoen!" };

        Button printButton = new Button("print");
        printButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Fernleere?");
            }
        });

        Button tipButton = new Button("tip");
        tipButton.addActionListener(new ActionListener() {
            private HinweisFenster hf = new HinweisFenster(f);
            private int aktIndex = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                hf.setText(tips[aktIndex]);
                hf.setVisible(true);
                aktIndex = (aktIndex + 1) % 3;

            }
        });
        
        Button endButton = new Button("End");
        endButton.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        f.add(printButton, BorderLayout.NORTH);
        f.add(tipButton, BorderLayout.CENTER);
        f.add(endButton, BorderLayout.SOUTH);
        f.setVisible(true);
        
    }
}
