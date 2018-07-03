package bsp_WindowAdapter;

import java.awt.*;

public class ButtonTest2 {

    public static void main(String[] args) {
        Frame f = new Frame();
        f.setLayout(new FlowLayout());
        ProgrammExitAction exitAction = new ProgrammExitAction();
        
        f.addWindowListener(exitAction);
        
        Button exitButton = new Button("Exit!");
        exitButton.addActionListener(exitAction);
        f.add(exitButton);
        
        f.setSize(300, 400);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
    
}
