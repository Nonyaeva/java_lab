package mirea_lab_6;

public abstract class Dog {
    protected String color;
    protected String name;

     public Dog(String color, String name){
        this.color = color;
        this.name = name;
    }

    public abstract void eating();
}