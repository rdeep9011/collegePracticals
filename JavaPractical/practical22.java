package JavaPractical;

import java.applet.Applet;
import java.awt.*;

// WAP: Applet for drawing a human face
public class practical22 extends Applet {

    @Override
    public void paint(Graphics g) {
        // Smooth edges
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // --- Base coordinates (top-left of face area) ---
        int x = 50, y = 30;
        int faceW = 220, faceH = 260;

        // Skin color
        Color skin = new Color(255, 224, 189);

        // Neck
        g2.setColor(skin);
        g2.fillRoundRect(x + 85, y + faceH - 10, 50, 40, 20, 20);

        // Face (head)
        g2.setColor(skin);
        g2.fillOval(x, y, faceW, faceH);
        g2.setColor(Color.BLACK);
        g2.drawOval(x, y, faceW, faceH);

        // Ears
        g2.setColor(skin);
        g2.fillOval(x - 15, y + 110, 30, 50);
        g2.fillOval(x + faceW - 15, y + 110, 30, 50);
        g2.setColor(Color.BLACK);
        g2.drawOval(x - 15, y + 110, 30, 50);
        g2.drawOval(x + faceW - 15, y + 110, 30, 50);

        // Hair (simple top arc)
        g2.setColor(new Color(40, 40, 40));
        g2.fillArc(x - 5, y - 10, faceW + 10, 160, 0, 180);

        // Eyes
        int eyeY = y + 110;
        int leftEyeX = x + 55, rightEyeX = x + 135;
        g2.setColor(Color.WHITE);
        g2.fillOval(leftEyeX, eyeY, 40, 25);
        g2.fillOval(rightEyeX, eyeY, 40, 25);
        g2.setColor(Color.BLACK);
        g2.drawOval(leftEyeX, eyeY, 40, 25);
        g2.drawOval(rightEyeX, eyeY, 40, 25);

        // Pupils
        g2.fillOval(leftEyeX + 15, eyeY + 8, 10, 10);
        g2.fillOval(rightEyeX + 15, eyeY + 8, 10, 10);

        // Eyebrows
        g2.drawArc(leftEyeX - 5, eyeY - 15, 50, 20, 0, 180);
        g2.drawArc(rightEyeX - 5, eyeY - 15, 50, 20, 0, 180);

        // Nose (simple)
        int noseX = x + faceW / 2;
        int noseTopY = y + 135;
        g2.drawLine(noseX, noseTopY, noseX - 10, noseTopY + 35);
        g2.drawLine(noseX - 10, noseTopY + 35, noseX + 10, noseTopY + 35);

        // Mouth
        int mouthW = 90, mouthH = 40;
        int mouthX = x + (faceW - mouthW) / 2;
        int mouthY = y + 190;
        g2.setColor(new Color(200, 30, 50));
        g2.fillArc(mouthX, mouthY, mouthW, mouthH, 0, -180); // a smile
        g2.setColor(Color.BLACK);
        g2.drawArc(mouthX, mouthY, mouthW, mouthH, 0, -180);

        // Simple shoulders
        g2.setColor(new Color(70, 120, 200));
        g2.fillRoundRect(x + 20, y + faceH + 20, faceW - 40, 70, 30, 30);

        // Caption
        g2.setColor(Color.DARK_GRAY);
        g2.setFont(new Font("Arial", Font.BOLD, 14));
        g2.drawString("Human Face (Applet)", x + 60, y + faceH + 15);
    }
}
