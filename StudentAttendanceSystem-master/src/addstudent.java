import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLOutput;

public class addstudent extends JFrame implements ActionListener {

JLabel l1,l2,l3,l4,l5;

JButton adddata,back;
    int jbtnW=100;
    int jbtnh=40;
    JTextField name,address,contact,rollno,Attendence;

    int txtW = 180;
    int txtH = 40;
    addstudent() {
        setSize(1200, 1600);

        l1=new JLabel("Name");
        l1.setBounds(60,40,jbtnW,jbtnh);
        l1.setFont(new Font("SEGIO",Font.BOLD,20));
        l1.setForeground(Color.WHITE);
        add(l1);

        l2=new JLabel("Roll no");
        l2.setBounds(60,130,jbtnW,jbtnh);
        l2.setFont(new Font("SEGIO",Font.BOLD,20));
        l2.setForeground(Color.WHITE);
        add(l2);



        l3=new JLabel("Address");
        l3.setBounds(60,220,jbtnW,jbtnh);
        l3.setFont(new Font("SEGIO",Font.BOLD,20));
        l3.setForeground(Color.WHITE);
        add(l3);


        l4=new JLabel("Contact");
        l4.setBounds(60,310,jbtnW,jbtnh);
        l4.setFont(new Font("SEGIO",Font.BOLD,20));
        l4.setForeground(Color.WHITE);
        add(l4);

        l5=new JLabel("Attend");
        l5.setBounds(60,400, jbtnW,jbtnh);
        l5.setFont(new Font("SEGIO",Font.BOLD,20));
        l5.setForeground(Color.WHITE);
        add(l5);

        Attendence= new JTextField();
        Attendence.setBounds(190,400,txtW,txtH);
        Attendence.setFont(new Font("Segeo", Font.PLAIN, 18));
        add(Attendence);


        name= new JTextField();
        name.setBounds(190,40,txtW,txtH);
        name.setFont(new Font("Segeo", Font.PLAIN, 18));
        add(name);

        address= new JTextField();
        address.setBounds(190,220,txtW,txtH);
        address.setFont(new Font("Segeo", Font.PLAIN, 18));
        add(address);

        contact= new JTextField();
        contact.setBounds(190,310,txtW,txtH);
        contact.setFont(new Font("Segeo", Font.PLAIN, 18));
        add(contact);

        rollno= new JTextField();
        rollno.setBounds(190,130,txtW,txtH);
        rollno.setFont(new Font("Segeo", Font.PLAIN, 18));
        add(rollno);

        adddata=new JButton("Add Data");
        adddata.setBounds(100,470,100,50);
        adddata.addActionListener(this);
        add(adddata);

        back=new JButton("Back");
        back.setBounds(280,470,100,50);
        back.addActionListener(this);
        add(back);


        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("jprojectsimg/addstudent.jpg"));
        Image i5 = i4.getImage().getScaledInstance(500, 550, Image.SCALE_SMOOTH);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel j1 = new JLabel(i6);
        j1.setBounds(0, 0, 500, 550);
        add(j1);


        setBounds(400, 20, 500, 580);

        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);


    }

    public void actionPerformed( ActionEvent ae) {
        if (ae.getSource() ==back) {
            new facdash().setVisible(true);
            this.setVisible(false);
        }
        else if (ae.getSource()==adddata) {
            String Name=this.name.getText();
            String Rollno=this.rollno.getText();
            String Address=this.address.getText();
            String Contact=this.contact.getText();
            String Attendence=this.Attendence.getText();
            conn c =new conn();

            String str="insert into adddetails(Rollno,Name,Address,Contact,Attendence)values('"+Rollno+"','"+Name+"','"+Address+"','"+Contact+"','"+Attendence+"');";
            try {
               c.s.executeUpdate(str);
               JOptionPane.showMessageDialog(null,"Data Added Successsfully");
               this.name.setText(null);
               this.rollno.setText(null);
               this.address.setText(null);
                this.contact.setText(null);
                this.Attendence.setText(null);


                name= new JTextField();
                name.setBounds(190,40,txtW,txtH);
                name.setFont(new Font("Segeo", Font.PLAIN, 18));
                add(name);


            }
            catch(Exception e){
                System.out.println(e);
            }


        }
    }
    public static void main(String[] args) {
        new addstudent();

    }
}
