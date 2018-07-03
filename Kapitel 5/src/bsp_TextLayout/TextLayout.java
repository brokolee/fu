package bsp_TextLayout;

import java.awt.*;

public class TextLayout extends FlowLayout {
    static final int GAP = 5;
    static final int MINROWHEIGHT = 10;

    public TextLayout() {
        super(FlowLayout.LEFT);
    }

    @Override
    public void layoutContainer(Container target) {
        int rowHeight = MINROWHEIGHT;
        Insets insets = target.getInsets();
        int maxLineWidth = target.getWidth() - (insets.left + insets.right + 2 * GAP);
        int members = target.getComponentCount();
        int xPos = 0;
        int yPos = insets.top + GAP;

        for (int i = 0; i < members; i++) {
            Component comp = target.getComponent(i);
            if (comp instanceof LineBreak) {
                xPos = 0;
                yPos = yPos + rowHeight;
                rowHeight = MINROWHEIGHT;

            } else {
                Dimension compPrefSize = comp.getPreferredSize();
                int compWidth = compPrefSize.width;
                int compHeight = compPrefSize.height;
                comp.setSize(compWidth, compHeight);
                if ((xPos != 0) && ((xPos + compWidth + GAP) > maxLineWidth)) {
                    xPos = 0;
                    yPos += rowHeight;
                    rowHeight = MINROWHEIGHT;
                }
                xPos += GAP;
                comp.setLocation(xPos, yPos);
                xPos += compWidth;
                rowHeight = Math.max(rowHeight, compHeight);
            }
        }

    }

}
