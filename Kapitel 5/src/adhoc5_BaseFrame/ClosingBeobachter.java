package adhoc5_BaseFrame;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ClosingBeobachter extends WindowAdapter {
    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

}
