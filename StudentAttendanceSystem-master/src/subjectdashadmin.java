
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class subjectdashadmin extends JFrame implements ActionListener {

    JButton datastructure, Java, python,back;
    JLabel l4;
    subjectdashadmin() {

        setSize(1600, 1000);


        datastructure = new JButton("Datastructure");
        datastructure.setBounds(60, 110, 160, 60);
        datastructure.setFont(new Font("Tahoma", Font.BOLD, 18));
        datastructure.setBackground(Color.white);
        datastructure.setForeground(Color.black);
        datastructure.addActionListener(this);
        add(datastructure);

        Java = new JButton("Java");
        Java.setBounds(60, 220, 160, 60);
        Java.setFont(new Font("Tahoma", Font.BOLD, 18));
        Java.setBackground(Color.white);
        Java.setForeground(Color.black);
        Java.addActionListener(this);
        add(Java);


        python = new JButton("Python");
        python.setBounds(390, 110, 140, 60);
        python.setFont(new Font("Tahoma", Font.BOLD, 18));
        python.setBackground(Color.white);
        python.setForeground(Color.black);
        python.addActionListener(this);
        add(python);

        back = new JButton("Logout");
        back.setBounds(390, 220, 140, 60);
        back.setFont(new Font("Tahoma", Font.BOLD, 18));
        back.setBackground(Color.white);
        back.setForeground(Color.black);
        back.addActionListener(this);
        add(back);

        l4= new JLabel("Choose a subject for Attendance.");
        l4.setBounds(100,20,1200,40);
        l4.setFont(new Font("Seigo",Font.BOLD,24));
        l4.setForeground(Color.white);
        add(l4);


        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("jprojectsimg/sub.jpeg"));
        Image i5 = i4.getImage().getScaledInstance(600, 400, Image.SCALE_SMOOTH);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel j1 = new JLabel(i6);
        j1.setBounds(0, 0, 600, 400);
        add(j1);

        getContentPane().setBackground(Color.black);
        setLayout(null);
        setBounds(350, 150, 600, 400);// setting the frame dimensions
        setVisible(true);

        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);

    }
    public void actionPerformed( ActionEvent ae) {
        if (ae.getSource() == datastructure) {
            new admindash().setVisible(true);
            this.setVisible(false);
        }


        if (ae.getSource() == Java) {
            new admindash().setVisible(true);
            this.setVisible(false);
        }


        if (ae.getSource() == python) {
            new admindash().setVisible(true);
            this.setVisible(false);
        }
        if(ae.getSource()==back){
            new adloginpage().setVisible(true);
            this.setVisible(false);
        }


    }
    public static void main(String[] args) {
        new subjectdashadmin();
    }
}