package pl.pingwit.lec_36.point_2;

import pl.pingwit.lec_37.User;

import java.sql.*;

/**
 * @author Pavel Radkevich
 * @since 8.06.23
 */
public class PreparedStatementMain {

    private static final String URL = "jdbc:postgresql://localhost:5432/pingwit_shop";
    private static final String USERNAME = "pingwit";
    private static final String PASSWORD = "pingwit_password";

    public static void main(String[] args) {

        // sql injection
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            User pupkin = new User(155, "Biba", "Pupkin", "ppp@gmail.com", "9875655");
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO users (id, name, surname, email, phone) VALUES (? , ?, ?, ?, ?)");

            preparedStatement.setInt(1, pupkin.id());
            preparedStatement.setString(2, pupkin.name());
            preparedStatement.setString(3, pupkin.surname());
            preparedStatement.setString(4, pupkin.email());
            preparedStatement.setString(5, pupkin.phone());

            preparedStatement.executeUpdate();


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
