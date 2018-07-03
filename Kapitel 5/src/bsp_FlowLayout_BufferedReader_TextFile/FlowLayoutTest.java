package bsp_FlowLayout_BufferedReader_TextFile;

import java.awt.*;
import java.io.*;
import java.util.StringTokenizer;

import adhoc5_BaseFrame.BaseFrame;

public class FlowLayoutTest {
    public static void main(String[] args) throws HeadlessException, IOException {
        Frame f = new BaseFrame();
        f.setTitle("no que understand le spansich!");

        BufferedReader br = null;
     
            br = new BufferedReader(new FileReader("C:\\Users\\aaron\\eclipse\\kurs1618\\workspace\\Kapitel 5\\"
                    + "src\\bsp_FlowLayout_BufferedReader_TextFile\\file.txt"));

        String line = null;
 
            while ((line = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(line, " ");
                Panel p = new Panel(new FlowLayout(FlowLayout.LEFT));
                f.add(p);
                System.out.println("f.add(p)");
                while(st.hasMoreElements()) {
                    String token = st.nextToken();
                    
                    p.add(new Label(token));
                    System.out.println("hasMore Elements: " + token);
                }

            }

    br.close();
    f.setVisible(true);
    }
   
    
}
