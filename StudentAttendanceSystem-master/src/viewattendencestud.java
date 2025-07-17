import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class viewattendencestud extends JFrame implements ActionListener {
    JLabel l1,l2,l3,l4,l5,l6;
    JTable t1;
    JButton b1,back,defaulters;
    viewattendencestud(){
        setBounds(50,50,500,600);

        l1 = new JLabel("Roll No");
        l1.setBounds(10, 0, 120, 30);
        l1.setFont(new Font("SEGIO", Font.BOLD, 14));
        l1.setForeground(Color.WHITE);
        add(l1);

        l2 = new JLabel("Name");
        l2.setBounds(110, 0, 120, 30);
        l2.setFont(new Font("SEGIO", Font.BOLD, 14));
        l2.setForeground(Color.WHITE);
        add(l2);

        l3= new JLabel("Address");
        l3.setBounds(210,0,120,30);
        l3.setFont(new Font("Seigo",Font.BOLD,14));
        l3.setForeground(Color.white);
        add(l3);


        l4= new JLabel("Contact");
        l4.setBounds(310,0,120,30);
        l4.setFont(new Font("Seigo",Font.BOLD,14));
        l4.setForeground(Color.white);
        add(l4);

        l5= new JLabel("Attend");
        l5.setBounds(410,0,120,30);
        l5.setFont(new Font("Seigo",Font.BOLD,14));
        l5.setForeground(Color.white);
        add(l5);

        t1=new JTable();
        t1.setBounds(0, 30,500,400);
        t1.setFont(new Font("Seigo",Font.PLAIN,16));
        add(t1);

        b1= new JButton("Display");
        b1.setBounds(40,470,100,50);
        b1.setFont(new Font("Tahoma", Font.BOLD, 16));
        b1.addActionListener(this);
        add(b1);

        back = new JButton("Back");
        back.setBounds(350, 470, 100, 50);
        back.setFont(new Font("Tahoma", Font.BOLD, 16));
        back.addActionListener(this);
        add(back);

        defaulters = new JButton("Defaulters");
        defaulters.setBounds(185, 470, 120, 50);
        defaulters.setFont(new Font("Tahoma", Font.BOLD, 14));
        defaulters.addActionListener(this);
        add(defaulters);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("jprojectsimg/v3.jpg"));
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
        if(ae.getSource()==back)
        {
            this.setVisible(false);
            new studash().setVisible(true);
        }

        if(ae.getSource()==defaulters)
        {
            this.setVisible(false);
            new defaultersstud().setVisible(true);
        }
        if (ae.getSource() == b1) {
            try {
                conn c = new conn();
                String str = "select * from adddetails";
                ResultSet rs = c.s.executeQuery(str);
                t1.setModel(DbUtils.resultSetToTableModel(rs));

            } catch (Exception e) {
                System.out.println(e);

            }
        }


    }


    public static void main(String[] args) {
        new viewattendencestud();
    }
}
