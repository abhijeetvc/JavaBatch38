import java.sql.*;
import java.util.Scanner;

public class JdbcConnect1 {

    Connection con;
    Statement stmt;
    PreparedStatement pst;
    ResultSet rs;
    Scanner sc=new Scanner(System.in);
    public JdbcConnect1() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con= DriverManager
                .getConnection("jdbc:mysql://localhost:3306/truptidb",
                        "root","jesus");
        stmt=con.createStatement();
    }

    public void displayData() throws SQLException {
        rs=stmt.executeQuery("select * from employee");

        while(rs.next()){
            System.out.println("Id: "+rs.getInt("id"));
            System.out.println("Name: "+rs.getString("name"));
            System.out.println("City: "+rs.getString("city"));
            System.out.println();
        }
    }

    public void updateData() throws SQLException {
      //  stmt.executeUpdate("update employee set name='D',city='Bangalore' where id=3");
        pst=con.prepareStatement("update employee set name=?,city=? where id=?");
        System.out.println("Enter name: ");
        String name=sc.next();
        pst.setString(1,name);

        System.out.println("Enter city: ");
        String city=sc.next();
        pst.setString(2,city);

        System.out.println("Enter id: ");
        int id=sc.nextInt();
        pst.setInt(3,id);
        pst.execute();

        System.out.println("Data updated successfully");
    }

    public void insertData() throws SQLException {
       // stmt.executeUpdate("insert into employee values(3,'C','Chennai')");
        pst=con.prepareStatement("insert into employee values(?,?,?)");
        System.out.println("Enter id: ");
        int id=sc.nextInt();
        pst.setInt(1,id);
        System.out.println("Enter Name: ");
        String name=sc.next();
        pst.setString(2,name);
        System.out.println("Enter city: ");
        String city=sc.next();
        pst.setString(3,city);
        pst.execute();
        System.out.println("Data inserted successfully");
    }

//    public void deleteData() throws SQLException {
//        stmt.executeUpdate("delete from employee where id=3");
//        System.out.println("Data deleted successfully");
//    }

    public static void main(String[] args){
        try {
            JdbcConnect1 jc=new JdbcConnect1();
          //  jc.insertData();
            jc.updateData();
            jc.displayData();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
