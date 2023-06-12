package pl.pingwit.lec_37.point_2;

import com.zaxxer.hikari.HikariDataSource;
import pl.pingwit.lec_37.point_2.repository.ProductRepository;
import pl.pingwit.lec_37.point_2.repository.UserRepository;

import javax.sql.DataSource;

/**
 * @author Pavel Radkevich
 * @since 12.06.23
 */
public class PlainJavaMain {

    private static final String URL = "jdbc:postgresql://localhost:5432/pingwit_shop";
    private static final String USERNAME = "pingwit";
    private static final String PASSWORD = "pingwit_password";

    private static DataSource createDataSource() {
        HikariDataSource ds = new HikariDataSource();
        ds.setJdbcUrl(URL);
        ds.setUsername(USERNAME);
        ds.setPassword(PASSWORD);
        return ds;
    }

    public static void main(String[] args) {
        DataSource dataSource = createDataSource();

        UserRepository userRepository = new UserRepository(dataSource);
        ProductRepository productRepository = new ProductRepository(dataSource);

        PingwitShopService pingwitShopService = new PingwitShopService(userRepository, productRepository);

        pingwitShopService.printUsers();
        pingwitShopService.printProducts();
    }
}

// Spring - Dependency Injection framework
// Pivotal
// Spring Boot
