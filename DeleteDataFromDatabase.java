import java.sql.*;
public class DeleteDataFromDatabase {
public static void main(String[] args) throws Exception {

    String url="jdbc:mysql//localhost:3306/ncit";
    String uname="root";
    String psd="admin";
    Class.forName("com.mysql.jdbc.Driver");
    Connection cn=DriverManager.getConnection(url, uname, psd);
    Statement st=cn.createStatement();
    String q="Delete from Student Where Faculty ='IT'";
    int i=st.executeUpdate(q);
    System.out.println("Number of data that deleted :"+i);
    cn.close();
    
}  
}

// To update or insert some data into database we have to change the line 11 by : String q="Update student set faculty='IT' Where faculty='SE'";
