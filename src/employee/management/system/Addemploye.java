package employee.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Addemploye extends JFrame implements ActionListener {

    Random ran = new Random();
    int number = ran.nextInt(999999);

    JTextField tname, tfname, taddress, tphone, taadhar, temail, tsalary, tdeignation;
     JLabel tempid;
    JDateChooser tdob;

    //button
    JButton add, back;

    JComboBox boxeducation;

    Addemploye(){

        getContentPane().setBackground(new Color(163,255,188));

        JLabel heading = new JLabel("Add Employee Detail");
        heading.setBounds(320,30,500,50);
        heading.setFont(new Font("sefir",Font.BOLD,25));
        add(heading);

        // name
        JLabel name = new JLabel("Name");
        name.setBounds(50,150,150,30);
        name.setFont(new Font("SAN_SERIF", Font.BOLD,20));
        add(name);
        // name text field
        tname = new JTextField();
        tname.setBounds(200,150,150,30);
        tname.setBackground(new Color(177,252,197));
        add(tname);

        // father's name
        JLabel fname = new JLabel("Father's Name");
        fname.setBounds(400,150,150,30);
        fname.setFont(new Font("SAN_SERIF", Font.BOLD,20));
        add(fname);
        // father text field
        tfname = new JTextField();
        tfname.setBounds(600,150,150,30);
        tfname.setBackground(new Color(177,252,197));
        add(tfname);

        // address
        JLabel address = new JLabel("Address");
        address.setBounds(50,200,150,30);
        address.setFont(new Font("SAN_SERIF", Font.BOLD,20));
        add(address);
        // address text field
        taadhar = new JTextField();
        taadhar.setBounds(200,200,150,30);
        taadhar.setBackground(new Color(177,252,197));
        add(taadhar);

        // phone number
        JLabel phone = new JLabel("Phone no.");
        phone.setBounds(400,200,150,30);
        phone.setFont(new Font("SAN_SERIF", Font.BOLD,20));
        add(phone);
        // phone text field
        tphone = new JTextField();
        tphone.setBounds(600,200,150,30);
        tphone.setBackground(new Color(177,252,197));
        add(tphone);

        // Aadhar
        JLabel aadhar = new JLabel("Aadhar no.");
        aadhar.setBounds(50,250,150,30);
        aadhar.setFont(new Font("SAN_SERIF", Font.BOLD,20));
        add(aadhar);
        // address text field
        taadhar = new JTextField();
        taadhar.setBounds(200,250,150,30);
        taadhar.setBackground(new Color(177,252,197));
        add(taadhar);

        // Email
        JLabel email = new JLabel("Email");
        email.setBounds(400,250,150,30);
        email.setFont(new Font("SAN_SERIF", Font.BOLD,20));
        add(email);
        // phone text field
        temail = new JTextField();
        temail.setBounds(600,250,150,30);
        temail.setBackground(new Color(177,252,197));
        add(temail);

        //salary
        JLabel salary = new JLabel("Salary");
        salary.setBounds(50,300,150,30);
        salary.setFont(new Font("SAN_SERIF", Font.BOLD,20));
        add(salary);
        // salary text field
        tsalary = new JTextField();
        tsalary.setBounds(200,300,150,30);
        tsalary.setBackground(new Color(177,252,197));
        add(tsalary);

        // deignation
        JLabel deignation = new JLabel("Deignation");
        deignation.setBounds(400,300,150,30);
        deignation.setFont(new Font("SAN_SERIF", Font.BOLD,20));
        add(deignation);
        // deignation field
        tdeignation = new JTextField();
        tdeignation.setBounds(600,300,150,30);
        tdeignation.setBackground(new Color(177,252,197));
        add(tdeignation);

        // date of birth
        JLabel dob = new JLabel("Date Of Birth");
        dob.setBounds(50,350,150,30);
        dob.setFont(new Font("SAN_SERIF", Font.BOLD,20));
        add(dob);
        // date of birth field
        tdob = new JDateChooser();
        tdob.setBounds(200,350,150,30);
        tdob.setBackground(new Color(177,252,197));
        add(tdob);

        // Educataion
        JLabel edu = new JLabel("Education");
        edu.setBounds(400,350,150,30);
        edu.setFont(new Font("SAN_SERIF", Font.BOLD,20));
        add(edu);
        // Eduction Text field
        String[] item = {"BCA", "BBA", "BA","B.COM","B.Sc","MCA"};
        boxeducation = new JComboBox(item);
        boxeducation.setBackground(new Color(177,252,197));
        boxeducation.setBounds(600,350,150,30);
        add(boxeducation);

        // unique employe id
        JLabel empid = new JLabel("Employee Id");
        empid.setBounds(50,400,150,30);
        empid.setFont(new Font("SAN_SERIF", Font.BOLD,20));
        add(empid);
        //random number
        tempid = new JLabel(""+number);
        tempid.setBounds(200,400,150,30);
        tempid.setFont(new Font("SAN_SERIF", Font.BOLD,20));
        tempid.setForeground(Color.RED);
        add(tempid);

        // buttons

        // Add button
        add = new JButton("ADD");
        add.setBounds(450,550,150,40);
        add.setBackground(Color.darkGray);
        add.setForeground(Color.white);
        add.addActionListener(this);
        add.setFocusable(false);
        add(add);

        back = new JButton("BACK");
        back.setBounds(250,550,150,40);
        back.setBackground(Color.darkGray);
        back.setFocusable(false);
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);


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
        if(e.getSource() == add){
            String name = tname.getText();
            String fname = tfname.getText();
            String dob = ((JTextField) tdob.getDateEditor().getUiComponent()).getText();
            String salary = tsalary.getText();
            String address = taadhar.getText();
            String aadhar = taadhar.getText();
            String phone = tphone.getText();
            String email = temail.getText();
            String education = (String) boxeducation.getSelectedItem(); 
            String deignation = tdeignation.getText();
            String empId = tempid.getText();

            try{

                conn c = new conn();
                String query = "insert into employee values('"+name+"', '"+fname+"', '"+dob+"', '"+salary+"', '"+address+"', '"+phone+"', '"+email+"', '"+education+"', '"+deignation+"', '"+aadhar+"', '"+empId+"')";
                c.statement.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details added successfully");
                setVisible(false);

            }catch (Exception E){
                E.printStackTrace();
            }

        }else if(e.getSource() == back){
            new Main_afterlogin();
            setVisible(false);
        }
    }
}
