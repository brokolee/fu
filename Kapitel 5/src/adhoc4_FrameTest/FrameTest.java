package adhoc4_FrameTest;

import java.awt.*;

public class FrameTest {

    public static void main(String args[]) {
        Frame f = new Frame();

        f.setSize(300, 400);
        //f.setLocation(100, 100);
        f.setLocationRelativeTo(null);
        f.addWindowListener(new FensterBeobachter());

        f.setVisible(true);

    }
};