package JavaPractical;

import java.applet.*;     // For Applet class
import java.awt.*;        // For Graphics, Color, Font classes

/*
WAP to create an applet that displays a simple message.
*/

// Step 1: Create a class extending Applet
public class practical21 extends Applet {

    // Step 2: Override paint() method to display output
    public void paint(Graphics g) {

        // Set color and font
        g.setColor(Color.blue);
        g.setFont(new Font("Arial", Font.BOLD, 20));

        // Display message
        g.drawString("Welcome to Java Applet Example!", 50, 100);
    }
}
