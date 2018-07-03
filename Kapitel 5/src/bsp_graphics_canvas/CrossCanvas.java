package bsp_graphics_canvas;

import java.awt.*;

public class CrossCanvas extends Canvas {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.RED);
        g.drawLine(0, 0, getWidth(), getHeight());
        g.drawLine(0, getHeight(), getWidth(), 0);
    }

}
