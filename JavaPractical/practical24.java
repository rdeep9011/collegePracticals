package JavaPractical;

import java.applet.Applet;
import java.awt.*;

/*
WAP to draw polygons using an Applet.
*/

public class practical24 extends Applet {

    @Override
    public void paint(Graphics g) {
        setBackground(Color.white);

        // Set title
        g.setColor(Color.black);
        g.setFont(new Font("Arial", Font.BOLD, 16));
        g.drawString("Drawing Polygons", 120, 30);

        // --- Polygon 1: Triangle ---
        int x1[] = {50, 100, 150};
        int y1[] = {200, 100, 200};
        g.setColor(Color.blue);
        g.drawPolygon(x1, y1, 3);

        // --- Polygon 2: Filled Pentagon ---
        int x2[] = {250, 300, 350, 325, 275};
        int y2[] = {200, 150, 200, 250, 250};
        g.setColor(Color.green);
        g.fillPolygon(x2, y2, 5);

        // --- Polygon 3: Hexagon Outline ---
        int x3[] = {420, 460, 500, 500, 460, 420};
        int y3[] = {200, 150, 200, 250, 300, 250};
        g.setColor(Color.red);
        g.drawPolygon(x3, y3, 6);

        // Labels
        g.setColor(Color.black);
        g.drawString("Triangle", 85, 230);
        g.drawString("Filled Pentagon", 275, 280);
        g.drawString("Hexagon", 440, 320);
    }
}