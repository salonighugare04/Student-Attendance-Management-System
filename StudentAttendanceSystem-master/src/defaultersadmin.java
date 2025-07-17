import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class defaultersadmin extends JFrame implements ActionListener {
    JButton b1,back;
    JTable t1,def;

    JLabel l1,l2,l5,l4;

    defaultersadmin() {
        setBounds(50, 50, 550, 600);

        l1 = new JLabel("Roll No");
        l1.setBounds(90, 0, 120, 30);
        l1.setFont(new Font("SEGIO", Font.BOLD, 14));
        l1.setForeground(Color.WHITE);
        add(l1);

        l2 = new JLabel("Name");
        l2.setBounds(220, 0, 120, 30);
        l2.setFont(new Font("SEGIO", Font.BOLD, 14));
        l2.setForeground(Color.WHITE);
        add(l2);

        l5= new JLabel("Attend");
        l5.setBounds(360,0,120,30);
        l5.setFont(new Font("Seigo",Font.BOLD,14));
        l5.setForeground(Color.white);
        add(l5);

        l4= new JLabel("Note: Defaulters are those whose attendence is less than 20");
        l4.setBounds(30,490,500,40);
        l4.setFont(new Font("Seigo",Font.BOLD,16));
        l4.setForeground(Color.white);
        add(l4);

        t1=new JTable();
        t1.setBounds(70, 30,400,350);
        t1.setFont(new Font("Seigo",Font.PLAIN,16));
        add(t1);




        b1= new JButton("Display");
        b1.setBounds(90,420,100,50);
        b1.setFont(new Font("Tahoma", Font.BOLD, 16));
        b1.addActionListener(this);
        add(b1);

        back = new JButton("Back");
        back.setBounds(340, 420, 100, 50);
        back.setFont(new Font("Tahoma", Font.BOLD, 16));
        back.addActionListener(this);
        add(back);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("jprojectsimg/v4.jpg"));
        Image i5 = i4.getImage().getScaledInstance(600, 700, Image.SCALE_SMOOTH);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel j1 = new JLabel(i6);
        j1.setBounds(0, 0, 600, 700);
        add(j1);

        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {




        if(ae.getSource()==back){
            new viewattendenceadmin().setVisible(true);
            this.setVisible(false);

        }
        if(ae.getSource()==b1){
//
            try {
                String str = "select Rollno,  Name , Attendence from adddetails where Attendence<'20'";
                conn c = new conn();
                ResultSet rs1=c.s.executeQuery(str);
                t1.setModel(DbUtils.resultSetToTableModel(rs1));
//
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }


    public static void main(String[] args) {
        new defaultersadmin();
    }

}
