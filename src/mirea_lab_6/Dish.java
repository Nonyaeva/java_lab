package mirea_lab_6;

public abstract class Dish {
    protected String material;
    protected String color;
    Dish(String material, String color) {
        this.material = material;
        this.color = color;
    }
    public abstract void wish();
}


