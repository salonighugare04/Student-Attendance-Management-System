import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class addattendence extends JFrame implements ActionListener {
    JLabel l1,l2,l3,l4,l5,l6;
    JTextField record,gr;
    JButton submit,display;
    JTable t1;
    JButton home,back;

    addattendence() {


        setBounds(400, 20, 600, 600);

        l1 = new JLabel("Roll No:");
        l1.setBounds(40, 60, 120, 30);
        l1.setFont(new Font("SEGIO", Font.BOLD, 18));
        l1.setForeground(Color.WHITE);
        add(l1);

        gr = new JTextField();
        gr.setBounds(175, 60, 180, 40);
        gr.setFont(new Font("Segeo", Font.PLAIN, 18));
        add(gr);

        t1 = new JTable();
        t1.setBounds(40, 200, 500, 50);
        t1.setFont(new Font("TAHOMA", Font.PLAIN, 16));
        t1.setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
        add(t1);


        l2 = new JLabel("Add Record");
        l2.setBounds(70, 340, 150, 30);
        l2.setFont(new Font("SEGIO", Font.BOLD, 15));
        l2.setForeground(Color.WHITE);
        add(l2);

        l3 = new JLabel("Name");
        l3.setBounds(180, 160, 100, 40);
        l3.setForeground(Color.white);
        add(l3);

        l4 = new JLabel("Roll No");
        l4.setBounds(50, 160, 100, 40);
        l4.setForeground(Color.white);
        add(l4);

        l5 = new JLabel("Address");
        l5.setBounds(300, 160, 100, 40);
        l5.setForeground(Color.white);
        add(l5);

        l6 = new JLabel("Attendance");
        l6.setBounds(420, 160, 100, 40);
        l6.setForeground(Color.white);
        add(l6);

        record = new JTextField();
        record.setBounds(220, 330, 180, 40);
        record.setFont(new Font("Segeo", Font.PLAIN, 18));
        add(record);

        submit = new JButton("Submit");
        submit.setBounds(140, 440, 100, 40);
        submit.addActionListener(this);
        add(submit);

        back = new JButton("Back");
        back.setBounds(320, 440, 100, 40);
        back.addActionListener(this);
        add(back);

        display = new JButton("Display");
        display.setBounds(400, 60, 80, 40);
        display.addActionListener(this);
        add(display);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("jprojectsimg/crop.jpg"));
        Image i5 = i4.getImage().getScaledInstance(600, 700, Image.SCALE_SMOOTH);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel j1 = new JLabel(i6);
        j1.setBounds(0, 0, 600, 700);
        add(j1);

        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==back){
            this.setVisible(false);
            new facdash().setVisible(true);
        }
        if(ae.getSource()==display){
            String Rollno=this.gr.getText();
            try{
                conn c = new conn();
                String str="select Rollno,Name,Address,Attendence from adddetails where Rollno='"+Rollno+"';";
                ResultSet rs=c.s.executeQuery(str);
                t1.setModel(DbUtils.resultSetToTableModel(rs));

            }
            catch(Exception e){
                System.out.println(e);

            }
        }
        else  if(ae.getSource()==submit){
            String Attendence = this.gr.getText();
            String Rollno = record.getText();
            try {
                conn c = new conn();
                String str = "update adddetails set Attendence = '"+Rollno+"' where Rollno = '"+Attendence+"';";
                c.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null,"Attendance Record Added Successfully");
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }



    public static void main(String[] args)
    {
        new addattendence();
    }
}
