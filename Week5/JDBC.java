import com.mysql.cj.jdbc.JdbcConnection;
import com.mysql.cj.jdbc.Driver;
import com.google.protobuf.Message;
import java.text.MessageFormat;
import java.util.logging.LoggingPermission;
import java.sql.*;

public class JDBC {
    private  static Connection connection = null;
    private static PreparedStatement statement = null;
    private static String url ="jdbc:mysql://localhost:3306/automarket";
    private static String username = "root";
    private static String password ="password";
    private static int rows;

    public static void main(String[] args) throws SQLException {
        try {
            AddCars("BMB", "White", "samurai", 3.5, 30000.00);
            AddCars("Mercedes", "Blue","Kaban", 5.5, 100000.00);
            AddCars("Mazda", "Green", "RX7",2.5, 15000.00);

            selectCars();

            updateСars(2, "BMB");

            selectCars();

            deleteCars(1);
            deleteCars(2);

            selectCars();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    private static void connectiondb(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url,username, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();

        }
    }
    private static void AddCars(String CarName, String Color, String CarModel,double EngineSize, double Price) throws SQLException {
        try {
            connectiondb();
            statement = connection.prepareStatement("insert into Cars (CarName ,Color ,CarModel ,EngineSize  ,Price) values(?,?,?,?,?)");
            statement.setString(1, CarName);
            statement.setString(2, Color);
            statement.setString(3, CarModel);
            statement.setDouble(4, EngineSize);
            statement.setDouble(5, Price);
            rows = statement.executeUpdate();
            System.out.println(" rows added " + rows);
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private static void selectCars(){
        try {
            connectiondb();
            Statement statement = connection.createStatement();
            ResultSet resultSet= statement.executeQuery("select * from Cars");
            while (resultSet.next()){
                int ID= resultSet.getInt(1);
                String CarName = resultSet.getString(2);
                String Color = resultSet.getString(3);
                String CarModel = resultSet.getString(4);
                double EngineSize = resultSet.getDouble(5);
                double Price = resultSet.getDouble(6);
                System.out.printf("%d  %s  %s  %s  %f  %f \n",ID,CarName,Color,CarModel,EngineSize,Price);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        finally {
            try {
                if (statement!=null){
                    statement.close();
                }
            }
            catch (SQLException e){
                e.printStackTrace();
            }
            try{
                if(connection!=null){
                    connection.close();
                }
            }
            catch (SQLException e){
                e.printStackTrace();
            }
        }
    }

    private  static void updateСars(int ID, String CarName){
        try {
            connectiondb();
            statement  = connection.prepareStatement("update Cars set CarName = ? where ID = ?");
            statement.setString(1,CarName);
            statement.setInt(2,ID);
            rows = statement.executeUpdate();
            System.out.printf("%d rows updated \n", rows);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private static void deleteCars(int ID){
        try {
            connectiondb();
            statement = connection.prepareStatement("delete from Cars where ID = ?");
            statement.setInt(1, ID);
            rows = statement.executeUpdate();
            System.out.printf("%d rows deleted \n", rows);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}