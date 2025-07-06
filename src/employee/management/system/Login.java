package employee.management.system;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;

public class Login extends JFrame implements ActionListener {

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
        bLogin.addActionListener(this);
        add(bLogin);

        bBack = new JButton("BACK");
        bBack.setBounds(150,200,100,30);
        bBack.setFocusable(false);
        bBack.setForeground(Color.WHITE);
        bBack.setBackground(Color.DARK_GRAY);
        bBack.addActionListener(this);
        add(bBack);

        // profile pic
        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i22 = i11.getImage().getScaledInstance(600,300,Image.SCALE_DEFAULT);
        ImageIcon i33 = new ImageIcon(i22);
        JLabel imgg = new JLabel(i33);
        imgg.setBounds(350,20,600,300);
        add(imgg);

        // Background Image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/LoginB.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600,300,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(0,0,600,300);
        add(img);

        setSize(600,300);
        setLocation(450,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == bLogin){
            try{
                String username = tfUername.getText();
                String password = tfPassword.getText();

                conn conn = new conn();

                String query = "select * from login where username = '"+ username + "' and password = '" + password+"'";
                ResultSet resultSet = conn.statement.executeQuery(query);
                if(resultSet.next()){
                    setVisible(false);
                    new Main_afterlogin();
                }else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password");
                }


            }catch (Exception E){
                E.printStackTrace();
            }
        }
        else if(e.getSource() == bBack){
            System.exit(99);
        }
    }
}
