
import java.sql.*;
public class conn {
    Connection c;
    Statement s;
    conn(){
        String url="jdbc:mysql://localhost:3306/attendence";
        String username="root";
        String password="nehabhad@0206";
        try {


            c = DriverManager.getConnection(url, username, password);
            s = c.createStatement();
            System.out.println("connection successful");

        }catch (Exception e){
            e.printStackTrace();
            System.out.println("unsuccessful");
        }
    }

    public static void main(String[] args) {

        new conn();
    }
}

