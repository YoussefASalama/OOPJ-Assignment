import javax.swing.*;

public class LabelPositionExample {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Label Position Example");

        // Set the layout to null
        frame.setLayout(null);

        // Create a new JLabel
        JLabel label = new JLabel("Hello, World!");

        // Set the position and size of the JLabel
        label.setBounds(150, 50, 100, 20);

        // Add the JLabel to the JFrame
        frame.add(label);

        // Set the size of the JFrame
        frame.setSize(300, 200);

        // Set the JFrame to exit on close
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the JFrame visible
        frame.setVisible(true);
    }
}
