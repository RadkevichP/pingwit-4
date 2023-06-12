package pl.pingwit.lec_36.point_1;

import pl.pingwit.lec_37.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Pavel Radkevich
 * @since 8.06.23
 */
public class StatementMain {

    // JDBC Java DataBase Connectivity
    private static final String URL = "jdbc:postgresql://localhost:5432/pingwit_shop";
    private static final String USERNAME = "pingwit";
    private static final String PASSWORD = "pingwit_password";

    public static void main(String[] args) {
        runSelectAllQuery();
    }

    public static void runSelectAllQuery() {
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("""
                    CREATE TABLE IF NOT EXISTS public.users2
                    (
                        id bigint NOT NULL,
                        name character varying(200) COLLATE pg_catalog."default" NOT NULL,
                        surname character varying(200) COLLATE pg_catalog."default" NOT NULL,
                        email character varying(100) COLLATE pg_catalog."default" NOT NULL,
                        phone character varying(50) COLLATE pg_catalog."default" NOT NULL,
                        CONSTRAINT users2_pkey PRIMARY KEY (id),
                        CONSTRAINT user2_email_unique UNIQUE (email)
                    )
                    """);

            List<User> users = new ArrayList<>();
            while (rs.next()) {
                User user = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                users.add(user);
            }

            users.forEach(System.out::println);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
