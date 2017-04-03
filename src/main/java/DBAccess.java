import com.sun.org.apache.xpath.internal.SourceTree;

import java.sql.*;

/**
 * Created by dkuzmich on 4/3/2017.
 */
public class DBAccess {
    String URL="jdbc:sqlite:D:\\My Documents\\IdeaProjects\\SQLiteStudio\\TestServletDB";
    public void conDB(){
        try {
            Connection con= DriverManager.getConnection(URL);
            System.out.println("Connection to DB Established");
            //Get Data
            Statement stm=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            String SQlr="Select * from TestServletDB";
            ResultSet res=stm.executeQuery(SQlr);

            readDBP(res);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Cannot connect to DB");
        }


    }

    public void readDBP(ResultSet rs){
        try {
            while(rs.next()){
                Integer id=rs.getInt("ID");
                String sname=rs.getString("sName");
                String spass=rs.getString("sPass");
                System.out.println("ID= "+id+" sname= "+sname+" spass = " +spass);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
