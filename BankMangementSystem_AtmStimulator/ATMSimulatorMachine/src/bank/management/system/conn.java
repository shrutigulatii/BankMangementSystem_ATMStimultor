package bank.management.system;
import java.sql.*;


public class conn{
    Connection c;
    Statement s;
    public conn(){
    try{
        c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bankmanagement","root","shrutigulati34");
        s=c.createStatement();
    }catch(Exception e){
        System.out.println(e);
    }
    }
    
}
