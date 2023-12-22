package mirea_lab_4;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(6, "Yellow");
        Circle c2 = new Circle();
        c1.setRadius(5);
        c2.setColor("Grey");

        System.out.println("c1: " + c1.getRadius() +", "+ c1.getColor());
        System.out.println("c2: " + c2.getRadius() + ", " + c2.getColor());
    }
}
