import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    // Constructor
    public MainWindow() {
        this.setBounds(100, 100, 800, 600);
        this.setTitle("Draw A Car");

        // Tells "X" button to close window
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Instantiate "drawing board"
        Car drawCar = new Car();
        drawCar.setBackground(new Color(80, 80, 80));
        this.add(drawCar);
    }
}