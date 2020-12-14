import java.sql.*;

public class JdbcConnect {
    Connection con;
    Statement stmt;
    ResultSet rs;

    public JdbcConnect() throws ClassNotFoundException, SQLException{
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
        stmt.executeUpdate("update employee set name='D',city='Bangalore' where id=3");
        System.out.println("Data updated successfully");
    }

    public void insertData() throws SQLException {
        stmt.executeUpdate("insert into employee values(3,'C','Chennai')");
        System.out.println("Data inserted successfully");
    }

    public void deleteData() throws SQLException {
        stmt.executeUpdate("delete from employee where id=3");
        System.out.println("Data deleted successfully");
    }

    public static void main(String[] args){
        try {
            JdbcConnect jc=new JdbcConnect();
          //  jc.insertData();
          //  jc.updateData();
            jc.deleteData();
            jc.displayData();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
