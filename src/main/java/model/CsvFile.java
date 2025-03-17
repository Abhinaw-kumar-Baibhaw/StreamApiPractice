package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class CsvFile {

    public void fetch() {
        String path = "C:\\Users\\abhin\\OneDrive\\Desktop\\csvfile.csv";
        List<Car> carList = new ArrayList<>();
        Map<String, Integer> h = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String headerLine = reader.readLine();
            if (headerLine == null) {
                throw new RuntimeException("CSV file is empty");
            }

            String[] headers = headerLine.split(",");
            for (int i = 0; i < headers.length; i++) {
                h.put(headers[i].trim(), i);
            }

            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");

                int id = Integer.parseInt(values[h.get("id")].trim());
                String name = values[h.get("name")].trim();
                String year = values[h.get("year")].trim();
                String model = values[h.get("model")].trim();
                int price = Integer.parseInt(values[h.get("price")].trim());
                carList.add(new Car(id, name, year, model, price));
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        System.out.println("id\t\tname\t\tyear\t\tmodel\t\tprice");
        carList.forEach(car -> System.out.printf("%d\t\t%s\t\t%s\t\t%s\t\t%d%n",
                car.getId(), car.getName(), car.getYear(), car.getModel(), car.getPrice()));

        carList.stream()
                .collect(Collectors.groupingBy(Car::getYear))
                .forEach((year, cars) -> {
                    System.out.println("\nCars for the year " + year + ":");
                    cars.forEach(car -> System.out.printf("%d\t\t%s\t\t%s\t\t%s\t\t%d%n",
                            car.getId(), car.getName(), car.getYear(), car.getModel(), car.getPrice()));
                });

        Car costly = carList.stream().max(Comparator.comparing(Car::getPrice))
                .orElseThrow(() -> new RuntimeException("No car available"));
        System.out.println("\nCostliest car: " + costly);



        Car oldest = carList.stream().min(Comparator.comparing(Car::getYear))
                .orElseThrow(() -> new RuntimeException("There is no data"));
        System.out.println("Oldest Car: " + oldest);
    }
}

