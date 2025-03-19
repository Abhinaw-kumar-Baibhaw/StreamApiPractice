package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcInsertUpdateDelete {
    public static void main(String[] args) {
        String username = "root";
        String password = "Ab@1234567";
        String url = "jdbc:mysql://localhost:3306/abhinaw";

        String insertQuery = "INSERT INTO car (id, name, year, model, price) VALUES (?, ?, ?, ?, ?)";
        String updateQuery = "UPDATE car SET price = ? WHERE id = ?";
        String deleteQuery = "DELETE FROM car WHERE id = ?";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {

            try (PreparedStatement insertStmt = connection.prepareStatement(insertQuery)) {
                insertStmt.setLong(1, 10);
                insertStmt.setString(2, "Tesla");
                insertStmt.setLong(3, 2022);
                insertStmt.setString(4, "Model S");
                insertStmt.setLong(5, 75000);
                int rowsInserted = insertStmt.executeUpdate();
                System.out.println("Rows inserted: " + rowsInserted);
            }

            try (PreparedStatement updateStmt = connection.prepareStatement(updateQuery)) {
                updateStmt.setLong(1, 80000);
                updateStmt.setLong(2, 10);
                int rowsUpdated = updateStmt.executeUpdate();
                System.out.println("Rows updated: " + rowsUpdated);
            }

            try (PreparedStatement deleteStmt = connection.prepareStatement(deleteQuery)) {
                deleteStmt.setLong(1, 10);
                int rowsDeleted = deleteStmt.executeUpdate();
                System.out.println("Rows deleted: " + rowsDeleted);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

