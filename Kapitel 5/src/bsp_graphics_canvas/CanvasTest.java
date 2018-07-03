package bsp_graphics_canvas;

import java.awt.Frame;

import adhoc5_BaseFrame.BaseFrame;

public class CanvasTest {
    public static void main(String[] args) {
        Frame f = new BaseFrame();
        f.add(new CrossCanvas());
        f.setVisible(true);
        
    }
}
