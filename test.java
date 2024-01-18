import java.awt.Color;
import java.awt.Font;
import java.awt.Point;

import javax.swing.*;

public class test {
    public static void main(String[] args) {
        final int WINDOW_WIDTH = 900;
        final int WINDOW_HEIGHT = 600;
        JFrame window = new JFrame();
        JPanel panel = new JPanel();
        JTextField textX = new JTextField("positionX");
        JTextField textY = new JTextField("positionY");
        JButton button = new JButton("Exit");
        Font font = new Font("Monaco", Font.PLAIN, 20);
        textX.setSize(100, 100);
        textY.setSize(100, 100);
        textX.setForeground(Color.BLACK);
        textY.setForeground(Color.BLACK);
        textX.setFont(font);
        textY.setFont(font);
        panel.add(textX);
        panel.add(textY);
        panel.add(button);
        window.add(panel);
        window.setVisible(true);
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("New World");
        while (true) {
            Point position = window.getMousePosition();
            if (position == null) {
                textX.setText("NOT");
                textY.setText("DETECTED");
                continue;
            }
            double x = position.getX();
            double y = position.getY();
            button.setBounds((int) x - 25, (int) y - 35, 50, 20);
            textX.setText(String.valueOf(x));
            textY.setText(String.valueOf(y));
        }
    }
}
