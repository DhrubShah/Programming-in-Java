import javax.swing.*;
import java.awt.*;

public class NepalFlag extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Draw the flag background
        g2d.setColor(Color.RED);
        g2d.fillRect(0, 0, getWidth(), getHeight());

        // Draw the upper triangle
        g2d.setColor(Color.RED);
        int[] xUpper = {50, 200, 50};
        int[] yUpper = {50, 50, 200};
        g2d.fillPolygon(xUpper, yUpper, 3);

        // Draw the lower triangle
        g2d.setColor(Color.RED);
        int[] xLower = {200, 350, 200};
        int[] yLower = {50, 200, 200};
        g2d.fillPolygon(xLower, yLower, 3);

        // Draw the white border on the triangles
        g2d.setColor(Color.WHITE);
        g2d.setStroke(new BasicStroke(4));
        g2d.drawPolygon(xUpper, yUpper, 3);
        g2d.drawPolygon(xLower, yLower, 3);

        // Draw the sun symbol in the upper left triangle
        g2d.setColor(Color.WHITE);
        g2d.fillOval(75, 75, 50, 50);
        g2d.setColor(Color.RED);
        g2d.fillOval(85, 85, 30, 30);

        // Draw the moon symbol in the lower right triangle
        g2d.setColor(Color.WHITE);
        g2d.fillOval(225, 150, 50, 50);
        g2d.setColor(Color.RED);
        g2d.fillOval(235, 160, 30, 30);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Nepalese Flag");
        NepalFlag flag = new NepalFlag();
        frame.add(flag);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
