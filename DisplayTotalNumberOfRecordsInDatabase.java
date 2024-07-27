import java.sql.*;
public class DisplayTotalNumberOfRecordsInDatabase {
    public static void main(String[] args) throws Exception{
        String url="jdbc:mysql//localhost:3306/ncit";
        String uname="root";
        String psd="admin";
        Class.forName("com.mysql.jdbc.Driver");
        Connection cn=DriverManager.getConnection(url, uname, psd);
        Statement st=cn.createStatement();
        String q="select count(roll) from student";
        ResultSet rs=st.executeQuery(q);
        rs.next();
        System.out.println(rs.getInt(1));
        cn.close();
    }
    
}

/*
 * If we have to calculate average Marks from the table then change above line 10 by : String q="select AVG(marks) from student";
 * 
 * 
 * 
 */
