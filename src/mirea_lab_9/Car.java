package mirea_lab_9;

public class Car implements Priceable {
    private String brand;
    private double price;

    public Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return "Car: " + brand + ", Price: " + price;
    }
}
