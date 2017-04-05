import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by dkuzmich on 4/5/2017.
 */
public class Mydb {
    static final String Url = "jdbc:mysql://localhost/testsh";
    static final String User = "admin";
    static final String Pass = "12345";

    public  void  contoDB(){
        try {

            Class.forName("com.mysql.jdbc.Driver");

            Connection con= DriverManager.getConnection("URL","User","Pass");
            Statement stm=con.createStatement();
            String SQL="Select * FROM srvdb";
            ResultSet res=stm.executeQuery(SQL);
            while(res.next()){
                Integer id=res.getInt("ID");
                String name=res.getString("Name");
                String pass=res.getString("Pass");
                System.out.println("id= "+id+" name= "+name+" pass= "+pass);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }   catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
