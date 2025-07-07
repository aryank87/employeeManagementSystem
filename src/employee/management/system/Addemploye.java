package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Addemploye extends JFrame implements ActionListener {

    Addemploye(){

        getContentPane().setBackground(new Color(163,255,188));

        JLabel heading = new JLabel("Add Employee Detail");
        heading.setBounds(320,30,500,50);
        heading.setFont(new Font("sefir",Font.BOLD,25));
        add(heading);

        setSize(900,700);
        setLayout(null);
        setLocation(300,50);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Addemploye();
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
