package bsp_WindowAdapter;

import java.awt.event.*;


public class ProgrammExitAction extends WindowAdapter implements ActionListener {

    //fängt die eingehenden Events ab!
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("actionPerformed!");
        exitProgramm();
        
    }

    @Override
    public void windowClosing(WindowEvent e){
        System.out.println("windowClosing!");
        exitProgramm();
    }
    
    public void exitProgramm() {
        //beliebig komplexer Code!
        System.exit(0);
    }
    
}
