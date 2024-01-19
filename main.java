import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class main {
    public static void main(String[] args) {
        JFrame login = new JFrame();
        JPanel panel = new JPanel();
        JLabel lblUsername = new JLabel();
        JLabel lblPassword = new JLabel();
        JTextField txtUsername = new JTextField();
        JPasswordField pasPassword = new JPasswordField();
        JButton btnSignin = new JButton();
        JButton btnExit = new JButton();
        Font font = new Font("verdana", Font.PLAIN, 24);
        
        lblUsername.setText("Username:");
        lblUsername.setBounds(50, 100, 200, 20);
        lblUsername.setFont(font);
        lblPassword.setText("Password:");
        lblPassword.setBounds(50, 150, 200, 20);
        lblPassword.setFont(font);

        txtUsername.setBounds(200, 100, 100, 20);
        pasPassword.setBounds(200, 150, 100, 20);
        
        login.setLayout(null);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login.setSize(500, 500);
        login.add(lblUsername);
        login.add(lblPassword);
        login.add(pasPassword);
        login.add(txtUsername);
        login.add(btnExit);
        login.add(btnSignin);
        login.add(panel);
        login.setVisible(true);
    }
}
