package employee.management.system;
import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;

public class Viewemploye extends JFrame{
    Choice choiceEmp;

    Viewemploye(){
        getContentPane().setBackground(new Color(255,131,122));
        JLabel search = new JLabel("Search by employee id");
        search.setBounds(20,20,150,20);
        add(search);

        choiceEmp = new Choice();
        choiceEmp.setBounds(180,20,150,20);
        add(choiceEmp);

        try{
            conn c = new conn();
            ResultSet resultSet = c.statement.executeQuery("select * from employee");
            while(resultSet.next()){
                choiceEmp.add(resultSet.getString("empId"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }


        setSize(900,700);
        setLayout(null);
        setLocation(300,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Viewemploye();
    }
}
