import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        Font font = new Font("verdana", Font.PLAIN, 20);
        
        // Username label

        lblUsername.setText("Username:");
        lblUsername.setBounds(100, 100, 200, 20);
        lblUsername.setFont(font);

        // Password label

        lblPassword.setText("Password:");
        lblPassword.setBounds(100, 150, 200, 20);
        lblPassword.setFont(font);

        // Sign in button

        btnSignin.setText("Sign In");
        btnSignin.setBounds(100, 200, 100, 50);
        btnSignin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //function for the actual sign in
                String username = txtUsername.getText();
                char[] passchar = pasPassword.getPassword();
                String password = new String(passchar);

                System.out.println("UserName: " + username);
                System.out.println("Password: " + password);
            }
        });

        // Exit button

        btnExit.setText("Exit");
        btnExit.setBounds(300, 200, 100, 50);
        btnExit.addActionListener(new ActionListener() {
            //function to exit application on button click
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Username textbox

        txtUsername.setBounds(250, 100, 150, 20);

        // Password password textbox, I understand the variable name is weird but this is the way

        pasPassword.setBounds(250, 150, 150, 20);
        
        // login page

        login.setLayout(null);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login.setSize(500, 400);
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
