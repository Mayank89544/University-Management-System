import java.sql.*;

public class Conn {

    Connection c;
    Statement s;
    
    Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/universitymanagementsystem", "abstract-programmer", "example-password"); // Do not forget to put your MySQL Workbench password in the password field (empty field) if you have
            s = c.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
