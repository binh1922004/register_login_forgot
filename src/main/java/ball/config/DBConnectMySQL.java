package ball.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectMySQL {
        private static String USERNAME = "root";


        private static String PASSWORD = "10040109";


        private static String DRIVER = "com.mysql.cj.jdbc.Driver";


        private static String URL = "jdbc:mysql://localhost:3306/demo";



        public static Connection getDatabaseConnection() throws SQLException {


                try {
                        Class.forName(DRIVER);
                } catch (ClassNotFoundException e) {


                        // TODO Auto-generated catch block


                        e.printStackTrace();


                }
                return DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }

}
