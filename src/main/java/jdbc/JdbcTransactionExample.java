package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcTransactionExample {
    public static void main(String[] args) {
        String username = "root";
        String password = "Ab@1234567";
        String url = "jdbc:mysql://localhost:3306/abhinaw";

        String insertQuery1 = "INSERT INTO car (id, name, year, model, price) VALUES (?, ?, ?, ?, ?)";
        String insertQuery2 = "INSERT INTO car (id, name, year, model, price) VALUES (?, ?, ?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            connection.setAutoCommit(false);

            try (PreparedStatement stmt1 = connection.prepareStatement(insertQuery1)) {
                stmt1.setLong(1, 11);
                stmt1.setString(2, "BMW");
                stmt1.setLong(3, 2023);
                stmt1.setString(4, "X5");
                stmt1.setLong(5, 65000);
                stmt1.executeUpdate();
            }

            try (PreparedStatement stmt2 = connection.prepareStatement(insertQuery2)) {
                stmt2.setLong(1, 12);
                stmt2.setString(2, "Audi");
                stmt2.setLong(3, 2023);
                stmt2.setString(4, "Q7");
                stmt2.setLong(5, 70000);
                stmt2.executeUpdate();
            }

            connection.commit();
            System.out.println("Both records inserted successfully.");

        } catch (Exception e) {
            e.printStackTrace();
            try (Connection connection = DriverManager.getConnection(url,username,password)){
                System.out.println("Transaction failed, rolling back.");
                connection.rollback();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}

