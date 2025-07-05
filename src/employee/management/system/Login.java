package employee.management.system;
import java.awt.*;
import javax.swing.*;

public class Login extends JFrame {

    JTextField tfUername;
    JPasswordField tfPassword;
    JLabel lUsername;
    JLabel lPassword;
    // buttons
    JButton bLogin;
    JButton bBack;


    Login(){
        setLayout(null);    // pehle layout null karege for manual positioning
        setTitle("Login");

        // labeler
        lUsername = new JLabel();
        lUsername.setText("User Name");
        lUsername.setFont(new Font("Serif",Font.BOLD,16));
        lUsername.setBounds(50,50,100,30);
        add(lUsername);

        lPassword = new JLabel();
        lPassword.setText("Password");
        lPassword.setFont(new Font("Serif", Font.BOLD, 16));
        lPassword.setBounds(50,100,100,30);
        add(lPassword);

        //textfield
        tfUername = new JTextField();
        //tfUername.setText("Username");
        tfUername.setBounds(150, 50, 100,30);
        add(tfUername);

        tfPassword = new JPasswordField();
        tfPassword.setBounds(150,100,100,30);
        add(tfPassword);

        // buttons
        bLogin = new JButton("LOGIN");
        bLogin.setBounds(150, 160, 100,30);
        bLogin.setFocusable(false);
        bLogin.setForeground(Color.white);
        bLogin.setBackground(Color.DARK_GRAY);
        add(bLogin);

        bBack = new JButton("BACK");
        bBack.setBounds(150,200,100,30);
        bBack.setFocusable(false);
        bBack.setForeground(Color.WHITE);
        bBack.setBackground(Color.DARK_GRAY);
        add(bBack);



        setSize(600,300);
        setLocation(450,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }

}
