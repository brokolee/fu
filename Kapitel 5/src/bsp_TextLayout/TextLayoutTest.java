package bsp_TextLayout;

import java.awt.*;
import java.io.*;
import java.util.StringTokenizer;

import adhoc5_BaseFrame.BaseFrame;

public class TextLayoutTest {
    public static void main(String args[]) throws IOException {
        Frame f = new BaseFrame();
        f.setTitle("Honi Soit Qui Mal Y Pense");
        Panel p = new Panel(new TextLayout());
        f.add(p);
        BufferedReader br = new BufferedReader(new FileReader("textfile.txt"));
        String line = null;
        while ((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line, " ");
            while (st.hasMoreTokens()) {
                String token = st.nextToken();
                p.add(new Label(token));
            }
            p.add(new LineBreak());
        }
        br.close();
        f.setVisible(true);
    }
}