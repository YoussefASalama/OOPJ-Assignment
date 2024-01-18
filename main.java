import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class main {
    public static void main(String[] args) {
        JFrame login = new JFrame();
        JPanel panel = new JPanel();
        JLabel lblUsername = new JLabel();
        JLabel lblPassword = new JLabel();
        JTextField txtUsername = new JTextField();
        JTextField txtPassword = new JTextField ();
        JButton btnSignin = new JButton();
        JButton btnExit = new JButton();

        login.setVisible(true);
    }
}
