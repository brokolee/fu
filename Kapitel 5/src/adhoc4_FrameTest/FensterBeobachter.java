package adhoc4_FrameTest;

import java.awt.Window;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FensterBeobachter implements WindowListener {

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("EVENT: windowOpened!");

    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("EVENT: windowClosing!");
     // Der Cast auf Window ist noetig, weil der
     // Ergebnistyp der Methode getSource der Typ Object ist.
        Window window = (Window) e.getSource();
        window.dispose();

    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("EVENT: windowClosed!");
        System.exit(0);

    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("EVENT: windowIconified!");

    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("EVENT: windowDeiconified!");

    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("EVENT: windowActivated!");

    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("EVENT: windowDeactivated!");

    }

}
