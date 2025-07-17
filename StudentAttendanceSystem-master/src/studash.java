import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class studash extends JFrame implements ActionListener {


    JButton  viewattendance, logout;

    studash() {
        setSize(1800, 1000);



        viewattendance = new JButton("View Attendance");
        viewattendance.setBounds(300, 70, 200, 60);
        viewattendance.setFont(new Font("Tahoma", Font.BOLD, 18));
        viewattendance.setBackground(Color.white);
        viewattendance.setForeground(Color.black);
                viewattendance.addActionListener(this);
        add(viewattendance);

        logout = new JButton("Back");
        logout.setBounds(300, 200, 200, 60);
        logout.setFont(new Font("Tahoma", Font.BOLD, 18));
        logout.setBackground(Color.white);
        logout.setForeground(Color.black);
        logout.addActionListener(this);
        add(logout);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("jprojectsimg/student.jpeg"));
        Image i5 = i4.getImage().getScaledInstance(600, 400, Image.SCALE_SMOOTH);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel j1 = new JLabel(i6);
        j1.setBounds(0, 0, 600, 400);
        add(j1);

        setLayout(null);
        setBounds(350, 150, 600, 400);// setting the frame dimensions
        setVisible(true);

        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }



    public void actionPerformed( ActionEvent ae) {

        if (ae.getSource() ==viewattendance) {
            new viewattendencestud().setVisible(true);
            this.setVisible(false);
        }
        if (ae.getSource() ==logout) {
            new subjectdashstudent().setVisible(true);
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new studash();
    }
}