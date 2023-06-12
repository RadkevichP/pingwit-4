package pl.pingwit.lec_37.point_1;

import org.apache.commons.lang3.RandomUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author Pavel Radkevich
 * @since 10.06.23
 */
public class TransactionExample {

    private static final String URL = "jdbc:postgresql://localhost:5432/pingwit_shop";
    private static final String USERNAME = "pingwit";
    private static final String PASSWORD = "pingwit_password";


    public static void main(String[] args) {
        runTransactionExample();
    }

    private static void runTransactionExample() {

        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            connection.setAutoCommit(false);

            String updateAccountQuery = "UPDATE accounts SET amount = ? WHERE username = ?";
            PreparedStatement updateStatement = connection.prepareStatement(updateAccountQuery);

            updateStatement.setInt(1, 150);
            updateStatement.setString(2, "Alex");

            updateStatement.executeUpdate();
            System.out.println("Updated Alex!");

            if (RandomUtils.nextBoolean()) {
                throw new RuntimeException("пропал свет!");
            }

            updateStatement.setInt(1, 450);
            updateStatement.setString(2,"Ben");
            updateStatement.executeUpdate();

            System.out.println("Updated Ben!");

            connection.commit();


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }
}
