package bsp_elementareKomponenten;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import adhoc5_BaseFrame.BaseFrame;

public class TextFieldTest {
    public static void main(String args[]) {
        Frame f = new BaseFrame();
        f.setLayout(new FlowLayout());
        TextField tf = new TextField("", 20);
        tf.setEditable(true);
        tf.addActionListener(new ActionListener() {
           
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = ((TextField) e.getSource()).getText();
                if (text.equals("quit")) {
                    System.exit(0);
                }
            }
        });
        f.add(tf);
        f.add(new Button("foo"), BorderLayout.SOUTH);
        f.setVisible(true);
    }
}