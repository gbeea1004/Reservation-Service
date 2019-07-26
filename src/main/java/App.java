import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import config.ApplicationConfig;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        DataSource dataSource = applicationContext.getBean(DataSource.class);
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
            if (connection != null) {
                System.out.println("접속 성공!!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
