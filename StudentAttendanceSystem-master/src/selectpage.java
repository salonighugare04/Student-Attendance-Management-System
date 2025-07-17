import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class selectpage extends JFrame implements ActionListener {

    JButton admin, faculty, student;

    selectpage() {

        setSize(1600, 1000);


        admin = new JButton("Admin");
        admin.setBounds(60, 90, 140, 60);
        admin.setFont(new Font("Tahoma", Font.BOLD, 18));
        admin.setBackground(Color.white);
        admin.setForeground(Color.black);
        admin.addActionListener(this);
        add(admin);

        faculty = new JButton("Faculty");
        faculty.setBounds(220, 190, 140, 60);
        faculty.setFont(new Font("Tahoma", Font.BOLD, 18));
        faculty.setBackground(Color.white);
        faculty.setForeground(Color.black);
        faculty.addActionListener(this);
        add(faculty);


        student = new JButton("Student");
        student.setBounds(390, 90, 140, 60);
        student.setFont(new Font("Tahoma", Font.BOLD, 18));
        student.setBackground(Color.white);
        student.setForeground(Color.black);
        student.addActionListener(this);
        add(student);



        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("jprojectsimg/crop.jpg"));
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
        if (ae.getSource() == admin) {
            new adloginpage().setVisible(true);
            this.setVisible(false);
        }


        if (ae.getSource() == faculty) {
            new facloginpage().setVisible(true);
            this.setVisible(false);
        }


        if (ae.getSource() == student) {
            new studloginpage().setVisible(true);
            this.setVisible(false);
        }


    }
    public static void main(String[] args) {
        new selectpage();
    }
}