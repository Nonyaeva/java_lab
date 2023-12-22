package mirea_lab_6;

public abstract class Furniture {
    protected String material;
    protected String color;


    public Furniture(String material, String color) {
        this.material = material;
        this.color = color;
    }
    public abstract void fell();
}
