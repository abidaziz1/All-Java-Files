import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTableExample {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/mydatabase";
        String user = "postgres";
        String password = "Abid678@";

        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();

            String createTableSQL = "CREATE TABLE IF NOT EXISTS employee (" +
                                    "id SERIAL PRIMARY KEY, " +
                                    "name VARCHAR(100) NOT NULL, " +
                                    "position VARCHAR(50) NOT NULL, " +
                                    "salary NUMERIC(15, 2) NOT NULL)";

            statement.executeUpdate(createTableSQL);
            System.out.println("Table 'employee' created successfully!");

            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

//It seems that running the commands directly in PowerShell works fine, but running from VSCode causes issues with the classpath.
// PS C:\Users\USER\OneDrive\Desktop\Web Browser\java> javac -cp ".;lib/postgresql-42.7.3.jar" CreateTableExample.java
// PS C:\Users\USER\OneDrive\Desktop\Web Browser\java> java -cp ".;lib/postgresql-42.7.3.jar" CreateTableExample
// Table 'employee' created successfully!
