package mirea_lab_5;

public class Test {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "Red", false);
        System.out.println(s1);
        System.out.println("Площадь фигуры_1: " + s1.getArea());
        System.out.println("Периметр фигуры_1: " + s1.getPerimeter());
        System.out.println("Цвет фигуры_1: " + s1.getColor());
        System.out.println("Заполнение фигуры_1" + s1.isFilled());

        Circle c1 = (Circle)s1;
        System.out.println("\n");
        System.out.println( c1);
        System.out.println("Площадь фигуры_2: " +c1.getArea());
        System.out.println("Периметр фигуры_2: " + c1.getPerimeter());
        System.out.println("Цвет фигуры_1: " + c1.getColor());
        System.out.println("Заполнение фигуры_1" + c1.isFilled());
        System.out.println("Радиус с1: " + c1.getRadius());

        Shape s2 = new Rectangle(1.0, 2.0, "Red", false);
        System.out.println("\n");
        System.out.println(s2);
        System.out.println("Площадь фигуры_3:" + s2.getArea());
        System.out.println("Периметр фигуры_3: "+s2.getPerimeter());
        System.out.println("Цвет фигуры_3: "+s2.getColor());

        Rectangle r1 = (Rectangle)s2;
        System.out.println("\n");
        System.out.println(r1);
        System.out.println("Площадь фигуры_4:"+ r1.getArea());
        System.out.println("Цвет фигуры_4: "+r1.getColor());

        Shape s3 = new Square(6.6);
        System.out.println("\n");
        System.out.println(s3);
        System.out.println("Площадь фигуры_5:"+s3.getArea());
        System.out.println("Цвет фигуры_5: "+s3.getColor());

        Rectangle r2 = (Rectangle)s3;
        System.out.println("\n");
        System.out.println(r2);
        System.out.println("Площадь фигуры_6:"+r2.getArea());
        System.out.println("Цвет фигуры_6: "+r2.getColor());

        Square sq1 = (Square)r2;
        System.out.println("\n");
        System.out.println(sq1);
        System.out.println("Площадь фигуры_7:" +sq1.getArea());
        System.out.println("Цвет фигуры_7: "+sq1.getColor());

    }
}
