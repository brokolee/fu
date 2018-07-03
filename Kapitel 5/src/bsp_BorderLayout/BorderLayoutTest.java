package bsp_BorderLayout;

import java.awt.*;

import adhoc5_BaseFrame.BaseFrame;

public class BorderLayoutTest {
public static void main(String[] args) {
    Frame f = new BaseFrame();
    f.add(new Button("Center"), BorderLayout.CENTER);
    f.add(new Button("North"), BorderLayout.NORTH);
    f.add(new Button("South"), BorderLayout.SOUTH);
    f.add(new Button("West"), BorderLayout.WEST);
    f.add(new Button("East"), BorderLayout.EAST);
    f.setVisible(true);
}
}
