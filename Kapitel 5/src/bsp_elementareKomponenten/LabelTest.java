package bsp_elementareKomponenten;

import adhoc5_BaseFrame.*;
import java.awt.*;

public class LabelTest {
    public static void main(String args[]) {
        Frame f = new BaseFrame();
        f.add( new Label("Deutsches Wort fuer Label?") );
        f.setVisible( true );
        }
}
