/*
 * we have to assume that database name: ncit username=root password=admin
 * table name=Student that contains roll name and faculty
 * 
 * 
 * 
 */
import java.sql.*;
public class DisplayFromDatabase {
    public static void main(String[] args) throws Exception{
        String url="jdbc:mysql//localhost:3306/ncit";
        String uname="root";
        String psd="admin";
        Class.forName("com.mysql.jdbc.Driver");
        Connection cn=DriverManager.getConnection(url, uname, psd);
        Statement st=cn.createStatement();
        String q="Select * from Student";
        ResultSet rs=st.executeQuery(q);
        while(rs.next()){
            System.out.println("Name="+rs.getString(2)+" Roll="+rs.getInt(1)+" Faculty ="+rs.getString(3));
        }
        cn.close();
        
    }
    
}
