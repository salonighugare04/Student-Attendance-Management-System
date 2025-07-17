import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class facdash extends JFrame implements ActionListener {
    JButton addstudent, addattendance, viewattendance,logout;

    facdash(){

        setSize(1800, 1000);


        addstudent = new JButton("Add Student");
        addstudent.setBounds(40, 90, 190, 60);
        addstudent.setFont(new Font("Tahoma", Font.BOLD, 18));
        addstudent.setBackground(Color.white);
        addstudent.setForeground(Color.black);
        addstudent.addActionListener(this);
        add(addstudent);

        addattendance = new JButton("Add Attendance");
        addattendance.setBounds(40, 200, 190, 60);
        addattendance.setFont(new Font("Tahoma",Font.BOLD, 18));
        addattendance.setBackground(Color.white);
        addattendance.setForeground(Color.black);
        addattendance.addActionListener(this);
        add(addattendance);


        viewattendance = new JButton("View Attendance");
        viewattendance.setBounds(340, 90, 190, 60);
        viewattendance.setFont(new Font("Tahoma", Font.BOLD, 18));
        viewattendance.setBackground(Color.white);
        viewattendance.setForeground(Color.black);
        viewattendance.addActionListener(this);
        add(viewattendance);

        logout = new JButton("Back");
        logout.setBounds(340, 200, 190, 60);
        logout.setFont(new Font("Tahoma", Font.BOLD, 18));
        logout.setBackground(Color.white);
        logout.setForeground(Color.black);
        logout.addActionListener(this);
        add(logout);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("jprojectsimg/class.jpg"));
        Image i5 = i4.getImage().getScaledInstance(600, 400, Image.SCALE_SMOOTH);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel j1 = new JLabel(i6);
        j1.setBounds(0, 0, 600, 400);
        add(j1);

//        getContentPane().setBackground(Color.black);
        setLayout(null);
        setBounds(350, 150, 600, 400);// setting the frame dimensions
        setVisible(true);

        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);

    }
    public void actionPerformed( ActionEvent ae) {

        if (ae.getSource() == addstudent) {
            new addstudent().setVisible(true);
            this.setVisible(false);
        }
        if (ae.getSource() == viewattendance) {
            new viewattendencefac().setVisible(true);
            this.setVisible(false);
        }
        if (ae.getSource() == addattendance) {
            new addattendence().setVisible(true);
            this.setVisible(false);
        }

        if (ae.getSource() ==logout) {
            new subjectdash().setVisible(true);
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new facdash();
    }
}