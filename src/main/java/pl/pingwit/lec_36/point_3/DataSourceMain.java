package pl.pingwit.lec_36.point_3;

import com.zaxxer.hikari.HikariDataSource;
import pl.pingwit.lec_37.User;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Pavel Radkevich
 * @since 8.06.23
 */
public class DataSourceMain {

    private static final String URL = "jdbc:postgresql://localhost:5432/pingwit_shop";
    private static final String USERNAME = "pingwit";
    private static final String PASSWORD = "pingwit_password";

    public static void main(String[] args) {
        DataSource dataSource = createDataSource();
        runSelectAllQuery(dataSource);
    }

    public static void runSelectAllQuery(DataSource dataSource) {
        try (Connection connection = dataSource.getConnection()) {
            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery("SELECT * from users");
            statement.getMaxRows();

            List<User> cars = new ArrayList<>();

            while (rs.next()) {
                User user = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                cars.add(user);
            }

            cars.forEach(System.out::println);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static DataSource createDataSource() {
        HikariDataSource ds = new HikariDataSource();
        ds.setJdbcUrl(URL);
        ds.setUsername(USERNAME);
        ds.setPassword(PASSWORD);
        return ds;
    }
}
