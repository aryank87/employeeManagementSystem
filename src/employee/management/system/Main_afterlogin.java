package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_afterlogin extends JFrame {

    JButton addEmployee;
    JButton viewEmployee;
    JButton removeEmployee;

    Main_afterlogin(){

        addEmployee = new JButton("Add Employee");
        addEmployee.setBounds(335,270,150,40);
        addEmployee.setBackground(Color.DARK_GRAY);
        addEmployee.setForeground(Color.white);
        addEmployee.setFocusable(false);
        addEmployee.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        viewEmployee = new JButton("View Employee");
        viewEmployee.setBounds(565,270,150,40);
        viewEmployee.setBackground(Color.DARK_GRAY);
        viewEmployee.setForeground(Color.white);
        viewEmployee.setFocusable(false);
        viewEmployee.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        removeEmployee = new JButton("Remove Employee");
        removeEmployee.setBounds(440,370,150,40);
        removeEmployee.setBackground(Color.DARK_GRAY);
        removeEmployee.setForeground(Color.white);
        removeEmployee.setFocusable(false);
        removeEmployee.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        // i add button below.

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1120,630, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(0,0,1120,630);
        add(img);

        // button adding to background
        img.add(addEmployee);
        img.add(viewEmployee);
        img.add(removeEmployee);

        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(340,155,400,40);
        heading.setFont(new Font("Raleway", Font.BOLD,25));
        img.add(heading);

        setSize(1120,630);
        setLocation(250, 100);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main_afterlogin();
    }

}
