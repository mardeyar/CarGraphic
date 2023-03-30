import javax.swing.*;
import java.awt.*;

public class Car extends JPanel {

    public Car() {
        // Vroom text
        setLayout(null);
        JLabel vroom = new JLabel("VROOM!!!");
        vroom.setFont(new Font("Calibri", Font.ITALIC, 42));
        vroom.setBounds(310, 170, 200, 50);
        vroom.setVisible(true);
        add(vroom);
    }
    @Override
    protected void paintComponent(Graphics g) {
        // Insert car roof, body and tires
        carRoof(g);
        carBody(g);
        carTires(g);
    }

    // Car body
    public void carBody(Graphics g) {
        g.setColor(new Color(255, 0, 0));
        g.fillRect(200, 300, 400, 150);
    }

    // Car roof
    public void carRoof(Graphics g) {
        g.setColor(new Color(255, 0, 0));
        g.drawRect(275, 220, 255, 80);
        g.setColor(new Color(0, 0, 0));
        g.drawLine(405, 220, 405, 300);
    }

    // Car tires
    public void carTires(Graphics g) {
        g.setColor(new Color(0, 0, 0));
        g.fillOval(250, 410, 80, 80);
        g.fillOval(480, 410, 80, 80);
    }
}
