package sorrawich.week9.db;

import org.apache.derby.jdbc.ClientDataSource;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionManager {
    public static Connection createConnection(String url, String user, String password) throws SQLException {
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println("Database connected");
        return connection;
    }

    public static Connection createConnection(String fileName) throws IOException, SQLException {
        Properties properties = new Properties();
        properties.load(new FileReader(fileName));

        String serverName = properties.getProperty("SERVER_NAME");
        String port = properties.getProperty("SERVER_PORT");
        String dbName = properties.getProperty("DB_NAME");
        String dbUsername = properties.getProperty("DB_USERNAME");
        String dbPassword = properties.getProperty("DB_PASSWORD");

        ClientDataSource clientDataSource = new ClientDataSource();
        clientDataSource.setServerName(serverName);
        clientDataSource.setPortNumber(Integer.parseInt(port));
        clientDataSource.setDatabaseName(dbName);
        clientDataSource.setUser(dbUsername);
        clientDataSource.setPassword(dbPassword);
        Connection connection = clientDataSource.getConnection();

        System.out.println("Database connected.");
        return connection;
    }

    public static void closeConnection(Connection connection) throws SQLException {
        connection.close();
    }
}
