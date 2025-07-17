import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import static java.awt.Font.BOLD;
import static java.awt.Font.ITALIC;


public class homepage extends JFrame implements ActionListener {
    JButton next;
    public homepage(){
        setBounds(350,400,800,600);
        JLabel l2 = new JLabel("New Modern College");
        l2.setBounds(180, 100, 450, 100);
        l2.setForeground(Color.white);
        l2.setFont(new Font("Tahoma", BOLD, 40));
        add(l2);

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("jprojectsimg/bg.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600,450,Image.SCALE_DEFAULT);
        JLabel l1 = new JLabel(i1);
        l1.setBounds(0,0,800,600);
        add(l1);


        ImageIcon i3= new ImageIcon(ClassLoader.getSystemResource("jprojectsimg/attend2.jpg"));
        Image i4 = i3.getImage().getScaledInstance(300,200,Image.SCALE_DEFAULT);
        JLabel l4 = new JLabel(i3);
        l4.setBounds(0,0,400,330);
        add(l4);

        next = new JButton("Next");
        next.setBounds(600, 400, 120, 60);
        next.setFont(new Font("Tahoma",ITALIC, 16));
        next.addActionListener(this);
        add(next);




        setLayout(null);
        setLocationRelativeTo(null);

      setVisible(true);

    }

    public void actionPerformed( ActionEvent ae){
        if(ae.getSource()==next){
            new selectpage().setVisible(true);
            this.setVisible(false);
        }

    }

    public static void main(String[] args) {
        new homepage() {


        };
    }
}