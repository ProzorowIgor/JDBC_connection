import java.sql.*;

public class MyJDBC {
    public static void main(String[] args) {

        try {
          //  Class.forName("lib/com.mysql/jdbc/Driver");

            Connection connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/my_first_schema","root","@rogi1987!W");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from people");
         while(resultSet.next()){
             System.out.println(resultSet.getString("id"));
             System.out.println(resultSet.getString("firstName"));
             System.out.println(resultSet.getString("lastName"));
         }
        } catch (SQLException e) {
            e.printStackTrace();
        } /*catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/


    }
}
