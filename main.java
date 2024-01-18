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

        lblPassword.setText("Password:");
        lblPassword.setLocation(200, -200);
        lblUsername.setText("Username:");
        lblPassword.setLocation(200, -250);

        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login.setSize(500, 500);
        panel.add(lblUsername);
        panel.add(lblPassword);
        panel.add(pasPassword);
        panel.add(txtUsername);
        panel.add(btnExit);
        panel.add(btnSignin);
        login.add(panel);
        login.setVisible(true);
    }
}
