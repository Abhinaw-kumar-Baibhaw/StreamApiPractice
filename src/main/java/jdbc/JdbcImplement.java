package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcImplement {
    public static void main(String[] args) {
        String username = "root";
        String password = "Ab@1234567";
        String url = "jdbc:mysql://localhost:3306/abhinaw";
        String create = "INSERT INTO car (id,name, year, model, price) VALUES (9,'Arjun', 2023, 'Model X', 25000)";
        String read = "SELECT * from car";
        String upt = "alter table car add column new_price Long";
        String delete = "alter table car drop column new_price";

        try (Connection connection = DriverManager.getConnection(url, username, password);
             PreparedStatement statement = connection.prepareStatement(read);
             ResultSet resultSet = statement.executeQuery()) {
            boolean resultsFound = false;
            while (resultSet.next()) {
                resultsFound = true;
                Long id = resultSet.getLong("id");
                String name = resultSet.getString("name");
                Long year = resultSet.getLong("year");
                String model = resultSet.getString("model");
                Long price = resultSet.getLong("price");
                System.out.println("ID: " + id + ", Name: " + name + ", year: " + year +
                        ", model: " + model + ", price: " + price);
            }
            if (!resultsFound) {
                System.out.println("No results found.");
            }
            try (PreparedStatement statement1 = connection.prepareStatement(upt)) {
                statement1.executeUpdate();
                System.out.println("Table altered successfully.");
            }

            try(PreparedStatement statement2 = connection.prepareStatement(delete)){
                statement2.executeUpdate();
                System.out.println("Table altered successfully.");
            }

            try (PreparedStatement statement3 = connection.prepareStatement(create)){
                statement3.executeUpdate();
                System.out.println("Inserted data successfully");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
