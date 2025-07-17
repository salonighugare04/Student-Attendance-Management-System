import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class admindash extends JFrame implements ActionListener {

    JButton addattendance, viewattendance, logout;

    admindash() {
        setSize(1800, 1000);

        addattendance = new JButton("Add Attendance");
        addattendance.setBounds(40, 90, 200, 40);
        addattendance.setFont(new Font("Tahoma", Font.BOLD, 16));
        addattendance.setBackground(Color.white);
        addattendance.setForeground(Color.black);
                addattendance.addActionListener(this);
        add(addattendance);


        viewattendance = new JButton("View Attendance");
        viewattendance.setBounds(40, 170, 200, 40);
        viewattendance.setFont(new Font("Tahoma", Font.BOLD, 16));
        viewattendance.setBackground(Color.white);
        viewattendance.setForeground(Color.black);
                viewattendance.addActionListener(this);
        add(viewattendance);

        logout = new JButton("Back");
        logout.setBounds(40, 250, 200, 40);
        logout.setFont(new Font("Tahoma", Font.BOLD, 16));
        logout.setBackground(Color.white);
        logout.setForeground(Color.black);
        logout.addActionListener(this);
        add(logout);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("jprojectsimg/admin.jpg"));
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

        if (ae.getSource() ==addattendance) {
            new addattendenceadmin ().setVisible(true);
            this.setVisible(false);
        }

        if (ae.getSource() ==viewattendance) {
            new viewattendenceadmin().setVisible(true);
            this.setVisible(false);
        }
        if (ae.getSource() ==logout) {
            new subjectdashadmin().setVisible(true);
            this.setVisible(false);
        }

        if (ae.getSource() ==logout) {
        new subjectdashadmin().setVisible(true);
        this.setVisible(false);
    }

    }

    public static void main(String[] args) {
        new admindash();
    }
}