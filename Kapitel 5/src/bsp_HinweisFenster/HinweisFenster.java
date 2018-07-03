package bsp_HinweisFenster;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Mit Dialogfenstern kann man die Eingabe an anderen Fenstern blockieren. Der Zugang zu deren Bedien- und
 * Eingabeelementen ist dann erst wieder möglich, wenn das Dialogfenster geschlossen wurde. Man spricht in diesem
 * Zusammenhang auch von modalen Dialogen.
 */

public class HinweisFenster extends Dialog {
    private Label tipLabel;

    public HinweisFenster(Frame owner) {
        super(owner, true); // true = modaler Dialog
        tipLabel = new Label("", Label.CENTER); // Label-Text zentriert
        add(tipLabel); // keine Region = Center

        Button ok = new Button("ok");
        ok.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                HinweisFenster.this.setVisible(false);
                
            }
        });
    
        add(ok, BorderLayout.SOUTH);
        setSize(200, 100);
        setLocationRelativeTo(owner);
        
    }
    
    public void setText(String s) {
        tipLabel.setText(s);

    }   

    

}
