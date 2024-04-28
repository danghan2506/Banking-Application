package GUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class QTMBusiness {
    Connection conn=null;
    Statement stm=null;
    public void connectDB(){
        try{
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/dacstest","root","danghan0903");

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public int executeDB(String sql){
        int n=0;
        try{
            connectDB();
            stm=conn.createStatement();
            n= stm.executeUpdate(sql);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return n;
    }
}
