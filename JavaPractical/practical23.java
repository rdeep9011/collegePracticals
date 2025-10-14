package JavaPractical;

import java.applet.Applet;
import java.awt.*;

/*
WAP to draw lines and rectangles using an Applet.
*/

public class practical23 extends Applet {

    @Override
    public void paint(Graphics g) {
        // Set background color (optional)
        setBackground(Color.white);

        // Set color for drawing
        g.setColor(Color.blue);

        // --- Drawing Lines ---
        g.drawLine(50, 50, 200, 50);   // horizontal line
        g.drawLine(50, 50, 50, 200);   // vertical line
        g.drawLine(50, 200, 200, 200); // bottom line
        g.drawLine(200, 50, 200, 200); // right line

        // Title
        g.setColor(Color.black);
        g.setFont(new Font("Arial", Font.BOLD, 16));
        g.drawString("Drawing Lines and Rectangles", 40, 30);

        // --- Drawing Rectangles ---
        g.setColor(Color.red);
        g.drawRect(250, 70, 120, 80);      // simple rectangle (outline)
        g.fillRect(250, 180, 120, 80);     // filled rectangle

        // Label rectangles
        g.setColor(Color.black);
        g.drawString("Outlined Rectangle", 250, 165);
        g.drawString("Filled Rectangle", 250, 280);
    }
}