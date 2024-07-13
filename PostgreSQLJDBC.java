import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class PostgreSQLJDBC {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/mydatabase"; // Replace 'mydatabase' with your database name
        String user = "postgres"; // Replace with your PostgreSQL username
        String password = ""; // Replace with your PostgreSQL password

        try {
            // Load the PostgreSQL driver
            Class.forName("org.postgresql.Driver");

            // Establish the connection
            Connection connection = DriverManager.getConnection(url, user, password);

            // Create a statement object
            Statement statement = connection.createStatement();

            // Execute a query
            ResultSet resultSet = statement.executeQuery("SELECT version()");

            // Process the result set
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1));
            }

            // Close the resources
            resultSet.close();
            statement.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
