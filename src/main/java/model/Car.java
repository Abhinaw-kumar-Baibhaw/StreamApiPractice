package model;


public class Car {

    private int id;

    private String name;

    private String year;

    private String model;

    private int price;

  public Car(){

  }

    public Car(int id, String name, String year, String model, int price) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.model = model;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year='" + year + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
